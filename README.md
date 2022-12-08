# 백구 : 헬서들을 위한 단백질 보충 식단 추천 서비스

<img width="230" alt="image" src="https://user-images.githubusercontent.com/54922625/206559927-793f5dc9-c25c-45c1-9bb2-cb6491f119e5.jpeg"/>


## 🗂️프로젝트 소개


<details>
 <summary>📃주제 정의 문서</summary>
 
 ### 🐾 기획 의도<img width="682" alt="image" src="https://user-images.githubusercontent.com/54922625/206564601-1d1581b9-2ee4-486b-a5d9-f6641d5391d9.png">

 
 #### MZ세대에서 트렌드 키워드로 뽑히는 #운동 #자기관리
 - Instagram의 #오운완(오늘운동완료)인증글은 385만개 헬스를 주제로 하는 유튜버들의 구독자가 100만명이 넘는 등 SNS와 플랫폼으로 MZ세대가 많은 자극을 받음
 - '자기관리 = 건간관리' 라는 사회적 분위기가 형성되면서 "덤벨 이코노미" 시대 즉, 건강과 운동, 체력 관리에 대한 관심이 커지면서 건강 관련 시장이 급성장하는 경제 현상이나 소비 패턴이 이뤄지고 있다.

<table>
 <tr>
  <td><img width="531" alt="image" src="https://user-images.githubusercontent.com/54922625/206523332-8978f4d8-5465-46c7-ab64-0e652e1e43f0.png" width="230"></td>
  <td><img src="https://user-images.githubusercontent.com/54922625/206525532-0ba8adfe-5cdc-493f-89eb-431e55ada284.jpeg" width="230" height="350"></td>
  <td><img width="330" alt="image" src="https://user-images.githubusercontent.com/54922625/206526593-d28e1798-4e02-4353-a88d-cfe916fd55cf.png"/></td>
 </tr>
 <tr>
  <td>"대학내일 통계자료"</td>
  <td>인스타 #오운완 인증글</td>
  <td>헬스 유튜버 "피지컬 갤러리"</td>
 </tr>
</table>

#### 다이어트 앱은 넘쳐나지만 헬서를 위한 식단 맞춤 앱의 부재
- 헬스의 인기가 높아지면서 단백질 식단도 크게 각광을 받고 있다.
- 그러나 식단관리 앱이 넘쳐나도 전반적인 초점은 체중감량이었고, 헬서들에게 필요한 단백질 맞춤 식단 추천앱은 부재하다는 것을 인지하였다.
<img src="https://user-images.githubusercontent.com/54922625/206528612-7f4b3a35-98de-448e-a030-e84dc12fcbe0.png" width=230 height=230/>
<img src="https://user-images.githubusercontent.com/54922625/206529819-0516c2f4-a1d6-4b6f-86d2-edf56a82e52e.png" width=300 height=230/>

   
 
 ### 🐾 아이디어 내기
 그래서 우리는 아래의 기능들을 구현하여 단백질 식단 관리 편성에 대한 번거로움과 단일한 단백질 식품에 대한 권태감을 해소시키는<br>
 **헬서& 다이어터를 위한개인 맞춤형 단백질 식단 관리 및 제공 서비스**를 제공하기로 했다.
 
 1. 설문 조사를 통해 개인정보와 상품에 대한 선호도조사를 바탕으로 단백질 식단을 추천, 제공
 2. 하루 목표 단백질 섭취율을 체크해 주는 기능 제공
 3. 카테고리 별 개별 상품 확인 기능 제공 
 
</details>


<details>
 <summary>📈시스템 흐름도</summary> (아래 부분은 예시)
 
 ### User-case Diagram
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/134690667-abe8f797-01a8-44db-ae89-ef7809c22d64.png"/></p>
 
 ### Sequence Diagram
  <p align='center'><img src="https://user-images.githubusercontent.com/40621030/136720501-bbe98072-abbc-4797-a0c2-c66771f7e04a.png"/></p>
 
 ### Architecture
  <p align='center'><img src="https://user-images.githubusercontent.com/40621030/136720255-0456ffd4-4d7d-4d2e-b5c5-09387c5861fa.png"/></p>
