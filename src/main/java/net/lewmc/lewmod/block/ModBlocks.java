package net.lewmc.lewmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lewmc.lewmod.LewMod;
import net.lewmc.lewmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block ARCANE_BLOCK = registerBlock("arcane_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).luminance(5).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.LEWMODTAB);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(LewMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(LewMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        LewMod.LOGGER.debug("Registering ModBlocks for " + LewMod.MOD_ID);
    }
}
