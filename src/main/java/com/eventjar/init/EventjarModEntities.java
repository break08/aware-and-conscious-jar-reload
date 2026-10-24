package com.eventjar.init;
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.eventjar.Eventjar.MODID;
import com.eventjar.entity.*;

@EventBusSubscriber(modid = MODID)
public class EventjarModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MeetboyEntity>> MEETBOY = register("meetboy",
			EntityType.Builder.<MeetboyEntity>of(MeetboyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhoamiEntity>> WHOAMI = register("whoami",
			EntityType.Builder.<WhoamiEntity>of(WhoamiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ErrundefineEntity>> ERRUNDEFINE = register("errundefine", EntityType.Builder.<ErrundefineEntity>of(ErrundefineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(500).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Entity000125Entity>> ENTITY_000125 = register("entity_000125", EntityType.Builder.<Entity000125Entity>of(Entity000125Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EntitywhowatchyouEntity>> ENTITYWHOWATCHYOU = register("entitywhowatchyou", EntityType.Builder.<EntitywhowatchyouEntity>of(EntitywhowatchyouEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EntityCentipedeEntity>> ENTITY_CENTIPEDE = register("entity_centipede", EntityType.Builder.<EntityCentipedeEntity>of(EntityCentipedeEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Lixis9Entity>> LIXIS_9 = register("lixis_9",
			EntityType.Builder.<Lixis9Entity>of(Lixis9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RageThen60sEntity>> RAGE_THEN_60S = register("rage_then_60s", EntityType.Builder.<RageThen60sEntity>of(RageThen60sEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeetboyfastEntity>> MEETBOYFAST = register("meetboyfast", EntityType.Builder.<MeetboyfastEntity>of(MeetboyfastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaretakerEntity>> CARETAKER = register("caretaker", EntityType.Builder.<CaretakerEntity>of(CaretakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000)
			.setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));

	public static final DeferredHolder<EntityType<?>, EntityType<PlayerEntity>> PLAYER = register("player",
			EntityType.Builder.<PlayerEntity>of(PlayerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyesEntity>> EYES = register("eyes",
			EntityType.Builder.<EyesEntity>of(EyesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyeEntity>> EYE = register("eye",
			EntityType.Builder.<EyeEntity>of(EyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CavemeetboyEntity>> CAVEMEETBOY = register("cavemeetboy", EntityType.Builder.<CavemeetboyEntity>of(CavemeetboyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<InvisibleWeirdEntityEntity>> INVISIBLE_WEIRD_ENTITY = register("invisible_weird_entity", EntityType.Builder.<InvisibleWeirdEntityEntity>of(InvisibleWeirdEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NoiseEntityEntity>> NOISE_ENTITY = register("noise_entity", EntityType.Builder.<NoiseEntityEntity>of(NoiseEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<InvisibleDistEntity>> INVISIBLE_DIST = register("invisible_dist", EntityType.Builder.<InvisibleDistEntity>of(InvisibleDistEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeekerEntity>> SEEKER = register("seeker",
			EntityType.Builder.<SeekerEntity>of(SeekerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(3000).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeekeractEntity>> SEEKERACT = register("seekeract", EntityType.Builder.<SeekeractEntity>of(SeekeractEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000)
			.setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WatcherEntity>> WATCHER = register("watcher",
			EntityType.Builder.<WatcherEntity>of(WatcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));

	public static final DeferredHolder<EntityType<?>, EntityType<MeetboyLongEntity>> MEETBOY_LONG = register("meetboy_long",
			EntityType.Builder.<MeetboyLongEntity>of(MeetboyLongEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64)
					.setUpdateInterval(3)
					.fireImmune()
					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FaultEntity>> FAULT = register("fault",
			EntityType.Builder.<FaultEntity>of(FaultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScavengerEntity>> SCAVENGER = register("scavenger",
			EntityType.Builder.<ScavengerEntity>of(ScavengerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeatboydistortedEntity>> MEATBOYDISTORTED = register("meatboydistorted", EntityType.Builder.<MeatboydistortedEntity>of(MeatboydistortedEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyesindarkEntity>> EYESINDARK = register("eyesindark",
			EntityType.Builder.<EyesindarkEntity>of(EyesindarkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SonOfgodEntity>> SON_OFGOD = register("son_ofgod",
			EntityType.Builder.<SonOfgodEntity>of(SonOfgodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DefaultVillagerEntity>> DEFAULT_VILLAGER = register("default_villager",
			EntityType.Builder.<DefaultVillagerEntity>of(DefaultVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3)
					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScaryDefaultVillagerEntity>> SCARY_DEFAULT_VILLAGER = register("scary_default_villager",
			EntityType.Builder.<ScaryDefaultVillagerEntity>of(ScaryDefaultVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3)
					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MeetboyEntity.init();
			WhoamiEntity.init();
			ErrundefineEntity.init();
			Entity000125Entity.init();
			EntitywhowatchyouEntity.init();
			EntityCentipedeEntity.init();
			Lixis9Entity.init();
			RageThen60sEntity.init();
			MeetboyfastEntity.init();
			CaretakerEntity.init();
			PlayerEntity.init();
			EyesEntity.init();
			EyeEntity.init();
			CavemeetboyEntity.init();
			InvisibleWeirdEntityEntity.init();
			NoiseEntityEntity.init();
			InvisibleDistEntity.init();
			SeekerEntity.init();
			SeekeractEntity.init();
			WatcherEntity.init();
			MeetboyLongEntity.init();
			FaultEntity.init();
			ScavengerEntity.init();
			MeatboydistortedEntity.init();
			EyesindarkEntity.init();
			SonOfgodEntity.init();
			DefaultVillagerEntity.init();
			ScaryDefaultVillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MEETBOY.get(), MeetboyEntity.createAttributes().build());
		event.put(WHOAMI.get(), WhoamiEntity.createAttributes().build());
		event.put(ERRUNDEFINE.get(), ErrundefineEntity.createAttributes().build());
		event.put(ENTITY_000125.get(), Entity000125Entity.createAttributes().build());
		event.put(ENTITYWHOWATCHYOU.get(), EntitywhowatchyouEntity.createAttributes().build());
		event.put(ENTITY_CENTIPEDE.get(), EntityCentipedeEntity.createAttributes().build());
		event.put(LIXIS_9.get(), Lixis9Entity.createAttributes().build());
		event.put(RAGE_THEN_60S.get(), RageThen60sEntity.createAttributes().build());
		event.put(MEETBOYFAST.get(), MeetboyfastEntity.createAttributes().build());
		event.put(CARETAKER.get(), CaretakerEntity.createAttributes().build());
		event.put(PLAYER.get(), PlayerEntity.createAttributes().build());
		event.put(EYES.get(), EyesEntity.createAttributes().build());
		event.put(EYE.get(), EyeEntity.createAttributes().build());
		event.put(CAVEMEETBOY.get(), CavemeetboyEntity.createAttributes().build());
		event.put(INVISIBLE_WEIRD_ENTITY.get(), InvisibleWeirdEntityEntity.createAttributes().build());
		event.put(NOISE_ENTITY.get(), NoiseEntityEntity.createAttributes().build());
		event.put(INVISIBLE_DIST.get(), InvisibleDistEntity.createAttributes().build());
		event.put(SEEKER.get(), SeekerEntity.createAttributes().build());
		event.put(SEEKERACT.get(), SeekeractEntity.createAttributes().build());
		event.put(WATCHER.get(), WatcherEntity.createAttributes().build());
		event.put(MEETBOY_LONG.get(), MeetboyLongEntity.createAttributes().build());
		event.put(FAULT.get(), FaultEntity.createAttributes().build());
		event.put(SCAVENGER.get(), ScavengerEntity.createAttributes().build());
		event.put(MEATBOYDISTORTED.get(), MeatboydistortedEntity.createAttributes().build());
		event.put(EYESINDARK.get(), EyesindarkEntity.createAttributes().build());
		event.put(SON_OFGOD.get(), SonOfgodEntity.createAttributes().build());
		event.put(DEFAULT_VILLAGER.get(), DefaultVillagerEntity.createAttributes().build());
		event.put(SCARY_DEFAULT_VILLAGER.get(), ScaryDefaultVillagerEntity.createAttributes().build());
	}
}
