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


package dev.rdf453.RuneCraft.Registry;

import java.util.HashMap;
import java.util.Map;

import dev.rdf453.RuneCraft.Api.rune.IRune;

public class RuneRegistry {
    private static final Map<String, IRune> RUNES = new HashMap<>();

    public static void register(IRune rune) {
        String id = rune.getRuneId();
        if (RUNES.putIfAbsent(id, rune) != null) {
            throw new IllegalStateException("Duplicate rune id: " + id);
        }
    }

    public static IRune get(String id) {
        IRune rune = RUNES.get(id);
        if (rune == null) {
            throw new IllegalArgumentException("Unknown rune id: " + id);
        }
        return rune;
    }

    public static void register(IRune...runes) {
        for (IRune iRune : runes) {
            register(iRune);
        }
    }
}
