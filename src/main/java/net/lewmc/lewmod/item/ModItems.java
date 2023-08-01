package net.lewmc.lewmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lewmc.lewmod.LewMod;
import net.lewmc.lewmod.item.custom.ShinyCoinItem;
import net.lewmc.lewmod.item.custom.ToughLeatherArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SHADED_LEATHER = registerItem("shaded_leather",
            new Item(new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item HARDENED_LEATHER = registerItem("hardened_leather",
            new Item(new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item TOUGH_LEATHER_HELMET = registerItem("tough_leather_helmet",
            new ToughLeatherArmorItem(ModArmorMaterials.TOUGH_LEATHER, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item TOUGH_LEATHER_CHESTPLATE = registerItem("tough_leather_chestplate",
            new ToughLeatherArmorItem(ModArmorMaterials.TOUGH_LEATHER, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item TOUGH_LEATHER_LEGGINGS = registerItem("tough_leather_leggings",
            new ToughLeatherArmorItem(ModArmorMaterials.TOUGH_LEATHER, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item TOUGH_LEATHER_BOOTS = registerItem("tough_leather_boots",
            new ToughLeatherArmorItem(ModArmorMaterials.TOUGH_LEATHER, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item ARCANE_SHARD = registerItem("arcane_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LEWMODTAB)));
    public static final Item SHINY_COIN = registerItem("shiny_coin",
            new ShinyCoinItem(new FabricItemSettings().group(ModItemGroup.LEWMODTAB).maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LewMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LewMod.LOGGER.debug("Registering Mod Items for " + LewMod.MOD_ID);
    }
}
