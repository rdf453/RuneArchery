package dev.rdf453.RuneCraft.api.rune;

import java.util.List;

public interface IRuneHolder {

    List<IRune> getAppliedRunes();
    void addRune(IRune rune);
    void removeRune(IRune rune);
}
