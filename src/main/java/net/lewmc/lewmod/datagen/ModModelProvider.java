package net.lewmc.lewmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lewmc.lewmod.block.ModBlocks;
import net.lewmc.lewmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ARCANE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHADED_LEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHINY_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARCANE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARDENED_LEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOUGH_LEATHER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOUGH_LEATHER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOUGH_LEATHER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOUGH_LEATHER_BOOTS, Models.GENERATED);

    }
}
