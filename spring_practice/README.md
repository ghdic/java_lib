# 스프링 연습용 프로젝트

## 초간단 방문 횟수 조회 서비스(.hello)
* @GetMapping("/hello")을 통해 /hello 요청을 처리할 메서드를 지정
* 파라미터로 name을 받음
* hello 테이블 스키마 정의 및 저장
* name에 따라 방문수를 출력해줌

## Spring MVC 학습 테스트(.mvc)
* mapping: 요청을 메서드에 연결하는 부분 학습 테스트
* handler: 요청을 처리하는 부분 학습 테스트
* exception: 요청에 대한 예외처리 부분 학습 테스트

## Spring JDBC 학습 테스트(.jdbc)
* jdbctemplate: JdbcTemplated와 NamedParameterJdbcTemplate을 활용하여 쿼리 실행 학습 테스트
* simpleinsert: SimpleJdbcInsert을 활용하여 insert 기능 학습 테스트

## Spring Core 학습테스트(.core)
* scan: component scan을 통해 스프링 빈 등록 학습 테스트
* di: 스프링 빈들의 의존성 주입 학습 테스트

## Spring MVC Config 학습테스트(.mvcconfig)
* addViewControllers: "/" 요청 시 hello.html 페이지 응답하기
* addInterceptors: "/admin/**" 요청 시 LoginInterceptor 동작하게 하기
* addArgumentResolvers: AuthenticationPrincipalArgumentResolver 등록하기

## Spring Auth 학습테스트(.auth)
* sessionLogin: session 기반의 로그인 학습 테스트
* tokenLogin: token 기반의 로그인 학습 테스트