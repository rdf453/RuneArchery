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

package dev.rdf453.RuneCraft.common;



import java.util.Locale;

import dev.rdf453.RuneCraft.Api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.Api.rune.IRune;
import net.minecraft.network.chat.Component;

public abstract class BaseRune implements IRune{
    protected final ERuneTier runeTier;
    protected final String runeId;
    protected final String symbol;


    public BaseRune (String RuneId,String Symbol, ERuneTier tier) {
        this.symbol = Symbol;
        this.runeId = RuneId.toLowerCase(Locale.ROOT);
        this.runeTier = tier;
    }

    public Component getDisplayName() {
        return Component.translatable(
            "rune.runecraft."+runeId.toLowerCase(Locale.ROOT)
        );
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public String getRuneId() {
        return runeId;
    }
    
    @Override
    public ERuneTier getTier() {
        return runeTier;
    }

    public int getManaCost() {
        return this.runeTier.getMana();
    }
    

}
