package dev.rdf453.RuneCraft.api.Enum;

import java.util.Map;
import java.util.Set;

public enum Elements {
    // 1. 원소계 (Elements)
    FIRE,
    WATER,
    ICE,
    LIGHTNING,
    NATURE,
    WIND,

    // 2. 개념/세계관계 (Concepts & Order)
    ORDER, // 질서
    CHAOS, // 혼돈
    HOLY, // 신성
    CORRUPTION, // 부패/어둠
    PURIFY, // 정화
    FLOW,  // 흐름
    ENERGY, //에너지

    // 3. 생명/정신계 (Life & Arcane)
    LIFE, // 생명/풍요
    MIND, // 지혜/마력
    PHYSICAL, // 물리/전투
    FERTILITY; // 풍요

    private static final Map<Elements, Set<Elements>> CONFLICTS = Map.ofEntries(
        Map.entry(FIRE, Set.of(WATER, ICE)),
        Map.entry(WATER, Set.of(FIRE)),
        Map.entry(ICE, Set.of(FIRE)),
        Map.entry(LIGHTNING, Set.of(NATURE)),
        Map.entry(NATURE, Set.of(CORRUPTION)),
        Map.entry(WIND, Set.of(NATURE)),
        Map.entry(ORDER, Set.of(CHAOS)),
        Map.entry(CHAOS, Set.of(ORDER)),
        Map.entry(HOLY, Set.of(CORRUPTION)),
        Map.entry(CORRUPTION, Set.of(HOLY, PURIFY)),
        Map.entry(PURIFY, Set.of(CORRUPTION)),
        Map.entry(FLOW, Set.of(ENERGY)),
        Map.entry(ENERGY, Set.of(FLOW)),
        Map.entry(LIFE, Set.of(FERTILITY)),
        Map.entry(MIND, Set.of(PHYSICAL)),
        Map.entry(PHYSICAL, Set.of(MIND))
    );

    public static Set<Elements> conflictsWith(Elements elements) {
        return CONFLICTS.getOrDefault(elements, Set.of());
    }
}
