package dev.rdf453.RuneCraft.Rune.FreyjaAettir;


import dev.rdf453.RuneCraft.api.Enum.Elements;
import dev.rdf453.RuneCraft.api.rune.IRune;


public class Fehu extends IRune{


    public Fehu() {
        super(Elements.FLOW,Elements.FERTILITY,Elements.ENERGY);
    }


    @Override
    public String getSymbol() {
        return "ᚠ";
    }

    @Override 
    public int getManaUsage() {
        return NOVICE;
    }

    
}
//*• ᚠ — Fehu (페후)
//	• 뜻: 가축 (Cattle)
//	• 상징: 가축이 곧 자산이던 시절의 
//  부, 풍요, 움직이는 재산, 시작되는 에너지 에너지의 순환 */