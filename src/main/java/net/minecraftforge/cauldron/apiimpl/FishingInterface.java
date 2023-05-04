package net.minecraftforge.cauldron.apiimpl;

import com.google.common.base.Predicate;
import net.minecraftforge.cauldron.api.Fishing;
import net.minecraftforge.cauldron.api.WeightedRandomFishable;
import org.bukkit.Material;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

/**
 * Forge's FishingHooks were not added until 1.7.
 */
public class FishingInterface implements Fishing {

    @Override
    public void addFish(WeightedRandomFishable fish) {
    }

    @Override
    public void addJunk(WeightedRandomFishable fish) {
    }

    @Override
    public void addTreasure(WeightedRandomFishable fish) {
    }

    @Override
    public void removeMatchingFish(Predicate<WeightedRandomFishable> test) {
    }

    @Override
    public void removeMatchingJunk(Predicate<WeightedRandomFishable> test) {
    }

    @Override
    public void removeMatchingTreasure(Predicate<WeightedRandomFishable> test) {
    }

    @Override
    public ItemStack getRandomFishable(Random rand, float baseChance, int fishingLuckEnchantmentLevel, int fishingSpeedEnchantmentLevel) {
        if (rand.nextDouble() < baseChance) {
            return new ItemStack(Material.RAW_FISH);
        } else {
            return null;
        }
    }
}