</details>

<details>
 <summary>😎페르소나 </summary> 
 
<img width="885" alt="image" src="https://user-images.githubusercontent.com/54922625/206552123-01200fef-2488-4312-b973-627839c407cc.png">

<img width="884" alt="image" src="https://user-images.githubusercontent.com/54922625/206573445-9851a9c4-d9f1-41c1-94d5-d9e4bb7232ab.png">
</details>

<details>
 <summary>🎨일러스트 </summary> 
 단백질 구독의 줄임말로 "백구"라는 이미지를 떠올렸고, 일러스트로 구현해서 splash화면, 로그인 화면, 앱 이미지에 활용하였다.
 <table>
 <tr>
  <td><img width="230" alt="image" src="https://user-images.githubusercontent.com/54922625/206559927-793f5dc9-c25c-45c1-9bb2-cb6491f119e5.jpeg"/></td>
  <td><img width="230" alt="image" src="https://user-images.githubusercontent.com/54922625/206560766-ec76b4ad-d929-4ca7-bca5-473f5a5f0527.png"/></td>
  <td><img width="230" alt="image" src="https://user-images.githubusercontent.com/54922625/206560661-e12504ed-3c0e-4810-a562-44e78b22c9f7.png"/></td>
 </tr>
 </table>
</details>



<details>
 <summary>🖊개발 문서</summary>

