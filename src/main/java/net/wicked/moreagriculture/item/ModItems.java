package net.wicked.moreagriculture.item;

import net.wicked.moreagriculture.MoreAgriculture;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreAgriculture.MOD_ID);

    public static final RegistryObject<Item> SUNFLOWER_SEED = ITEMS.register("sunflower_seed",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("sunflower_seed"))
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(2f)
                            .build()
                    )
            )
    );

    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }

    public static DeferredRegister<Item> getMaterialItems() {
        return ITEMS;
    }
}