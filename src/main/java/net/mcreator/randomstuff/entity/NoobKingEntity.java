
package net.mcreator.randomstuff.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.randomstuff.init.RandomStuffModItems;
import net.mcreator.randomstuff.init.RandomStuffModEntities;
import net.mcreator.randomstuff.init.RandomStuffModBlocks;

public class NoobKingEntity extends Monster {
	public NoobKingEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(RandomStuffModEntities.NOOB_KING.get(), world);
	}

	public NoobKingEntity(EntityType<NoobKingEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(RandomStuffModItems.MASTER_SWORD.get()));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(RandomStuffModItems.MASTER_SWORD.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(RandomStuffModItems.RUBIE_NETHERITE_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(RandomStuffModItems.RUBIE_NETHERITE_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(RandomStuffModItems.RUBIE_NETHERITE_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(RandomStuffModItems.RUBIE_NETHERITE_BOOTS.get()));
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (NoobKingEntity.this.isInWater())
					NoobKingEntity.this.setDeltaMovement(NoobKingEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !NoobKingEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - NoobKingEntity.this.getX();
					double dy = this.wantedY - NoobKingEntity.this.getY();
					double dz = this.wantedZ - NoobKingEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * NoobKingEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					NoobKingEntity.this.setYRot(this.rotlerp(NoobKingEntity.this.getYRot(), f, 10));
					NoobKingEntity.this.yBodyRot = NoobKingEntity.this.getYRot();
					NoobKingEntity.this.yHeadRot = NoobKingEntity.this.getYRot();
					if (NoobKingEntity.this.isInWater()) {
						NoobKingEntity.this.setSpeed((float) NoobKingEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						NoobKingEntity.this.setXRot(this.rotlerp(NoobKingEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(NoobKingEntity.this.getXRot() * (float) (Math.PI / 180.0));
						NoobKingEntity.this.setZza(f3 * f1);
						NoobKingEntity.this.setYya((float) (f1 * dy));
					} else {
						NoobKingEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					NoobKingEntity.this.setSpeed(0);
					NoobKingEntity.this.setYya(0);
					NoobKingEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 5, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 5));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(RandomStuffModBlocks.ENCHANTED_DIRT.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 3);
		builder = builder.add(Attributes.MAX_HEALTH, 1001);
		builder = builder.add(Attributes.ARMOR, 100);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10000);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 10);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 3);
		return builder;
	}
}
