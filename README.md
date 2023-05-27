[JPA 블로그 포스팅 주소](https://velog.io/@wish17/%EC%BD%94%EB%93%9C%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%B8%A0-%EB%B0%B1%EC%97%94%EB%93%9C-%EB%B6%80%ED%8A%B8%EC%BA%A0%ED%94%84-49%EC%9D%BC%EC%B0%A8-Spring-MVC-JPA-%EA%B8%B0%EB%B0%98-%EB%8D%B0%EC%9D%B4%ED%84%B0-%EC%95%A1%EC%84%B8%EC%8A%A4-%EA%B3%84%EC%B8%B5)

## Spring Data JPA를 통한 데이터 액세스 계층 구현

### JPA vs Hibernate ORM vs Spring Data JPA


``JPA(Java Persistence API)``
- 관계형 데이터베이스를 사용하기 위해 정해 놓은 표준 스펙(사양 또는 명세, Specification)
- "이 기술은 뭐고~ 이 기술은 이렇게 이렇게 구현해서 쓰면 돼" 라고 적어 놓은 기술 명세

``Hibernate ORM``
- JPA라는 표준 스펙을 구현한 구현체
- 실제로 사용하는 API

``Spring Data JPA``
- JPA 스펙을 구현한 구현체의 API(일반적으로 Hibernate ORM)를 조금 더 쉽게 사용할 수 있도록 해주는 모듈

### 사용기능

``@Enumerated``

- Spring Data API에서 열거형(Enum) 타입의 필드를 매핑할 때 사용
- ``@Enumerated(value = EnumType.STRING)``
    - 열거형을 문자열로 저장
- ``@Enumerated(value = EnumType.ORDINAL)``
    - 열거형을 숫자로 저장

``JpaReposiroty``
- jdbc에서 사용한 [``CrudRepository``](https://velog.io/@wish17/%EC%BD%94%EB%93%9C%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%B8%A0-%EB%B0%B1%EC%97%94%EB%93%9C-%EB%B6%80%ED%8A%B8%EC%BA%A0%ED%94%84-47%EC%9D%BC%EC%B0%A8-Spring-MVC-JDBC-%EA%B8%B0%EB%B0%98-%EB%8D%B0%EC%9D%B4%ED%84%B0-%EC%95%A1%EC%84%B8%EC%8A%A4-%EA%B3%84%EC%B8%B52#spring-data-jdbc%EB%A5%BC-%ED%86%B5%ED%95%9C-%EB%8D%B0%EC%9D%B4%ED%84%B0-%EC%95%A1%EC%84%B8%EC%8A%A4-%EA%B3%84%EC%B8%B5-%EA%B5%AC%ED%98%842---%EC%84%9C%EB%B9%84%EC%8A%A4-%EB%A6%AC%ED%8F%AC%EC%A7%80%ED%86%A0%EB%A6%AC-%EA%B5%AC%ED%98%84)와 비슷한 인터페이스
- JPA에 특화된 더 많은 기능들을 포함하고 있음


>``JPQL``
- JPA(Java Persistence API)에서 제공하는 쿼리 언어
- 객체지향적인 쿼리 작성을 지원
- 엔티티 클래스의 객체를 대상으로 객체를 조회 가능 (테이블을 대상으로 조회 X 객체를 대상으로 조회 O)
