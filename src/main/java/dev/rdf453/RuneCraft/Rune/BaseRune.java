package dev.rdf453.RuneCraft.Rune;



import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

public abstract class BaseRune implements IRune{
    protected final ERuneTier runeTier;
    protected final String runeId;
    protected final String symbol;


    public BaseRune (String RuneId,String Symbol, ERuneTier tier) {
        this.symbol = Symbol;
        this.runeId = RuneId;
        this.runeTier = tier;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public String getRuneId() {
        return runeId;
    }
    
    @Override
    public ERuneTier getTier() {
        return runeTier;
    }

    public int getManaCost() {
        return this.runeTier.getMana();
    }
    

}
