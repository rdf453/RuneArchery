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

import dev.rdf453.RuneCraft.Api.rune.IRune;
import dev.rdf453.RuneCraft.Api.rune.IRuneHolder;
import dev.rdf453.RuneCraft.Registry.RuneRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;

public class RunicArrowItem extends ArrowItem implements IRuneHolder {
    private static final String RUNES_KEY = "runes";
    
// TODO: 다른 모드 화살의 기존 동작은 유지하면서, 발사된 화살 엔티티에 저장된 룬 효과를 연결하기
// 한마디로 Custom_DATA에 룬 정보 넣는거 분리하고 발사되는거 따로 구현하고 AbstractRunicArrow 오버라이팅하기(영향 최소화하기)

    RunicArrowItem(Item.Properties prop) {
        super(prop);
    }

    @Override
    public List<IRune> getAppliedRunes() {
        return readRuneIds(getDefaultInstance());
    }

    /**
     * Maximum runes that can be enchanted
     *
     * 
     * @return
     */
    public int getMaxRune() {
        return 3;
    }

    protected boolean isReachedLimit(ItemStack item) {
        return readRuneIds(item).size() >= getMaxRune();
    }

    public void addRune(IRune rune,ItemStack item) {
        List<String> runeIds = readRuneIds(item);
        if (isReachedLimit(item))
            return;
        runeIds.add(rune.getRuneId());
        writeRuneIds(item, runeIds);//아몰라 내일해
    }

    public void removeRune(int index, ItemStack item) {
        List<String> runeIds = readRuneIds(item);
        if (runeIds.size() > 0 && index >= 0 && index < runeIds.size()) {
            runeIds.remove(index);
            writeRuneIds(item, runeIds);
        }
    }

    
    public void writeRuneIds(ItemStack item, List<String> runeIds) {
        CustomData.update(DataComponents.CUSTOM_DATA, item, tag -> {
            ListTag runes = new ListTag();
            for (String id : runeIds) {
                runes.add(StringTag.valueOf(id));
            }
            tag.put(RUNES_KEY, runes);
            
        }
        
    );
    }

    public List<String> readRuneIds(ItemStack stack) {
        CustomData data = stack.get(DataComponents.CUSTOM_DATA);
        if (data == null) {
            return new ArrayList<>();
        }

        ListTag runes = data.copyTag().getListOrEmpty(RUNES_KEY);
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < runes.size(); i++) {
            ids.add(runes.getString(i).orElseThrow());
        }
        return ids;
    }
}

// nbt load save 구현 필요