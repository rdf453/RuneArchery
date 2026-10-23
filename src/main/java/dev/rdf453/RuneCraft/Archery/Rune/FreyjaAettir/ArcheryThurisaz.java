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
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Thurisaz;


/**
 * Thurisaz
 */
public class ArcheryThurisaz extends Thurisaz implements ArcheryRune {

    
    public ArcheryThurisaz() {
        super();
    }

    // 투리사즈로 인해 소환된 번개에 파사의 공능 부여
    @Override
    public void onBow() {
        // 차징중 플레이어를 때린 대상에게 벼락

    }

    @Override
    public void onArrow() {
        // 지형지물 무시
    }

}