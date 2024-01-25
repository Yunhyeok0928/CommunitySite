# CommunitySite
This project is the process of creating a basic API server, which is essential for Java beginners.


# 프로젝트 개요

해당 프로젝트는 자바를 공부하는 초보자들에게 가장 필수인 자바 API 서버를 만드는 것이다.

# 게시판

- 글 작성
- 글 수정
- 글 삭제
- 글 조회

추가적인 기능은 다른 Repository에서 다룰 예정이다. 

# 글 조회 기능

다음은 파일 구조이다.

![스크린샷 2024-01-25 오후 2 26 41](https://github.com/Yunhyeok0928/CommunitySite/assets/157354049/f74433f1-ac7e-4e80-8b4b-92258848c4b0)

Controller는 총 두가지 파일로 나누었다.
두 가지 @RestController , @Controller 로 구분했고, 데이터를 다루는 RestController , 화면에 보여주기 위함인 Controller 로 구성했다.
그리고 데이터를 저장하기 위함인 Repository를 구성하였다.

각각의 Controller 와 Repository를 어노테이션을 통해 스프링 빈을 등록했다. 스프링 빈을 등록하는 순간 서로의 역할을 인식하고 데이터들이 원할하게 이동될 수 있다.

# RestController 

RestController는 @Controller 와 @ResponseBody 를 합친 것이다. @ResponsBody 는 메서드의 반환 값을 HTTP 응답 본문에 직접 쓰라는 의미이다.
즉 RestController 는 주로 데이터를 JSON 이나 XML 로 반환하는 REST API 를 구현하는데 사용된다.







