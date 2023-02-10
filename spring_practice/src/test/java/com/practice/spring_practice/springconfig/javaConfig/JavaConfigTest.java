package com.practice.spring_practice.springconfig.javaConfig;

import com.practice.spring_practice.SpringPracticeApplication;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * AnnotationConfigApplicationContext을 통해 AuthenticationPrincipalConfig에 설정된 빈들을 이용한 테스트
 * <p>
 * AuthenticationPrincipalConfig을 이용하여
 * AuthService 빈 등록하기
 */
class JavaConfigTest {
    @Test
    void javaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringPracticeApplication.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        AuthService2 authService2 = context.getBean(AuthService2.class);
        assertThat(authService2).isNotNull();
    }
}