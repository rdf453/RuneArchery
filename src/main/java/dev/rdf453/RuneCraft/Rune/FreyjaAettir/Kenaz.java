package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;


/**
 * Kenaz
 */
public class Kenaz extends BaseRune {

    public Kenaz() {
        super("Kenaz","ᚲ",ERuneTier.Physical);
    }

    @Override
    public void onBow() {
        //움직이는 빛 싸개-차징중 주변 빛 15로 고정
        //패시브: 소지시 야광투시 부여
    }

    @Override
    public void onArrow() {
        //명중시 발광(Effect Glow) 부여
    }

    
}