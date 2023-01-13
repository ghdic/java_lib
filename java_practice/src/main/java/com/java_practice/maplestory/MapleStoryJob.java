package com.java_practice.maplestory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum MapleStoryJob {
    // 3차 전직
    크루세이더(70, MapleStoryCharacterStats.builder().
            STR(200).DEX(0).INT(0).LUCK(0)
            .build(), Arrays.asList()),
    나이트(70, MapleStoryCharacterStats.builder().
            STR(160).DEX(0).INT(0).LUCK(40)
            .build(), Arrays.asList()),
    버서커(70, MapleStoryCharacterStats.builder().
            STR(160).DEX(40).INT(0).LUCK(0)
            .build(), Arrays.asList()),
    메이지불독(70, MapleStoryCharacterStats.builder().
            STR(0).DEX(40).INT(160).LUCK(0)
            .build(), Arrays.asList()),
    메이지썬콜(70, MapleStoryCharacterStats.builder().
            STR(40).DEX(0).INT(160).LUCK(0)
            .build(), Arrays.asList()),
    프리스트(70, MapleStoryCharacterStats.builder().
            STR(0).DEX(0).INT(160).LUCK(40)
            .build(), Arrays.asList()),
    허밋(70, MapleStoryCharacterStats.builder().
            STR(0).DEX(40).INT(0).LUCK(160)
            .build(), Arrays.asList()),
    시프마스터(70, MapleStoryCharacterStats.builder().
            STR(40).DEX(0).INT(0).LUCK(160)
            .build(), Arrays.asList()),

    // 2차 전직
    파이터(30, MapleStoryCharacterStats.builder().
            STR(80).DEX(0).INT(0).LUCK(0)
            .build(), Arrays.asList(크루세이더)),
    페이지(30, MapleStoryCharacterStats.builder().
            STR(60).DEX(0).INT(0).LUCK(20)
            .build(), Arrays.asList(나이트)),
    스피어맨(30, MapleStoryCharacterStats.builder().
            STR(60).DEX(20).INT(0).LUCK(0)
            .build(), Arrays.asList(버서커)),
    위자드불독(30, MapleStoryCharacterStats.builder().
            STR(0).DEX(20).INT(60).LUCK(0)
            .build(), Arrays.asList(메이지불독)),
    위자드썬콜(30, MapleStoryCharacterStats.builder().
            STR(20).DEX(0).INT(60).LUCK(0)
            .build(), Arrays.asList(메이지썬콜)),
    클레릭(30, MapleStoryCharacterStats.builder().
            STR(0).DEX(0).INT(60).LUCK(20)
            .build(), Arrays.asList(프리스트)),
    어쌔신(30, MapleStoryCharacterStats.builder().
            STR(0).DEX(20).INT(0).LUCK(60)
            .build(), Arrays.asList(허밋)),
    시프(30, MapleStoryCharacterStats.builder().
            STR(20).DEX(0).INT(0).LUCK(60)
            .build(), Arrays.asList(시프마스터)),

    // 1차 전직
    검사(10, MapleStoryCharacterStats.builder().
            STR(40).DEX(0).INT(0).LUCK(0)
            .build(), Arrays.asList(파이터, 페이지, 스피어맨)),
    매지션(8, MapleStoryCharacterStats.builder().
            STR(0).DEX(0).INT(40).LUCK(0)
            .build(), Arrays.asList(위자드불독, 위자드썬콜, 클레릭)),
    로그(10, MapleStoryCharacterStats.builder().
            STR(0).DEX(0).INT(0).LUCK(40)
            .build(), Arrays.asList(어쌔신, 시프)),
    // 0차 전직
    초보자(1, MapleStoryCharacterStats.builder().
            STR(0).DEX(0).INT(0).LUCK(0)
            .build(), Arrays.asList(검사, 매지션, 로그));
    private final int needLevel;
    private final MapleStoryCharacterStats needStats;
    private final List<MapleStoryJob> next_available;

    private MapleStoryJob(int needLevel, MapleStoryCharacterStats needStats, List<MapleStoryJob> next_available) {
        this.needLevel = needLevel;
        this.needStats = needStats;
        this.next_available = next_available;
    }

    public static List<MapleStoryJob> getAvailableJob(MapleStoryCharacter character) {
        return character.getJob().next_available.stream()
                .filter((job) -> checkJobCondition(job, character)).collect(Collectors.toList());
    }

    private static boolean checkJobCondition(MapleStoryJob job, MapleStoryCharacter character) {
        return character.getLevel() >= job.needLevel &&
                 character.getStats().getSTR() >= job.needStats.getSTR() &&
                            character.getStats().getDEX() >= job.needStats.getDEX() &&
                character.getStats().getINT() >= job.needStats.getINT() &&
                 character.getStats().getLUCK() >= job.needStats.getLUCK();
    }
}
