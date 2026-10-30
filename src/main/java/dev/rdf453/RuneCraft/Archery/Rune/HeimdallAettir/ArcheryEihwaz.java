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
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Eihwaz;


/**
 * Eihwaz
 */
public class ArcheryEihwaz extends Eihwaz implements ArcheryRune {

    
    public ArcheryEihwaz() {
        super();
    }

    @Override 
    public void onBow() {
        
        //차징 중 처음 확정 두번째부턴 10%의 죽음 면역 및 죽을 때 마다 데미지 5000% 증가 죽을때 마다 마나 사용 
        // 5번째부턴 화살이 기본뎀 + 최대체력 퍼뎀으로 들어감
        //패시브: 활 강화 재료의 한계보다 룬을 더 넣을 수 있게 해줌
    }

    @Override
    public void onArrow() {
        //적중 대상 재생10 2초
    }
    
}

//• ᛇ — Eihwaz (이와즈)
//	• 뜻: 주목나무 (Yew)
//	• 상징: 활의 재료이자 사시사철 푸른 나무, 삶과 죽음의 순환, 인내, 유연함, 영생