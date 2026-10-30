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
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Algiz;



/**
 * Algiz
 */
public class ArcheryAlgiz extends Algiz implements ArcheryRune {

    
    public ArcheryAlgiz() {
        super("Archery_");
    }

    @Override
    public void onBow() {
        //차징중 날라오는 모든 투사체 삭제 로 아이아스!!!
        //
    }

    @Override
    public void onArrow() {
        //맞은 대상 저항 5 5초 부여
    }

    
    
}
//ᛉ — Algiz (알기즈)
//	• 뜻: 엘크 / 보호 (Elk / Protection)
//	• 상징: 맹수를 막아주는 엘크의 뿔, 방어, 장벽, 수호, 영적인 보호