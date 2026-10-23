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
import dev.rdf453.RuneCraft.common.Rune.HeimdallAettir.Sowilo;


/**
 * Sowilo
 * • ᛊ — Sowilo (소윌로)
	• 뜻: 태양 (Sun)
	• 상징: 어둠을 몰아내는 빛, 승리, 명예, 생명력, 치유, 완전한 성공
 */
public class ArcherySowilo extends Sowilo implements ArcheryRune {

    
    public ArcherySowilo() {
        super();
    }

    @Override
    public void onBow() {
        //패시브: 주변 언데드에게 초당 최대체력 25%의 데미지
        //오마주: 갓 에스카노르, 정오에 가까워 질수록 플레이어는 강해짐
    }

    @Override
    public void onArrow() {
        //적중시 
        // 언데드면 즉사 
        // 승리의 서광: 화살이 적중할 때마다 이동/차징/공격 속도가 중첩하여 폭발적으로 증가 (최대 중첩 시 태양의 광륜 전개)
        // 태양의 낙인: 꺼지지 않는 불데미지 부여-데미지가 들어갈수록 피해량 1씩 증가
    }
}