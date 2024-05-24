package net.ddns.spahatticraft.catalyst.util;

import net.ddns.spahatticraft.catalyst.CATALYST;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Blocks {
            public static final TagKey<Block> NEEDS_BIRITHIUM_TOOL = tag("needs_birithium_tool");
        public static final TagKey<Block> NEEDS_DRACITE_TOOL = tag("needs_dracite_tool");
            private static TagKey<Block> tag(String name) {
                return BlockTags.create(new ResourceLocation(CATALYST.MODID, name));
            }
    }
    public static class Items {

    }
}
