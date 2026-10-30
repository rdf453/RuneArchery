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
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Ansuz;


public class ArcheryAnsuz extends Ansuz implements ArcheryRune {

    
    public ArcheryAnsuz() {
        super();
    }

    @Override
    public void onArrow() {

        // 미니 궁니르로 변환 조준점과 일치하는 대상을 무조건 꿰뚫는다

    }

    @Override
    public void onBow() {
        // 차징중 마나무한
        // 명중 할때 마다 플레이어가 장착 중인 다른 스킬이나 룬의 쿨타임이 싹 초기화
        // 오딘의 안광: 활을 당기는 동안 주변(벽 뒤 포함)의 모든 적대적 엔티티를 투시(Glow)하며 차징중 모든 블럭 투명화 및 조준선에 일치하는 대상에게 무조건적으로 적중
        // 적들의 버프와 은신 상태를 강제로 해제하고 시야를 지배함
    }

}
// • ᚨ — Ansuz (안수즈)
// • 뜻: 신 / 입 (God / Mouth) 아스가르드의 신(오딘), 전령, 지혜/소통
// • 상징: 주신 오딘의 계시, 지혜, 의사소통, 영감, 주문, 말의 힘 신성한 영감, 주문, 언어, 지혜