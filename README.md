# Portfolio
> **SeungTae's Portfolio Web Site**

![localhost_8080_](https://github.com/SeungTaeGit/Portfolio/assets/129585999/e89cc28a-150f-4b23-b8c2-9add6036f40e)

- 개인 포트폴리오 용도의 프로젝트입니다.

  
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
<br>
<br>


### 디렉토리 구조
---
```bash
├─.gradle
│  ├─8.7
│  │  ├─checksums
│  │  ├─dependencies-accessors
│  │  ├─executionHistory
│  │  ├─expanded
│  │  ├─fileChanges
│  │  ├─fileHashes
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  └─vcs-1
├─.idea
│  └─modules
├─build
│  ├─classes
│  │  └─java
│  │      └─main
│  │          └─seungtae
│  │              └─STportfolio
│  │                  ├─controller
│  │                  ├─domain
│  │                  ├─repository
│  │                  └─service
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  └─main
│  │      ├─static
│  │      │  ├─css
│  │      │  ├─image
│  │      │  └─js
│  │      └─templates
│  │          ├─layout
│  │          ├─page
│  │          └─portfolio
│  └─tmp
│      └─compileJava
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
├─gradle
│  └─wrapper
└─src
    ├─main
    │  ├─java
    │  │  └─seungtae
    │  │      └─STportfolio
    │  │          ├─controller
    │  │              ├─LoginController
    │  │              └─PortfolioController
    │  │          ├─domain
    │  │              ├─Manager
    │  │              └─Portfolio
    │  │          ├─repository
    │  │              └─MemberRepository
    │  │          ├─service
    │  │              └─LoginService
    │  │          ├─ManagerData
    │  │          └─StPortfolioApplication      // Main Thread
    │  └─resources
    │      ├─static
    │      │  ├─css
    │      │      ├─basic.css
    │      │      ├─contact.css
    │      │      ├─header.css
    │      │      ├─home.css
    │      │      └─portfolio.css
    │      │  ├─image
    │      │      ├─aws.png
    │      │      ├─BASIC.png
    │      │      ├─calendar.png
    │      │      ├─call.png
    │      │      ├─certificate.png
    │      │      ├─checkmate.png
    │      │      ├─education.png
    │      │      ├─github.png
    │      │      ├─java.png
    │      │      ├─location.png
    │      │      ├─LST.png
    │      │      ├─mail.png
    │      │      ├─mysql.png
    │      │      ├─portfolio.png
    │      │      ├─spring.png
    │      │      ├─spring boot.png
    │      │      └─user.png
    │      │  ├─js
    │      │      ├─script.js
    │      │      └─star.js
    │      │  └─index.html      // HOME.html
    │      └─templates
    │          ├─layout
    │              └─header.html
    │          ├─page
    │              └─login.html
    │          └─portfolio
    │              ├─basicCRUD.html
    │              ├─checkmate.html
    │              └─portfolio.html
    └─test
        └─java
            └─seungtae
                └─STportfolio
```
