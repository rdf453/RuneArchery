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
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Nauthiz;


/**
 * Nauthiz
 * • ᚾ — Nauthiz (나우디즈)
	• 뜻: 결핍 / 필요 (Need / Distress)
	• 상징: 끈기로 버텨야 하는 궁핍함, 구속, 인내, 생존 의지, 운명적 한계
 */
public class ArcheryNauthiz extends Nauthiz implements ArcheryRune {

    public ArcheryNauthiz() {
        super("Archery_");
    }

    @Override
    public void onBow() {
    }

    @Override
    public void onArrow() {
    }
}