- [레이아웃 정의서](https://funky-sage-b47.notion.site/995d94acec834bfc968af3c12a379eab)
- [개발 일지-BackEnd] 각자 하나씩 통일해서 파일로 정리를 해볼까요?
- [개발 일지-FrontEnd]각자 하나씩 통일해서 파일로 정리를 해볼까요? 개발일지는 선택사항이니까 나중에 얘기해봅시당
- [중간평가 수행 보고서](https://funky-sage-b47.notion.site/eb9c0b7930ff4a17a59ef2e0aed1e542)
- [테이블 명세서](https://funky-sage-b47.notion.site/806ef11fe87e472eb4980a17c226f1ab)
- [요구사항 정의서](https://funky-sage-b47.notion.site/d38347f828e24c539ca63894e1ccd3a3)
- [이슈 리포트](https://funky-sage-b47.notion.site/4a51b1a53a554a2eb57be494b46e81e9)
- [메뉴 및 기능 정의서](https://www.notion.so/fd830844438a43eb9f9e1af5fc122363)
- [주차별 보고서](https://funky-sage-b47.notion.site/34953c0d566941239baf5ab8a9ab4b07?v=44801df90b6e4ba797878da840d052b4)
- [Code Convention](https://funky-sage-b47.notion.site/Code-Convention-fc736353b54c485782ede8ade2ad4edb)

</details>


## 📔 앱 설명

<!--
### 🖥화면 정의 (아래 내용은 예시인데 이런느낌으로 해주시면 좋을 거 같습니다)
<table>
 <tr>
  <td><img src="https://user-images.githubusercontent.com/109564764/206384389-b59ecafd-3b95-479a-918d-1320b3894bd7.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689811-03fca8d5-26fd-4678-a398-df31655ebae5.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689813-b89f9162-4e74-48c7-9ac6-57e22f355827.png" width="230"/></td>
 </tr>
 <tr>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689816-4aeb35f6-ca24-4bc4-a4b5-902318b8d895.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134766861-33bf44f8-1330-43d2-91af-4a68f2432507.png" width="230"/></td>
 </tr>
</table>
-->

 ### 🐾 Front-End

 앱을 처음 실행 시, 사용자는 자신의 성명과 군번을 통해 회원가입을 진행합니다. 이 정보는 암호화되어 저장됩니다.  

 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/86545225/137917096-372ec2f3-60ab-4e49-ab98-cb87ca96aa88.PNG" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137917134-a9d63375-3663-467a-8ea3-2d5a92950085.PNG" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137917151-8ddf28a4-6ab6-4ea9-ad38-fcdaf1df0d5c.PNG" width="200"/></td>
  </tr>
 </table>

 - 카메라 모드: 군 내부에서도 사용 가능한 카메라입니다. 촬영한 사진 안의 보안 위반 요소를 식별 후 모자이크 처리하여 반환합니다.

   사용자가 찍은 사진은 스마트폰에 바로 저장되지 않고 서버에 전송되어, 보안 위반 요소를 식별 후 적절한 강도로 모자이크 처리하여 반환됩니다.

 - 갤러리 모드: 갤러리에 이미 저장된 사진을 모자이크 할 필요가 있을 시, 해당 사진을 업로드하여 카메라로 촬영할 때와 동일하게 모자이크 처리를 할 수 있습니다.  
 
 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/86545225/137917734-1f88e1c0-5f2f-4f2e-a7f5-d3ddb3019b81.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137917171-afe0567c-4cc5-4bf7-84dd-862c1cec4819.PNG" width="200"/></td>
  </tr>
 <table>
 

 보안 위반 요소는 사용자의 소속 부대 및 위치 식별 가능 여부, 기밀 유출 가능 여부 등을 고려하여 다음과 같이 선정하였습니다.
 >총(소총, 리볼버), 방탄조끼, 부대마크, 모니터, 노트북, 서류, 표지판, 포, 차량, 탱크, 군용 비행기, 미사일, 항공모함  

 군복의 경우 촬영 당시 맥락에 따라 보안 여부가 달라지므로 모자이크 처리는 하지 않되 사용자가 검출 여부를 인지할 수 있게 합니다.  
 
 처리된 사진이 반환될 때, 검출된 객체에 따라 발생할 수 있는 상황에 대한 경고문을 전송합니다. 반환된 사진을 터치하면 확인할 수 있습니다.  
 또한, 회원가입 시 입력한 군번을 암호화한 값을 이용해 만든 QR코드가 사진에 추가됩니다. 이를 이용하여 사진 처리자의 신원을 파악하거나 이미지 처리 여부를 눈으로 식별할 수 있습니다.  
 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/86545225/137919288-c90a06c7-c843-407f-ba5e-aed914cf3fd5.PNG" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137919350-567523d8-255e-466a-a834-12014eeb4679.PNG" width="200"/></td>
  </tr>
 
  <tr>
   <td><img src="https://user-images.githubusercontent.com/86545225/137919337-f2109767-9daa-427d-85f7-2dad831202db.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137919583-8a2fd884-c0c3-4bfb-8099-aeb03b7ce081.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/86545225/137919328-6390d7ea-207c-49c9-a0b8-97c4eab44d47.PNG" width="200"/></td>
  </tr>
 <table>

  
 ### 🐾 Back-End (Firebase)

 #### 1. 사용자 정보
   1.  ```kotlin
        // 회원가입 함수
    private fun createAccount(email: String, password: String) {
        // 파이어베이스 회원가입 메서드
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // 회원가입 성공
                    val user = Firebase.auth.currentUser
                    user?.let {
                        val email = user.email
                        val uid = user.uid
                        // 프레퍼런스에 유저 정보 저장
                        updateUI(uid, email, pwValue, nameValue, birthValue, phoneValue, addressValue)

                        // 파이어베이스 Realtime Database 데이터 저장
                        writeNewUser(uid, nameValue, birthValue, phoneValue, addressValue)

                        // 설문조사 페이지로 이동
                        var intent= Intent(this, SurveyActivity::class.java)
                        intent.putExtra("user_id", email)
                        startActivity(intent)
                    }
                } else {
                    // 회원가입 실패 시 프레퍼런스 null 값으로 업데이트
                    Toast.makeText(baseContext, "이미 존재하는 이메일입니다.", Toast.LENGTH_SHORT).show()
                    updateUI(null, null, null, null, null, null, null)
                }
            }
    }
       ```
   1. 회원가입에서 입력한 정보를 Firebase Realtime DataBase users에 저장한다. 각각의 타입은 아래와 같다.
  <table>
    <tr>
    <td>타입</td>
    <td>설문 정보</td>
   </tr>
   <tr>
    <td>String</td>
    <td>name, birth, phone, address</td>
   </tr>
  </table>
  <img width="504" alt="스크린샷 2022-12-09 오전 7 51 59" src="https://user-images.githubusercontent.com/79249376/206583896-2206a60e-01d2-4a78-8699-0d9e8ad24da1.png">

  2. 
 
 #### 2. 설문조사 정보
  1. 설문조사에서 조사한 설문정보를 Firebase Realtime DataBase에 저장한다. 각각의 타입은 아래와 같다.
  <table>
    <tr>
    <td>타입</td>
    <td>설문 정보</td>
   </tr>
   <tr>
    <td>String</td>
    <td>user_id, user_height, user_weight, user_proteinPurpose, user_trainingPurpose, user_trainingTime, user_snackYn</td>
   </tr>
   <tr>
    <td>Int</td>
    <td>user_proteinAmount</td>
   </tr>
   <tr>
    <td>List<String>?</td>
    <td>user_dietCnt, user_allergy</td>
   </tr>
   <tr>
    <td>List<String>?</td>
    <td>user_proPre, user_flaPre</td>
   </tr>
  </table>
<img width="727" alt="image" src="https://user-images.githubusercontent.com/54922625/206557942-12a44e70-720f-4ffc-bda6-34f1969d2f16.png">
  
  2. 캘린더에서 Firebase Realtime DataBase에 있는 데이터를 읽어온다.
  <img width="642" alt="image" src="https://user-images.githubusercontent.com/54922625/206564521-9fbc4fe8-b783-48cc-b908-be8941cb47fd.png">

  



### 🐾 기능 구현
  
#### 1. 필요 단백질량 산출 함수
**제지방** : 전체 몸에서 지방량을 제외한 부분의 무게를 모두 합한 무레로 근육, 뼈, 기관 등을 포함한 체중<br>
제지방 공식 :  (1.10  * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )

<필요 단백질량 산출 방법><br>
 1. 제지방 공식을 통해서 제지방을 산출한다.
 2. 활동계수와 맞게 설문조사에서 조사한 트레이닝 목적 기준으로 필요 단백질량을 산출해준다.
<img width="682" alt="image" src="https://user-images.githubusercontent.com/54922625/206562364-547ebcf4-68e9-4220-bf48-d029118ff44c.png">

<img width="803" alt="image" src="https://user-images.githubusercontent.com/54922625/206561871-97d53fae-90cd-43c2-8adc-dec0500887f1.png">




---

## 컴퓨터 구성 / 필수 조건 안내 (Prerequisites) -->
* 안드로이드 사향: 13 (API Level 33)
* 안드로이드 스튜디오 사향: Android Dolphin 2021.3.1
---

## 🔨기술 스택 (Technique Used) 
<table>
 <tr>
  <td><a href='https://kotlinlang.org'><img src='https://user-images.githubusercontent.com/54922625/205429887-a765f73b-1178-4fcf-b144-4218d4562ae1.png' height=80/></a></td>
  <td><a href='https://firebase.google.com/?hl=ko'><img src='https://user-images.githubusercontent.com/54922625/205429851-f59393ce-ac54-4478-bf29-60868cbd7760.png' height=80/></a></td>
 </tr>
 <tr>
  <td align='center'>kotlin</td>
  <td align='center'>Firebase</td>
 </tr>
</table>


## 💽설치 안내 (Installation Process)
### Android

#### 안드로이드 apk 설치하기

[apk 파일 링크]여기에 첨부하기!
위의 링크에 들어가셔서 다운로드 후 설치하시면 됩니다.
 
### Firebase 구동? 그런게 있나?
  처음세팅을 적어도 되고 뭐 쨌든
<내용넣기>


---

## 📱프로젝트 사용법 (Getting Started)
  #### 🐤**백구 앱 사용 방법**
 여기다가 순서대로 정리하기
 1. ㅁㄴ아ㅣ러ㅣㅁ
 2..민ㅇ림날
 
 이런식으로
  
  [시연 영상](https://youtu.be/MTlwTyfn_xI)
  
---

## 📈프로젝트 전망

### 🍎개선할 점



### 💡발전 가능 방향
---

## 🕋팀 정보 (Team Information)

팀설명 간단하게!

안녕하십니까, Team BaekGu입니다.  

<table>
 <tr>
  <td></td>
  <td>Name</td>
  <td>Role</td>
  <td>github</td>
  <td>e-mail</td>
  <td>상세 기능</td>
 </tr>
   
 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>준원님</td>
  <td align='center'>Leader / Back-End(Firebase)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
    <td> Realtime Firebase를 활용한 데이터 활용 및 상품 검색 기능 구현<br>
     설문조사 정보 및 필요단백질량을 기반 유저별 맞춤 식단 구성 API 구현
  </td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>민중님</td>
  <td align='center'>Front-End (kotlin)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
    <td> 회원가입 / 로그인, 상품 / 캘린더 / 프로필 탭, 식단 상세 페이지 구현<br>
반응형 레이아웃 , 디자인적용
</td>
 </tr>
 
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/54922625?v=4" width="50" height="50"></td>
  <td align='center'>Huijae Ryu</td>
  <td align='center'>Back-End (Firebase)</td>
  <td align='center'><a href="https://github.com/hellohidi"><img src="http://img.shields.io/badge/hellohidi-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:fbgmlwo123@naver.com"><img src="https://img.shields.io/badge/fbgmlwo123@naver.com-green?logo=gmail&style=social"/></a></td>
  <td> Realtime Firebase를 활용한 설문조사 저장 및 관리 기능 구현<br>설문조사 정보를 기반으로 필요단백질량 산출기능 구현</td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>Sungeun Yeo</td>
  <td align='center'>Front-End (kotlin)</td>
   <td align='center'><a href="https://github.com/YeoSungeun"><img src="http://img.shields.io/badge/YeoSungeun-green?style=social&logo=github"/></a></td>
 <td align='center'><a href="mailto:dutjddms@naver.com"><img src="https://img.shields.io/badge/dutjddms@naver.com-green?logo=gmail&style=social"/></a></td>
    <td> 로고 디자인 및 스플래시 화면 구현<br>
설문조사, 상품 목록, 상품 상세 정보 페이지 구현
</td>
 </tr>

 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/79249376?v=4" width="50" height="50"></td>
  <td align='center'>jisu Seo</td>
  <td align='center'>Back-End (Firebase)</td>
  <td align='center'><a href="https://github.com/jseo9732"><img src="http://img.shields.io/badge/jseo9732-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:jseo9732@gmail.com"><img src="https://img.shields.io/badge/jseo9732@gmail.com-green?logo=gmail&style=social"/></a></td>
    <td> 회원가입, 로그인, 자동 로그인, 회원 정보 수정 기능 구현
메인 페이지, 상품 상세 페이지 상품 조회 기능 구현
</td>
 </tr>
 
 
   
</table>

---

## 개발 및 협업 플랫폼

<table>
 <tr>
  <td align='center'><a href="https://workspace.google.com/intl/ko/products/drive/"><img src="https://user-images.githubusercontent.com/54922625/205430341-1dd3ada6-5575-4c96-a24d-242f6abc3896.png" height=80/></a></td>
  <td align='center'><a href="https://github.com/"><img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" height=80/></a></td>
  <td align='center'><a href="https://zoom.us"><img src="https://user-images.githubusercontent.com/54922625/205430400-3c6a1687-aed1-44d2-adb6-1cebe4c3c725.png" height=80/></a></td>
  <td align='center'><a href="https://www.notion.so/ko-kr"><img src="https://user-images.githubusercontent.com/54922625/206552600-4041c940-199a-4482-85de-05c4c90b8f26.png" height=80/></a></td>
 </tr>
 
 <tr>
  <td align='center'>Google Drive</td>
  <td align='center'>Github</td>
  <td align='center'>Zoom</td>
  <td align='center'>Notion</td>
 </tr>
   
</table>






