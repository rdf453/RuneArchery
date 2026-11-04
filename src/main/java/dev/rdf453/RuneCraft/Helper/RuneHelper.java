package dev.rdf453.RuneCraft.Helper;

import java.util.List;

import dev.rdf453.RuneCraft.Api.rune.IRune;
import dev.rdf453.RuneCraft.Api.rune.IRuneHolder;
import dev.rdf453.RuneCraft.Registry.RuneDataComponents;
import net.minecraft.world.item.ItemStack;

public class RuneHelper implements IRuneHolder {
    
    
    private RuneHelper() {}

    @Override
    public List<String> getAppliedRunes(ItemStack item) {
        return readRuneIds(item);
    }

    
    public static int getMaxRune(ItemStack item) {
        return item.getOrDefault(RuneDataComponents.MAX_RUNE.get(),3);
    }

    public static void setMaxRune(ItemStack item,int count) {
        item.set(RuneDataComponents.MAX_RUNE, count);
    }

    protected static  boolean isReachedLimit(ItemStack item) {
        return readRuneIds(item).size() >= getMaxRune(item);
    }

    public static void addRune(IRune rune, ItemStack item) {
        List<String> runeIds = readRuneIds(item);
        if (isReachedLimit(item))
            return;
        runeIds.add(rune.getRuneId());
        writeRuneIds(item, runeIds);// 아몰라 내일해
    }

    public static void removeRune(int index, ItemStack item) {
        List<String> runeIds = readRuneIds(item);
        if (runeIds.size() > 0 && index >= 0 && index < runeIds.size()) {
            runeIds.remove(index);
            writeRuneIds(item, runeIds);
        }
    }

    public static void writeRuneIds(ItemStack item, List<String> runeIds) {
        item.set(RuneDataComponents.RUNES.get(), List.copyOf(runeIds));
    }

    public static List<String> readRuneIds(ItemStack stack) {
        return stack.getOrDefault(RuneDataComponents.RUNES.get(),List.of());
    }
}
