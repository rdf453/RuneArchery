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
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Wunjo;



public class ArcheryWunjo extends Wunjo implements ArcheryRune {

    
    public ArcheryWunjo() {
        super("Archery_");
    }

    @Override
    public void onBow() {
        //명중 시 기쁨 스택을 쌓고 스택에 따라 이속,차징속도 증가
        //패시브 행운 증가
    }

    @Override
    public void onArrow() {
        //명중 후 사살 시 기쁨의 파동이 일어나 파동에 맞은 플레이어는 짧은 재생 및 마나 회복 부여
    }
}