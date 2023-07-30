package net.lewmc.lewmod.item.client;

import net.lewmc.lewmod.item.custom.ToughLeatherArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ToughLeatherArmorRenderer extends GeoArmorRenderer<ToughLeatherArmorItem> {
    public ToughLeatherArmorRenderer() {
        super(new ToughLeatherArmorModel());

        this.headBone = "helmet";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";

    }
}
