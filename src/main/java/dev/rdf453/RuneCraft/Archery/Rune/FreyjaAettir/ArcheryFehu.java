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
import dev.rdf453.RuneCraft.common.Rune.FreyjaAettir.Fehu;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;



public class ArcheryFehu extends Fehu implements ArcheryRune {

    
    public ArcheryFehu() {
        super();
    }

    

    @Override
    public void onArrow(AbstractArrow arrow) {
        // 화살이 3개로 분열
        Vec3 arrowVec3 = arrow.getDeltaMovement();
    }

    @Override 
    public void onBow(LivingEntity user,ItemStack bow) {
        //차지 속도 증가
        
    }


    


}
// *• ᚠ — Fehu (페후)
// • 뜻: 가축 (Cattle)
// • 상징: 가축이 곧 자산이던 시절의
// 부, 풍요, 움직이는 재산, 시작되는 에너지 에너지의 순환
// 아몰라 이제부터 이건 활잽이 모드다*/