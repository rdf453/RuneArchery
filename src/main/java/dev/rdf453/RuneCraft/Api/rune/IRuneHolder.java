/*
 * This file is part of RuneCraft.
 * Copyright (c) 2026, rdf453.
 *
 * Licensed under the MIT License. See LICENSE_API.txt in the project root
 * for license information.
 */

package dev.rdf453.RuneCraft.Api.rune;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.item.ItemStack;

public interface IRuneHolder {

    List<String> getAppliedRunes(ItemStack item);

    static void addRune(IRune rune, ItemStack item) {
    }

    static void removeRune(int index, ItemStack item) {
    }

    /**
     * Maximum runes that can be enchanted
     *
     * 
     * @return
     */
    
}
