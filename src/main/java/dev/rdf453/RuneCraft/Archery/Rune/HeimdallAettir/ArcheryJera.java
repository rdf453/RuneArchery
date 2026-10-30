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
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Jera;


/**
 * Jera
 * • ᛃ — Jera (예라)
	• 뜻: 수확 / 1년 (Year / Harvest)
	• 상징: 시간이 흘러 얻는 결실, 인과응보, 주기적인 반복, 노력의 대가
 */
public class ArcheryJera extends Jera implements ArcheryRune {

    
    public ArcheryJera() {
        super("Archery_");
    }

    @Override
    public void onBow() {
        //차지 시간에 비례한 데미지,사용 마나 증가,받는 데미지 2배 증가
    }

    @Override
    public void onArrow() {
        //룬 발현 반복 1회
    }
    
}