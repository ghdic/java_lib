package com.practice.spring_practice.springconfig.javaConfig;

public class AuthenticationPrincipalArgumentResolver {
    private AuthService2 authService2;

    public AuthenticationPrincipalArgumentResolver(AuthService2 authService2) {
        this.authService2 = authService2;
    }

    public String findMemberName() {
        return authService2.findMemberName();
    }

    public AuthService2 getAuthService() {
        return authService2;
    }
}
