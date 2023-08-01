package net.lewmc.lewmod.item.client;

import net.lewmc.lewmod.item.custom.ToughLeatherArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ToughLeatherArmorRenderer extends GeoArmorRenderer<ToughLeatherArmorItem> {
    public ToughLeatherArmorRenderer() {
        super(new ToughLeatherArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";

    }
}
