# 미션 - 자동차 경주 게임

## 구현할 기능 목록
* Car
  * Car(String nmae)
  * getPosition() -> getter position
  * getName() -> getter name
  * run() -> 0-9 랜덤 돌려서 4이상 나올시 전진
  * printStatus() -> 자동차 상태 출력
  * forward() -> position 증가
* Game
  * Game(List<Car> cars, Integer cnt)
  * play() -> 시도할 횟수만큼 게임 실행
  * round() -> 매 라운드 시행 및 출력
  * decreaseCnt() -> cnt 감소
  * result() -> 최종우승자 출력
  * pickUpWinner() -> 우승자 리스트 반환
* InputManger
  * inputCarName() -> 경주할 자동차 이름 입력 처리
  * inputTryCnt() -> 시행 횟수 입력 처리
  * checkCarNameLength(String carName) -> 차이름 5글자 이하인지 검사
  * isInteger(String str) -> 정수형인지 검사
* CarNameLengthException
  * CarNameLengthException(String carName) -> 차 이름 Exception
* TryCountTypeException
  * TryCountTypeException(String tryInput) -> 시행 횟수 타입 Exception