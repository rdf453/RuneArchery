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

package dev.rdf453.RuneCraft.Runic;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import dev.rdf453.RuneCraft.Api.rune.ArcheryRune;
import dev.rdf453.RuneCraft.Api.rune.IRune;
import dev.rdf453.RuneCraft.Api.rune.IRuneHolder;
import dev.rdf453.RuneCraft.Registry.RuneRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

//TODo: 굳이 호환성 처리를 안해도 다른 모드와의 호환성을 확보,루닉 화살의 기본 클래스
public abstract class AbstractRunicArrow extends AbstractArrow implements IRuneHolder {
    private static final String RUNES_KEY = "runes";
    private @Nullable  List<IRune> applidRunes = new ArrayList<>();
    
    public AbstractRunicArrow(EntityType<? extends AbstractRunicArrow> type, Level level) {
        super(type, level);
        applidRunes = readRunes(getPickupItemStackOrigin());
    }

    public AbstractRunicArrow(EntityType<? extends AbstractArrow> type, double x, double y, double z, Level level, ItemStack pickupItemStack, @Nullable ItemStack firedFromWeapon){
        super(type,x,y,z,level,pickupItemStack,firedFromWeapon);
    }

    public List<String> readRuneIds(ItemStack stack) {
        CustomData data = stack.get(DataComponents.CUSTOM_DATA);
        if (data == null) {
            return List.of();
        }

        ListTag runes = data.copyTag().getListOrEmpty(RUNES_KEY);
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < runes.size(); i++) {
            ids.add(runes.getString(i).orElseThrow());
        }
        return ids;
    }

    public List<IRune> readRunes(ItemStack stack) {
        return readRuneIds(stack).stream()
                .map(RuneRegistry::get)
                .toList();
    }

    public void activation(List<IRune> AppliedRunes) {
        for (IRune rune : AppliedRunes) {
            if (rune instanceof ArcheryRune aRune) {
                aRune.onArrow(this);
            }
        }
    }

    @Override
    public void shoot(double xd, double yd, double zd, float pow, float uncertainty) {
        super.shoot(xd, yd, zd, pow, uncertainty);
        
        activation(applidRunes);
    }

    // 부여된 아이템과 연결,
}
