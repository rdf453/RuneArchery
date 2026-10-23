/*
 * This file is part of RuneCraft.
 * Copyright (c) 2026, rdf453.
 *
 * Licensed under the MIT License. See LICENSE_API.txt in the project root
 * for license information.
 */

package dev.rdf453.RuneCraft.Api.Enum;

public enum ERuneTier {
    Physical(10),
    Mental(20),
    Spiritual(30),
    Divine(40);

    private final int mana;

    ERuneTier(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return this.mana;
    }
}
