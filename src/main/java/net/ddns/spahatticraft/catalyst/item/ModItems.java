package net.ddns.spahatticraft.catalyst.item;


import net.ddns.spahatticraft.catalyst.CATALYST;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CATALYST.MODID);

    public static final RegistryObject<Item> BIRITHIUM = ITEMS.register("birithium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEEKER_EYE = ITEMS.register("seeker_eye", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_CAKE = ITEMS.register("seeker_cake", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_FLESH = ITEMS.register("seeker_flesh", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_APPLE = ITEMS.register("seeker_apple", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFECTED_GAPPLE = ITEMS.register("seeker_golden_apple", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRITHIUM_BROADSWORD = ITEMS.register("birithium_broadsword", () -> new SwordItem(ModToolTiers.BIRITHIUM, 6, 2,  new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
