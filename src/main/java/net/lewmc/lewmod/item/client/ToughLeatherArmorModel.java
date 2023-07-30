package net.lewmc.lewmod.item.client;

import net.lewmc.lewmod.LewMod;
import net.lewmc.lewmod.item.custom.ToughLeatherArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToughLeatherArmorModel extends AnimatedGeoModel<ToughLeatherArmorItem> {

    @Override
    public Identifier getModelResource(ToughLeatherArmorItem object) {
        return new Identifier(LewMod.MOD_ID, "geo/tough_leather_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(ToughLeatherArmorItem object) {
        return new Identifier(LewMod.MOD_ID, "textures/models/armor/tough_leather_armor.png");
    }

    @Override
    public Identifier getAnimationResource(ToughLeatherArmorItem animatable) {
        return new Identifier(LewMod.MOD_ID, "animations/armor_animation.json");
    }
}