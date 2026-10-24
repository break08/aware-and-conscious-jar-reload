package com.eventjar;

import net.minecraft.server.MinecraftServer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

@Mod(Eventjar.MODID)
public class Eventjar {
    public static final String MODID = "eventjar";

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();


    public static void queueServerWork(int tick, Runnable action) {
        if (action == null) {
            return;
        }
        AbstractMap.SimpleEntry<Runnable, Integer> entry =
                new AbstractMap.SimpleEntry<>(action, Math.max(tick, 1));
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
            workQueue.add(entry);
            return;
        }
        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
        if (server != null) {
            server.execute(() -> workQueue.add(entry));
            return;
        }
        if (FMLEnvironment.dist == Dist.CLIENT) {
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT,
                    () -> () -> net.lixis9.eventjar.client.IntegratedWorkEnqueue.addIfSingleplayer(workQueue, entry));
        } else {
            workQueue.add(entry);
        }
    }

    public Eventjar(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}