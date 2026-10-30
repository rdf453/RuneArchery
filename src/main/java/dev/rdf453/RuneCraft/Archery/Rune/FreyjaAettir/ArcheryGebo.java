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
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Gebo;


/**
 * Gebo
 */
public class ArcheryGebo extends Gebo implements ArcheryRune {

    
    public ArcheryGebo() {
        super("Archery_");
    }


    @Override
    public void onBow() {
        //체력을 희생하여(하한선 1) 화살의 데미지,속도 증가
    }

    @Override
    public void onArrow() {
        //적중시 반경 10블럭 이내의 중립,적대 엔티티에 데미지 공유
    }

    
}