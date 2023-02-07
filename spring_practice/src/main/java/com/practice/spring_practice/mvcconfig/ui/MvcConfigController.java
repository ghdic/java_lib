package com.practice.spring_practice.mvcconfig.ui;

import com.practice.spring_practice.mvcconfig.domain.LoginMember;
import com.practice.spring_practice.mvcconfig.dto.FavoriteResponse;
import com.practice.spring_practice.mvcconfig.dto.MemberResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/mvcconfig")
public class MvcConfigController {

    @GetMapping("/members/me")
    public ResponseEntity<LoginMember> findMemberOfMine(@AuthenticationPrincipal LoginMember loginMember) {
        return ResponseEntity.ok().body(loginMember);
    }

    @GetMapping("/admin/members")
    public ResponseEntity<List<MemberResponse>> showMembers() {
        List<MemberResponse> memberResponses = Arrays.asList(
                new MemberResponse(),
                new MemberResponse(),
                new MemberResponse(),
                new MemberResponse()
        );
        return ResponseEntity.ok().body(memberResponses);
    }

    @GetMapping("/favorites")
    public ResponseEntity<List<FavoriteResponse>> showFavorites(@AuthenticationPrincipal LoginMember loginMember) {
        if (loginMember == null || loginMember.getId() == null) {
            throw new AuthorizationException();
        }

        List<FavoriteResponse> favoriteResponses = Arrays.asList(
                new FavoriteResponse(),
                new FavoriteResponse(),
                new FavoriteResponse(),
                new FavoriteResponse()
        );
        return ResponseEntity.ok().body(favoriteResponses);
    }


}
