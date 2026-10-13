package dev.rdf453.RuneCraft.api.rune;

import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.Enum.Elements;

public interface IRune {

    String getSymbol();

    ERuneTier getTier();

    // 활에다 부여했을때
    // 활 장전
    void onCharge();

    // 장전 완료
    void completeCharge();

    // 화살에 부여했을때
    // 활 쏨
    void onArrowShoot();

    // 화살 날라가는 중
    void onArrowFly();

    // 화살 맞음
    void onArrowHit();

    // 상극 룬
    Elements getOpposite();

}