package example.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class ExpItems {
    public static Item covalesium;

    public ExpItems() {
    }

    public static void load() {
        covalesium = new Item("covalesium", Color.coral.valueOf("9d8e8e")) {
            {
                this.explosiveness = 0.0F;
                this.flammability = 0.0F;
                this.radioactivity = 0.0F;
                this.charge = 0.0F;
                this.alwaysUnlocked = true;
                this.hardness = 2;
                this.cost = 1.0F;
            }
        };
    }
}