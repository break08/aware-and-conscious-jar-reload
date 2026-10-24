package com.eventjar.entity;

import java.util.Map;
import java.util.WeakHashMap;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEvent;

import static com.eventjar.Eventjar.MODID;

@EventBusSubscriber(modid = MODID)
public final class EventjarWalkSoundHandler {

	private static final Map<LivingEntity, Float> ACCUM = new WeakHashMap<>();
	private static final float STEP_DISTANCE = 1.35F;

	private EventjarWalkSoundHandler() {
	}

	@SubscribeEvent
	public static void onLivingTick(LivingEvent event) {
		LivingEntity entity = event.getEntity();
		if (entity.level().isClientSide || !entity.onGround()) {
			return;
		}
		if (!EventjarWalkSounds.shouldReplace(entity)) {
			return;
		}

		Vec3 delta = entity.position().subtract(entity.xOld, entity.yOld, entity.zOld);
		double horizontal = Math.sqrt(delta.x * delta.x + delta.z * delta.z);
		if (horizontal < 0.01D) {
			return;
		}

		float acc = ACCUM.getOrDefault(entity, 0.0F) + (float) horizontal;
		if (acc >= STEP_DISTANCE) {
			acc = 0.0F;
			BlockPos pos = BlockPos.containing(entity.getX(), entity.getY() - 0.2D, entity.getZ());
			EventjarWalkSounds.play(entity, pos, entity.level().getBlockState(pos));
		}
		ACCUM.put(entity, acc);
	}
}
