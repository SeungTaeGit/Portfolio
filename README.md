# Portfolio
> **SeungTae's Portfolio Web Site**

개인 포트폴리오 용도의 프로젝트
<br>

![localhost_8080_](https://github.com/SeungTaeGit/Portfolio/assets/129585999/e89cc28a-150f-4b23-b8c2-9add6036f40e)

#### 개발 기간
2024.03 - 2024.04
<br>
<br>


### 사용 설명서
---
  #### 사용자 타입
  `사용자(Guest)`, `관리자(SeungTae)`
  #### 서비스 이용 흐름
  `홈페이지 소개` -> `본인 소개` -> `기술 스택` -> `포트폴리오 확인` -> `Contact`
  #### URL
  ```
  http://3.34.130.187:8080/
  ```
  #### 기능
  **Guest** : `열람` <br>
  **Manager** : `로그`, `사이트 관리` <br>
  #### 참고 자료
<br>
<br>


### Stacks
---
**Evironment** <br>
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&amp;logo=IntelliJ%20IDEA&amp;logoColor=white" alt="IntelliJ_IDEA">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">   <!-- Git -->
<img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=GitHub&logoColor=white">   <!-- Github -->

**Development** <br>
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">   <!-- Java -->
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">  <!-- Spring -->
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">  <!-- Spring boot -->
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">   <!-- MySQL -->
<br>
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
