
package net.mcreator.randomstuff.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QueenElizibethEntity extends Animal {

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.MONSTER)
				.add(new MobSpawnSettings.SpawnerData(RandomStuffModEntities.QUEEN_ELIZIBETH.get(), 20, 4, 4));
	}

	public QueenElizibethEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(RandomStuffModEntities.QUEEN_ELIZIBETH.get(), world);
	}

	public QueenElizibethEntity(EntityType<QueenElizibethEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setCustomName(new TextComponent("The Queen"));
		setCustomNameVisible(true);

		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (QueenElizibethEntity.this.isInWater())
					QueenElizibethEntity.this.setDeltaMovement(QueenElizibethEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !QueenElizibethEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - QueenElizibethEntity.this.getX();
					double dy = this.wantedY - QueenElizibethEntity.this.getY();
					double dz = this.wantedZ - QueenElizibethEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * QueenElizibethEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					QueenElizibethEntity.this.setYRot(this.rotlerp(QueenElizibethEntity.this.getYRot(), f, 10));
					QueenElizibethEntity.this.yBodyRot = QueenElizibethEntity.this.getYRot();
					QueenElizibethEntity.this.yHeadRot = QueenElizibethEntity.this.getYRot();

					if (QueenElizibethEntity.this.isInWater()) {
						QueenElizibethEntity.this.setSpeed((float) QueenElizibethEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						QueenElizibethEntity.this.setXRot(this.rotlerp(QueenElizibethEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(QueenElizibethEntity.this.getXRot() * (float) (Math.PI / 180.0));

						QueenElizibethEntity.this.setZza(f3 * f1);
						QueenElizibethEntity.this.setYya((float) (f1 * dy));
					} else {
						QueenElizibethEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					QueenElizibethEntity.this.setSpeed(0);
					QueenElizibethEntity.this.setYya(0);
					QueenElizibethEntity.this.setZza(0);
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

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 10, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}

		});
		this.goalSelector.addGoal(2, new TemptGoal(this, 10000000, Ingredient.of(Items.TOTEM_OF_UNDYING), false));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 10));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Items.DEBUG_STICK));
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
		if (source.getDirectEntity() instanceof Player)
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
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		QueenElizibethEntityDiesProcedure.execute(

		);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		QueenElizibethEntity retval = RandomStuffModEntities.QUEEN_ELIZIBETH.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(Items.TOTEM_OF_UNDYING).contains(stack.getItem());
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

	public void aiStep() {
		super.aiStep();

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 4; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.5D;
			double dy = (random.nextFloat() - 0.5D) * 0.5D;
			double dz = (random.nextFloat() - 0.5D) * 0.5D;
			world.addParticle(ParticleTypes.SOUL, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		SpawnPlacements.register(RandomStuffModEntities.QUEEN_ELIZIBETH.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 100);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);

		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);

		return builder;
	}

}
