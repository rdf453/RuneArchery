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




public class RunicBow<C> extends AbstractRunicBow {
    // 
    // 태그에 RuneArchery:Runic Bow 를 넣어 부여되는 룬의 효과를 관리한다*//
    private final Class<C> originClass;

    public RunicBow(Class<C> originClass) {
        this.originClass = originClass;
    }

    public Class<C> getOriginClass() {
        return this.originClass;
    }
}
