package com.java_practice.maplestory;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MapleStoryCharacter {

    private MapleStoryCharacterStats stats;
    private int level;
    private MapleStoryJob job;

    public MapleStoryCharacter() {
        this.stats = MapleStoryCharacterStats.builder()
                .STR(4)
                .DEX(4)
                .INT(4)
                .LUCK(4)
                .build();
        this.level = 1;
        this.job = MapleStoryJob.초보자;
    }

    @Builder
    public MapleStoryCharacter(MapleStoryCharacterStats stats, int level, MapleStoryJob job) {
        this.stats = stats;
        this.level = level;
        this.job = job;
    }


}
