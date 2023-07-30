package net.lewmc.lewmod;

import net.fabricmc.api.ClientModInitializer;
import net.lewmc.lewmod.item.ModItems;

import net.lewmc.lewmod.item.client.ToughLeatherArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import static net.lewmc.lewmod.item.ModItems.*;

public class LewModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerArmorRenderer(new ToughLeatherArmorRenderer(), TOUGH_LEATHER_BOOTS,
                TOUGH_LEATHER_LEGGINGS, TOUGH_LEATHER_CHESTPLATE, TOUGH_LEATHER_HELMET);
    }
}
