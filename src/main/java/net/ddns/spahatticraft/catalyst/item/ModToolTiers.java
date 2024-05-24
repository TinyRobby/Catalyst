package net.ddns.spahatticraft.catalyst.item;

import net.ddns.spahatticraft.catalyst.CATALYST;
import net.ddns.spahatticraft.catalyst.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BIRITHIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3500, 11f, 6f, 18, ModTags.Blocks.NEEDS_BIRITHIUM_TOOL,
                    () -> Ingredient.of(ModItems.BIRITHIUM.get())),
            new ResourceLocation(CATALYST.MODID, "birithium"), List.of(Tiers.NETHERITE), List.of(ModToolTiers.DRACITE));
    public static final Tier DRACITE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 5460, 12.5f, 7.5f, 23, ModTags.Blocks.NEEDS_DRACITE_TOOL,
                    () -> Ingredient.of(ModItems.BIRITHIUM.get())),
            new ResourceLocation(CATALYST.MODID, "dracite"), List.of(ModToolTiers.BIRITHIUM), List.of());
}
