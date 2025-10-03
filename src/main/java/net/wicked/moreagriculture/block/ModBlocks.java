package net.wicked.moreagriculture.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wicked.moreagriculture.MoreAgriculture;

import java.util.List;
import java.util.stream.Stream;

public class ModBlocks {
    private static final String MODID = MoreAgriculture.MOD_ID;
    private static final DeferredRegister<Block> BUILDING_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> BUILDING_BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static DeferredRegister<Block> getBuildingBlocks() {return BUILDING_BLOCKS;}
    public static DeferredRegister<Item> getBuildingBlockItems() {return BUILDING_BLOCK_ITEMS;}

    public static Stream<Block> getAllBlocks() {
        var blockRegistries = List.of(BUILDING_BLOCKS);
        Stream<Block> out = Stream.empty();
        for (DeferredRegister<Block> registry : blockRegistries) {
            out = Stream.concat(out, registry.getEntries().stream().map(RegistryObject::get));
        }
        return out;
    }
}
