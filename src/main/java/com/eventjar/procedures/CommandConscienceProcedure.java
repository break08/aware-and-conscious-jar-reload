package com.eventjar.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.eventjar.init.EventjarModMobEffects;

public class CommandConscienceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(EventjarModMobEffects.CONSCIENCE.get(), 6000, 1));
	}
}
