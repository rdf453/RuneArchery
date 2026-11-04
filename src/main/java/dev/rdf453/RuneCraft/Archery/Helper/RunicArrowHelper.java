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

package dev.rdf453.RuneCraft.Archery.Helper;

import java.util.List;

import dev.rdf453.RuneCraft.Api.rune.ArcheryRune;
import dev.rdf453.RuneCraft.Api.rune.IRune;
import dev.rdf453.RuneCraft.Helper.RuneHelper;
import dev.rdf453.RuneCraft.Registry.RuneRegistry;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;

//TODo: 굳이 호환성 처리를 안해도 다른 모드와의 호환성을 확보,루닉 화살의 기본 클래스
public class RunicArrowHelper  {

    private RunicArrowHelper() {
    }

    public static List<IRune> readRunes(ItemStack item) {
        return RuneHelper.readRuneIds(item).stream()
                .map(RuneRegistry::get)
                .toList();
    }

    public static void activation(ItemStack item,AbstractArrow arrow) {
        for (IRune rune : readRunes(item)) {
            if (rune instanceof ArcheryRune aRune) {
                aRune.onArrow(arrow);
            }
        }

    // 부여된 아이템과 연결, 활에서의 영향 구현 필요
}






}
