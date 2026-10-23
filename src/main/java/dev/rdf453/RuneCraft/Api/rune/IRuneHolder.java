/*
 * This file is part of RuneCraft.
 * Copyright (c) 2026, rdf453.
 *
 * Licensed under the MIT License. See LICENSE_API.txt in the project root
 * for license information.
 */

package dev.rdf453.RuneCraft.Api.rune;

import java.util.List;

public interface IRuneHolder {

    List<IRune> getAppliedRunes();
    void addRune(IRune rune);
    void removeRune(IRune rune);
}
