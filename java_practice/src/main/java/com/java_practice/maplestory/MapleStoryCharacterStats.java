package com.java_practice.maplestory;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MapleStoryCharacterStats {
    private int STR;
    private int DEX;
    private int INT;
    private int LUCK;

    @Builder
    public MapleStoryCharacterStats(int STR, int DEX, int INT, int LUCK) {
        this.STR = STR;
        this.DEX = DEX;
        this.INT = INT;
        this.LUCK = LUCK;
    }
}
