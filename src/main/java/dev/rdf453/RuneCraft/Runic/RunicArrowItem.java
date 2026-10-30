/*
 * This file is part of RuneCraft.
 * Copyright (c) 2026, rdf453, All rights reserved.
 *
 * RuneCraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RuneCraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with RuneCraft. If not, see <https://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package dev.rdf453.RuneCraft.Runic;


import java.util.ArrayList;
import java.util.List;

import dev.rdf453.RuneCraft.Api.rune.IRune;
import dev.rdf453.RuneCraft.Api.rune.IRuneHolder;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;

public class RunicArrowItem  extends  ArrowItem implements IRuneHolder {
    List<IRune> AppliedRunes = new ArrayList<>();


    RunicArrowItem(Item.Properties prop) {
        super(prop);
    }
    
    @Override 
    public List<IRune> getAppliedRunes() {
        return AppliedRunes;
    }

    /**Maximum runes that can be enchanted
    *
    * 
    *@return  
    */
    public int getMaxRune() {
        return 3;
    }

    protected boolean isReachedLimit() {
        return AppliedRunes.size() >= getMaxRune();
    }

    public void addRune(IRune rune) {
        if(isReachedLimit()) return ;
            AppliedRunes.add(rune);
    }

    public void removeRune(int index) {
        if(AppliedRunes.size()>0 && index >= 0 && index < AppliedRunes.size()) {
            AppliedRunes.remove(index);
        }
    }

}

//nbt load save 구현 필요