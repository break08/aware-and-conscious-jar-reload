package com.eventjar.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import com.eventjar.EventjarMod;

public class MeatboydistortedPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EventjarMod.queueServerWork(400, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
