# Portfolio
> **SeungTae's Portfolio Web Site**

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2FSeungTaeGit%2Fhit-counter&count_bg=%233D64C8&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)

개인 포트폴리오 용도의 프로젝트
<br>

![localhost_8080_](https://github.com/SeungTaeGit/Portfolio/assets/129585999/e89cc28a-150f-4b23-b8c2-9add6036f40e)

#### 개발 기간
2024.03 - 2024.04
<br>

### 요구사항
---
  - 
<br>

### 사용 설명서
---
  #### 사용자 타입
  `사용자(Guest)`, `관리자(SeungTae)`
  #### 서비스 이용 흐름
  `홈페이지 소개` -> `본인 소개` -> `기술 스택` -> `포트폴리오 확인` -> `Contact`
  #### 페이지
  `메인(HOME)`, `포트폴리오 열람 사이트`, `관리자 페이지(포트폴리오 포스팅)`, `Contact 페이지`
  #### 기능
  **회원** : `열람` <br>
  **관리자** : `로그`, `사이트 관리` <br>
  #### 참고 자료
<br>


### 관리자 페이지
---
  - 서버의 여러 지표를 로그 형태로 확인.
<br>


### 클래스 구조
---
#### Java Class
- repository
  - MemberRepository
    > 회원 데이터 저장
    - save
    - update
    - findById
    - findAll
      
- service
  - LoginService
    > 로그인 관련 로직
    - login
- controller
  - LoginController
  - BasicController
- ManagerData
  - ManageData
- **Main Thread**
<br>

#### Template
- static
  - index.html
- template
  - portfolio.html
  - contact.html
  - login.html
  - management.html  // 포트폴리오 포스팅 html
<br>
