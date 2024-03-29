# ***Mock***

단위 테스트를 하기 위해서는 한번에 메서드 하나만을 실행해 보는 것인데 이러한 메서드가 다른 네트워크, 데이터베이스 등등 제어하기 어려운 것들에 의존하고 있다면 어떻게 단위 테스트를 해야할까?  
즉, 코드가 해당하는 Flow가 아닌 시스템의 다른 부분에 많이 얽혀 있고 의존해있다면 단위 테스트를 하기에는 매우 어려울 것이다.  
따라서 이러한 것을 돕기위해 Mock이라는 것이 나타났다.

## Mock?
>모의 객체(Mock Object)란 주로 객체 지향 프로그래밍으로 개발한 프로그램을 테스트할 경우 테스트를 수행할 모듈과 연결되는 외부의 다른 서비스나 모듈들을 실제 사용하는 모듈을 사용하지 않고 실제의 모듈을 "흉내"내는 "가짜" 모듈을 작성하여 테스트의 효용성을 높이는 데 사용하는 객체이다. 사용자 인터페이스(UI)나 데이터베이스 테스트 등과 같이 자동화된 테스트를 수행하기 어려운 때 널리 사용된다. - 위키백과, Mock Object

## 언제써야해?
> '의존성'의 원인으로 테스트를 하기 힘들때


- 테스트 작성을 위한 환경구축이 어려울 때
- 테스트가 특정 경우나 순간에 의존적일 때
- 테스트 시간이 오래 걸릴 때

## Mock 사용시 유의사항

- Mock 프레임워크가 정말 필요한지 확인한다.  
- Mock을 사용하는 경우 테스트 케이스 유지에 복잡성이 더해지기 때문에 Mock이 없는 의존성 적은 구조로 프로그래밍 한다.  
- 어떤 Mock 프레임워크를 사용하느냐는 핵심 문제가 아니다.  
- 어떤 프레임워크를 사용하느냐에 따라 테스트 케이스 작성에 커다란 영향이 미치지 않는다. 단지 익숙해지기 까지 시간이 필요할 뿐이다.  
- Mock 객체는 Mock 일 뿐이다.  
- 실제 객체로 작동을 해보았을 때 잘 작동하지 않을 수도 있다. Mock 객체는 흉내를 내는 객체이기 때문이다.   