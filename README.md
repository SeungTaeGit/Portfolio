## Portfolio
<br>

### 서비스 소개
---
  - SeungTae's Portfolio Web Site
<br>

### 요구사항
---
<br>

### API 설계
---
  - **GET** : / : HOME
  - **GET** : / : 

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
