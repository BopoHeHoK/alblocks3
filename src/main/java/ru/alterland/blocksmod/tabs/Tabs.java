package ru.alterland.blocksmod.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Tabs {

    public static class ColorGroup extends ItemGroup {
        public ColorGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.WHITE_CONCRETE.getDefaultInstance();
        }
    }
    public static class RockGroup extends ItemGroup{
        public RockGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.STONE.getDefaultInstance();
        }
    }

    public static class BricksGroup extends ItemGroup{
        public BricksGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.BRICKS.getDefaultInstance();
        }
    }

    public static class RoofGroup extends ItemGroup{
        public RoofGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.OAK_WOOD.getDefaultInstance();
        }
    }

    public static class WoodGroup extends ItemGroup{
        public WoodGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.OAK_WOOD.getDefaultInstance();
        }
    }

    public static class DecorGroup extends ItemGroup{
        public DecorGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.TERRACOTTA.getDefaultInstance();
        }
    }

    public static class RoadGroup extends ItemGroup {
        public RoadGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return Items.GRAY_CONCRETE.getDefaultInstance();
        }
    }
}
