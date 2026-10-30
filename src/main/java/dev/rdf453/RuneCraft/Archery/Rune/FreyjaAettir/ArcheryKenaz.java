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

package dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Api.rune.ArcheryRune;
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Kenaz;



/**
 * Kenaz
 */
public class ArcheryKenaz extends Kenaz implements ArcheryRune {

    
    public ArcheryKenaz() {
        super("Archery_");
    }

    @Override
    public void onBow() {
        //움직이는 빛 싸개-차징중 주변 빛 15로 고정
        //패시브: 소지시 야광투시 부여
    }

    @Override
    public void onArrow() {
        //명중시 발광(Effect Glow) 부여
    }

    
}