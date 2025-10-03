package net.wicked.moreagriculture.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wicked.moreagriculture.item.ModItems;

import java.util.stream.Stream;

public class ThisModelProvider extends ModelProvider {
    public ThisModelProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected Stream<Item> getKnownItems() {
        return ModItems.getAllItems();
    }
    /*
    @Override
    protected Stream<Block> getKnownBlocks() {
        return ExampleBlocks.getAllBlocks();
    }

    @Override
    protected BlockModelGenerators getBlockModelGenerators(BlockStateGeneratorCollector blocks, ItemInfoCollector items, SimpleModelCollector models) {
        return new ExampleBlockModelGenerator(blocks, items, models);
    }

     */

    @Override
    protected ItemModelGenerators getItemModelGenerators(ItemInfoCollector items, SimpleModelCollector models) {
        return new ThisItemModelGenerator(items, models);
    }
}
