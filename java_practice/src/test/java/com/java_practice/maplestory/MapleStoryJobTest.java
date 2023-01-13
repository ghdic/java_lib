package com.java_practice.maplestory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MapleStoryJobTest {

    @Test
    @DisplayName("매지션 전직 레벨경계 테스트")
    void 초보자_전직_레벨8() {
        MapleStoryCharacter character = MapleStoryCharacter.builder()
                .stats(MapleStoryCharacterStats.builder()
                        .STR(4).DEX(4).INT(40).LUCK(4)
                        .build()
                )
                .level(8)
                .job(MapleStoryJob.초보자)
                .build();
        List<MapleStoryJob> jobs = MapleStoryJob.getAvailableJob(character);
        assertThat(jobs).contains(MapleStoryJob.매지션);
        assertThat(jobs).doesNotContain(MapleStoryJob.검사, MapleStoryJob.로그);
    }

    @Test
    @DisplayName("매지션 이외 레벨경계 테스트")
    void 초보자_전직_레벨10() {
        MapleStoryCharacter character = MapleStoryCharacter.builder()
                .stats(MapleStoryCharacterStats.builder()
                        .STR(40).DEX(0).INT(0).LUCK(40)
                        .build()
                )
                .level(10)
                .job(MapleStoryJob.초보자)
                .build();
        List<MapleStoryJob> jobs = MapleStoryJob.getAvailableJob(character);
        assertThat(jobs).contains(MapleStoryJob.검사, MapleStoryJob.로그);
        assertThat(jobs).doesNotContain(MapleStoryJob.매지션);
    }

    @Test
    @DisplayName("스탯 경계값 테스트")
    void 스탯_경계값_테스트() {
        MapleStoryCharacter character = MapleStoryCharacter.builder()
                .stats(MapleStoryCharacterStats.builder()
                        .STR(20).DEX(19).INT(60).LUCK(21)
                        .build()
                )
                .level(30)
                .job(MapleStoryJob.매지션)
                .build();
        List<MapleStoryJob> jobs = MapleStoryJob.getAvailableJob(character);
        assertThat(jobs).contains(MapleStoryJob.위자드썬콜, MapleStoryJob.클레릭);
        assertThat(jobs).doesNotContain(MapleStoryJob.위자드불독);
    }
}