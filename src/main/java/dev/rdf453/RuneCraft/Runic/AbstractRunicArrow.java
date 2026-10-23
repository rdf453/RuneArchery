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

import dev.rdf453.RuneCraft.Api.Runic.IRunic;
import dev.rdf453.RuneCraft.Api.rune.IRuneHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.level.Level;

public abstract class AbstractRunicArrow extends AbstractArrow implements IRunic,IRuneHolder {
    
    public AbstractRunicArrow(EntityType<? extends AbstractRunicArrow> type, Level level){
        super(type,level);
    }
}
