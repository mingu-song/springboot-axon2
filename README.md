# springboot-axon2
* 기존 구현이랑 크게 다르지 않아 보이지만 학습차원에서 기록
  * https://github.com/mingu-song/springboot-axon
* 참고
  * https://progressivecoder.com/event-sourcing-and-cqrs-with-axon-and-spring-boot-part-1/
  * https://progressivecoder.com/event-sourcing-and-cqrs-with-axon-and-spring-boot-part-2/
  * https://github.com/dashsaurabh/event-sourcing-cqrs-axon-spring-boot 
* 설명
  * 스프링부트 3.x 과 java 17 에 맞게 조금 변경 
  * axon 서버없이 하나의 서비스에서 EventSourcingHandler 를 사용하고 있음
  * axon 서버를 사용하는 것으로 try again