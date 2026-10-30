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

package dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Api.rune.ArcheryRune;
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Isa;



/**
 * Isa
 * • ᛁ — Isa (이사)
	• 뜻: 얼음 (Ice)
	• 상징: 모든 것을 얼리는 추위, 정지, 정체, 차가움, 보존, 감정의 억제
 */
public class ArcheryIsa extends Isa implements ArcheryRune {

    
    public ArcheryIsa() {
        super("Archery_");
    }

    @Override
    public void onBow() {
        // 
    }

    @Override
    public void onArrow() {
        //적중한 대상 5초 움직임 고정
    }

}