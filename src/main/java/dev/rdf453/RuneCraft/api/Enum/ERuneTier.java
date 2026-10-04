package dev.rdf453.RuneCraft.api.Enum;

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
