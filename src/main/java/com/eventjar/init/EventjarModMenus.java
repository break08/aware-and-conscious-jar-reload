package com.eventjar.init;
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */

import com.eventjar.Eventjar;
import com.eventjar.world.inventory.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class EventjarModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, Eventjar.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<AreyouwillingtoshareyourpersonalnformationwithusMenu>> AREYOUWILLINGTOSHAREYOURPERSONALNFORMATIONWITHUS = REGISTRY.register("areyouwillingtoshareyourpersonalnformationwithus",
			() -> IMenuTypeExtension.create(AreyouwillingtoshareyourpersonalnformationwithusMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test1Menu>> TEST_1 = REGISTRY.register("test_1", () -> IMenuTypeExtension.create(Test1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test2Menu>> TEST_2 = REGISTRY.register("test_2", () -> IMenuTypeExtension.create(Test2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MurderMenu>> MURDER = REGISTRY.register("murder", () -> IMenuTypeExtension.create(MurderMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Murders100Menu>> MURDERS_100 = REGISTRY.register("murders_100", () -> IMenuTypeExtension.create(Murders100Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test3Menu>> TEST_3 = REGISTRY.register("test_3", () -> IMenuTypeExtension.create(Test3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test4Menu>> TEST_4 = REGISTRY.register("test_4", () -> IMenuTypeExtension.create(Test4Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test5Menu>> TEST_5 = REGISTRY.register("test_5", () -> IMenuTypeExtension.create(Test5Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test6Menu>> TEST_6 = REGISTRY.register("test_6", () -> IMenuTypeExtension.create(Test6Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test7Menu>> TEST_7 = REGISTRY.register("test_7", () -> IMenuTypeExtension.create(Test7Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test8Menu>> TEST_8 = REGISTRY.register("test_8", () -> IMenuTypeExtension.create(Test8Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test9Menu>> TEST_9 = REGISTRY.register("test_9", () -> IMenuTypeExtension.create(Test9Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test10Menu>> TEST_10 = REGISTRY.register("test_10", () -> IMenuTypeExtension.create(Test10Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test11Menu>> TEST_11 = REGISTRY.register("test_11", () -> IMenuTypeExtension.create(Test11Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test12Menu>> TEST_12 = REGISTRY.register("test_12", () -> IMenuTypeExtension.create(Test12Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test13Menu>> TEST_13 = REGISTRY.register("test_13", () -> IMenuTypeExtension.create(Test13Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test14Menu>> TEST_14 = REGISTRY.register("test_14", () -> IMenuTypeExtension.create(Test14Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test15Menu>> TEST_15 = REGISTRY.register("test_15", () -> IMenuTypeExtension.create(Test15Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test16Menu>> TEST_16 = REGISTRY.register("test_16", () -> IMenuTypeExtension.create(Test16Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test17Menu>> TEST_17 = REGISTRY.register("test_17", () -> IMenuTypeExtension.create(Test17Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test18Menu>> TEST_18 = REGISTRY.register("test_18", () -> IMenuTypeExtension.create(Test18Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test19Menu>> TEST_19 = REGISTRY.register("test_19", () -> IMenuTypeExtension.create(Test19Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Test20Menu>> TEST_20 = REGISTRY.register("test_20", () -> IMenuTypeExtension.create(Test20Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CardDataMenu>> CARD_DATA = REGISTRY.register("card_data", () -> IMenuTypeExtension.create(CardDataMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ConfigMenu>> CONFIG = REGISTRY.register("config", () -> IMenuTypeExtension.create(ConfigMenu::new));
}
