
package net.mcreator.randomstuff.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

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

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
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

		return builder;
	}

}
