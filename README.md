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

## 📔템플릿구조
- 본 코드는 mvp디자인 패턴을 기반으로 하고있다
- 폴더 구조는 크게 config 폴더, src 폴더, util 폴더로 이루어져 있다.

---

> config 폴더
> 

```

근간이 되는 코드들이 위치해 있다.

< ApplicationClass >

앱이 실행될 때 맨 처음 실행되는 코드들이 위치해 있다.
따라서 각종 전역변수와 앱이 실행될 동안 한 번만 유지되면 되는 객체(싱글톤 객체)들을 생성하는 코드들이 위치해 있다.

< BaseActivity & BaseFragment >

예를들어 로딩창을 띄우는 것, 토스트 메세지 띄우는 것등 자주 쓰이지만, 중복이 많이 되는 코드들 모듈화 하여 작성한 코드들이 위치해 있다.

< XAccessTokenInterceptor >

이 부분은 코드를 따로 건드릴 필요는 없는 부분이다.
네트워크 통신을 할때, jwt토큰 헤더설정 등과 같이 네트워크 통신 관련하여 공통적으로 처리해야 하는 것들을 설정하는 코드가 위치해 있다.

```

---

> src 폴더
> 

```

src 폴더는 Config/ 의 베이스 코드들을 기반으로, Activity나 Fragment 등을 동작시키는
즉 앱을 동작시키는 구체적인 구현을 코드들이 위치해 있다.

src 폴더는 도메인(화면)별로 폴더가 나눠져있.
src 폴더의 구조는 메인화면, 스플래쉬 화면 등 큰 도메인별로 나눠져있고, Fragment별 작은 도메인으로 나눠져있다.
예를들어 메인화면이라는 큰 도메인 폴더안에, 홈 화면과 내정보 화면 등과 같은 작은 도메인 폴더들이 있다.

- rv : ViewPager나 RecyclerView 설정에 대한 코드들이 위치해 있다.

```

---

> util 폴더
> 

```

말 그대로 도구처럼 사용되는 코드들이 위치해 있다. Dialog , BottomSheet , Firebase ,RecyclerViewSpacing관련 클래스들이 위치해 있다.

```
  


 ### 🐾 Front-End
 
 **사용된 라이브러리**
 <br>
 com.github.bumptech.glide:glide:4.12.0
 <br>
 androidx.viewpager2:viewpager2:1.0.0
 <br>
 com.github.xabaras:RecyclerViewSwipeDecorator:1.4
 <br>
 de.hdodenhof:circleimageview:3.1.0
 <br>
 com.google.code.gson:gson:2.9.0
 <br>
 com.squareup.retrofit2:converter-gson:2.9.0
  
 [**앱 처음 실행 시**]

 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206642963-bac026b0-aa50-4e59-875d-edb0bbe7f753.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206642817-9d7d6d55-165f-498c-8b36-ab86365fea3c.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206642890-0d53c15e-2623-4822-a6cf-046637383962.png" width="200"/></td>
  </tr>
 </table>

 앱을 실행 후 로딩 될 때 백구 캐릭터가 담긴 splash 화면으로 시작합니다.</br>
 사용자는 계정이 있는 경우 로그인하여 메인 페이지로 이동하고 첫 사용자 일 경우에는 회원가입을 진행합니다.</br>
 회원 가입은 이메일, 비밀번호, 이름 외 개인 정보들을 입력하고 완료 시 파이어베이스 DB로 저장됩니다.</br>
 
 <br><br><br>
  [**설문 조사**]
 
 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206644050-5600e2f3-88d8-4ec8-9f49-97f33ec594a2.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206644095-9a58df84-356a-47b7-aa0a-c348f4896198.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206644143-9b1d79f6-4f28-4f34-8c36-eb6365660ffc.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206644202-2ff91aaf-83ef-408f-b4ef-1b17c155ff12.png" width="200"/></td>
  </tr>
 <table>
 
 회원 가입 후에는 개인 맞춤 단백질 제공 식단 편성을 위한 설문조사 화면으로 이동합니다. </br>
 신체 정보와 단백질 섭취 목적, 운동 강도와 횟수, 알레르기, 제품별 및 맛 선호도를 조사해 </br>
 DB에 저장하고 설문 조사 항목들을 바탕으로 목표 단백질 섭취량을 계산해 줍니다. </br>
 
  <br><br><br>
  [**메인 페이지 (피드)**]

 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206645139-7b839e17-9724-40ef-879e-154716528bc5.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206645425-c005d9b4-5031-4dbd-8685-552a9e7561b3.png" width="200"/></td>
  </tr>
 </table>
 메인화면에 피드 부분에서는 카테고리 별 서비스에서 제공하는 상품들 목록을 확인할 수 있습니다. </br>
 상하 스크롤을 통해 카테고리 열람이 가능하고 카테고리에서 좌우 스크롤 시 해당 카테고리의 제품을 확인할 수 있습니다.</br>
 <br><br>
  <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206645718-0c8a40da-3328-4868-a1e0-783cbd7276ef.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206645774-6097216c-9d5b-44d0-a54c-a661d793385f.png" width="200"/></td>
  </tr>
 </table>
 
 메인화면 속 개별 제품을 클릭하면 해당 제품의 영양 성분과 상품정보를 확인할 수 있습니다.</br>
 <br><br><br>
 
 [**메인 페이지 (캘린더)**]
  
 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646277-65fbb2c4-cdc1-4006-a4dd-18db0cd98254.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646324-0b82a42b-a446-4808-a888-4b04571d17d1.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646371-38573c84-d3cc-41d9-83be-e5fcefccff0e.png" width="200"/></td>
  </tr>
 </table>
 
 메인화면에 캘린더 부분에서는 설문조사에 따라 편성된 한 달 치 식단을 확인할 수 있습니다.</br>
 날짜를 클릭하고 더 보기를 누르면 상세 식단을 확인할 수 있고 좌우 스크롤을 하면 근접 날짜의 식단도 확인할 수있습니다. </br>
 섭취한 목록을 체크면 그 날짜에 섭취한 단백질량을 업데이트해주어 확인할 수 있습니다. </br>
 <br><br><br>
 [**메인 페이지 (마이페이지)**]

 <table>
  <tr>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646565-d1b6aaf0-37fb-4641-99a4-1356c36eea88.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646614-7d204f81-ae3f-4766-804b-b5ed5d733530.png" width="200"/></td>
   <td><img src="https://user-images.githubusercontent.com/109564764/206646663-9d3d716b-9686-47ee-9ff8-a39ea03006c6.png" width="200"/></td>
  </tr>
 </table>
 마이페이지 부분에서는 사용자의 프로필과 신체정보, 목표 단백질량을 볼 수 있고 개인 정보와 설문 정보를 수정할 수 있습니다.</br>
 개인정보 수정 버튼을 클릭 시 프로필 수정 화면이 나타나고 개인정보를 변경할 수 있습니다. </br>
 또한 설문조사 정보 수정을 클릭 시 설문조사를 다시진행하여 설문 정보를 변경할 수 있습니다. </br>
 
 
 ### 🐾 Back-End (Firebase)

 #### 1. 사용자 정보
   1. 이메일 형식과 비밀번호 형식(영문, 숫자, 특수문자 조합), 빈칸 유무를 확인 후 이상이 없으면 회원가입 함수를 실행한다.
   ``` kotlin
   // 회원가입 완료 버튼
   binding.signupTvFinish.setOnClickListener() {
       emailValue = binding.signupEditId.text.toString()
       pwValue = binding.signupEditPw.text.toString()
       nameValue = binding.signupEditName.text.toString()
       birthValue = binding.signupEditBirthday.text.toString()
       phoneValue = binding.signupEditNumber.text.toString()
       addressValue = binding.signupEditTown.text.toString()
       // 이메일 형식 확인
       if(android.util.Patterns.EMAIL_ADDRESS.matcher(emailValue).matches()) {
           // 비밀번호 형식 확인
           if (Pattern.matches(
                   "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[\$@\$!%*#?&])[A-Za-z[0-9]\$@\$!%*#?&]{8,20}\$", pwValue)) {
               // 나머지 값 빈 칸이 있는지 확인
               if(nameValue.isNotEmpty() && birthValue.isNotEmpty() && phoneValue.isNotEmpty() && addressValue.isNotEmpty()) {
                   // 파이어베이스 Authentication 계정 생성
                   createAccount(
                       binding.signupEditId.text.toString(),
                       binding.signupEditPw.text.toString()
                   )
               } else {
                   Toast.makeText(baseContext, "모든 항목을 다 입력해주세요.", Toast.LENGTH_SHORT).show()

               }
           } else {
               Toast.makeText(baseContext, "8~16자 영문, 숫자, 특수문자를 사용하세요.", Toast.LENGTH_SHORT).show()
           }
       } else {
           Toast.makeText(baseContext, "이메일 형식이 아닙니다.", Toast.LENGTH_SHORT).show()
       }
   }
   ```
  
   2. 이메일 중복없이 회원가입에 성공하면 Firebase Authentication에 계정을 등록한다. 실패 시 Toast 메세지 출력
  <img width="773" alt="스크린샷 2022-12-09 오전 8 36 18" src="https://user-images.githubusercontent.com/79249376/206589342-1499a5be-51f7-48dc-828e-d8a417436e31.png">

   ``` kotlin
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
           }
       }
    }
   ```
  
   3. 회원가입에서 입력한 정보를 Firebase Realtime DataBase users에 저장한다. 각각의 타입은 아래와 같다.
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
   <img width="504" alt="스크린샷 2022-12-09 오전 7 51 59" src="https://user-images.githubusercontent.com/79249376/206586583-1afee694-3844-4c1a-a1f3-20b1b4b75692.png">

  
   ``` kotlin
   // 파이어베이스 Realtime Database 저장 형식
   @IgnoreExtraProperties
   data class User(val name: String, val birth: String, val phone: String, val address: String) {
       // Null default values create a no-argument default constructor, which is needed
       // for deserialization from a DataSnapshot.
   }

   // Firebase Realtime Database 저장 함수
   fun writeNewUser(email: String, name: String, birth: String, phone: String, address: String) {
       database = Firebase.database.reference
       val user = User(name, birth, phone, address)

       database.child("users").child(email).setValue(user)
   }
   ```
  
   4. signInWithEmailAndPassword 메서드를 사용해 Firebase Authentication에 저장된 데이터와 일치 여부를 판단한다.
      Firebase Realtime Database에 저장된 데이터를 조회하여 변수에 저장한 뒤 마이페이지 내용을 유저에 맞게 변경한다.
   ``` kotlin
    // 로그인 함수
    private fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // 로그인 성공하면 메인화면으로 화면 전환
                    intent = Intent(this,MainActivity::class.java)
                    intent.putExtra("user_id",binding.loginEditId.text.toString())
                    startActivity(intent)
                    val user = auth.currentUser

                    // 파이어베이스 Realtime Database 조회 후 그 정보로 프레퍼런스 업데이트
                    user?.let {
                        val uid = user.uid
                        val email = user.email

                        database = Firebase.database.reference
                        database.child("users").child(uid).child("name").get().addOnSuccessListener {
                            var nameValue = it.value.toString()
                        }
                        database.child("users").child(uid).child("birth").get().addOnSuccessListener {
                            var birthValue = it.value.toString()
                        }
                        database.child("users").child(uid).child("phone").get().addOnSuccessListener {
                            var phoneValue = it.value.toString()
                        }
                        database.child("users").child(uid).child("address").get().addOnSuccessListener {
                            var addressValue = it.value.toString()
                        }
                    }
                }
                else {
                    // 로그인 실패 시 프레퍼런스 null 값으로 업데이트
                    Toast.makeText(baseContext, "이메일 또는 비밀번호를 잘못 입력했습니다.", Toast.LENGTH_SHORT).show()
                }
            }
    }
   ```
  
   5. 이미 로그인한 유저는 별도의 로그인없이 메인 액티비티로 이동한다.
   ``` kotlin
     override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }

     // 로그인 기록이 있으면 메인 액티비티로 이동
     private fun reload() {
         var intent = Intent(this, MainActivity::class.java)
         startActivity(intent)
     }

   ```
  
   6. 비밀번호 수정이 있으면 Firebase Authentication에 비밀번호 수정 요청을 보내고 나머지 정보는 Realtime Database에 새 정보를 새로 저장한다.
   ``` kotlin
   // 수정 완료 버튼
   binding.profileEditTvFinish.setOnClickListener {
       val user = Firebase.auth.currentUser!!
       var newEmailValue = binding.profileEditEditId.text.toString()
       var newPwValue = binding.profileEditEditPw.text.toString()
       var newNameValue = binding.profileEditEditName.text.toString()
       var newBirthValue = binding.profileEditEditBirthday.text.toString()
       var newPhoneValue = binding.profileEditEditNumber.text.toString()
       var newAddressValue = binding.profileEditEditTown.text.toString()

       if (pwValue == newPwValue && nameValue == newNameValue && birthValue == newBirthValue && phoneValue == newPhoneValue && addressValue == newAddressValue) {
           Toast.makeText(baseContext, "수정 사항이 없습니다.", Toast.LENGTH_SHORT).show()
       } else {
           if (Pattern.matches(
                   "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[\$@\$!%*#?&])[A-Za-z[0-9]\$@\$!%*#?&]{8,20}\$", newPwValue)) {
               if(newNameValue.isNotEmpty() && newBirthValue.isNotEmpty() && newPhoneValue.isNotEmpty() && newAddressValue.isNotEmpty()) {
                   // 회원 정보 수정
                   user?.let {
                       val uid = user.uid

                       // 원래 비밀번호랑 다르면 비밀번호 수정
                       if(pwValue != newPwValue) {
                           // 파이어베이스 사용자 재인증 - 이메일, 비밀번호 수정 전 한번 해줘야함
                           val credential = EmailAuthProvider.getCredential(emailValue.toString(), pwValue.toString())
                           user.reauthenticate(credential).addOnCompleteListener {
                               Log.d("회원정보 수정", "유저 재인증 완료")
                           }

                           // 파이어베이스 탑재 비밀번호 수정 메소드
                           user!!.updatePassword(binding.profileEditEditPw.text.toString())
                               .addOnCompleteListener { task ->
                                   if (task.isSuccessful) {
                                       Log.d("비밀번호 수정", "비밀번호 변경 완료")
                                   }
                               }
                       }

                       // 파이어베이스 리얼타임 데이터베이스 수정
                       fun updateUser(email: String, name: String, birth: String, phone: String, address: String) {
                           database = Firebase.database.reference
                           val user = SignupActivity.User(name, birth, phone, address)

                           database.child("users").child(email).setValue(user)

                           Toast.makeText(baseContext, "개인 정보 수정 완료되었습니다.", Toast.LENGTH_SHORT).show()
                           finish()
                       }
                   }
               } else {
                   Toast.makeText(baseContext, "모든 항목을 다 입력해주세요.", Toast.LENGTH_SHORT).show()

               }
           } else {
               Toast.makeText(baseContext, "8~16자 영문, 숫자, 특수문자를 사용하세요.", Toast.LENGTH_SHORT).show()
           }
       }
   }
   ```
  
   7. 로그아웃
   ``` kotlin
   // 로그아웃 기능
   binding.fgProfileTvLogout.setOnClickListener {
       Firebase.auth.signOut()
       var intent= Intent(requireContext(), LoginActivity::class.java)
       startActivity(intent)
   }
   ```

 
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
* 안드로이드 사향: 13 (API Level 32)
* 안드로이드 스튜디오 사향: Android Dolphin 2021.3.1
* MinSdkVersion: 28
* TargetSdkVrsion: 32
* Kotlin Version: 1.7.20
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
 1. Build -> Build Bundle/APK -> Build APK
 2. 추출한 APK를 실행하고싶은 기기에서 실행한다
 
 이런식으로
  
  [<img width="1179" alt="스크린샷 2022-12-09 오후 7 08 43" src="https://user-images.githubusercontent.com/79249376/206678205-d2f9727b-1636-4cdd-8138-5d4f574bbb47.png">](https://drive.google.com/file/d/1uDMCDRXEKIsqaxD6j7pUWlfAMqSH37FW/view?usp=share_link)
  [시연 영상](https://drive.google.com/file/d/1uDMCDRXEKIsqaxD6j7pUWlfAMqSH37FW/view?usp=share_link)


---

## 📈프로젝트 전망

### 🍎개선할 점
  &nbsp; 로그인 기능 : 
  - 파이어베이스 통해 회원 관리를 하고 있는데 추가로 소셜 로그인 기능을 구현하기

  &nbsp; 회원 가입 기능:
  - string으로 받는 주소 부분을 주소 API를 사용하여 개선하기
  - 전화번호, 생년월일 steing 받는 것이 아닌 정확한 포맷으로 정보 수집하기

  &nbsp; 상품목록 :
  - 상품목록 카테고리와 상품을 다양화하기
  - 카테고리 뿐만 아니라 메인 페이지에 추천 제품 나타내기

  &nbsp; 설문조사 : 
  - 알레르기 항목 세분화하여 적용 
  - 설문조사 UI 더 보기 좋게 개선하기

  &nbsp; 마이페이지 :
  - 단백질 섭취량 조절할 수 있게 설정하기
  - 설문조사 수정 부분 수정 체크 항목 간편하게 개선하기




### 💡발전 가능 방향
 - 2030 대상으로 사용자 분석을 실시 한 결과  단백질 식단 편성 서비스에 긍정적인<br/> 반응을 보였고 편성 식단에 맞춘 배달 서비스에 대하여 관심을 보였다. 

* 분석 결과에 따라 결제 및 배송 서비스에 대한 기능들을 추가적으로 구현하고 개선해<br/> 식단 추천 서비스를 받고 직접 상품까지 구매할 수 있는 플랫폼 서비스로 많은 사용자의<br/> 관심을 받을 수 있는 앱으로 발전시킬 수 있을 것이라 예상한다.

 
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
  <td align='center'><img src="x" width="100" height="100"></td>
  <td align='center'>준원님</td>
  <td align='center'>Leader / Back-End(Firebase)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
    <td> Realtime Firebase를 활용한 데이터 활용 및 상품 검색 기능 구현<br>
     설문조사 정보 및 필요단백질량을 기반 유저별 맞춤 식단 구성 API 구현
  </td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="100" height="100"></td>
  <td align='center'>민중님</td>
  <td align='center'>Front-End (kotlin)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
    <td> 회원가입 / 로그인, 상품 / 캘린더 / 프로필, 식단 상세 페이지 구현<br>
반응형 레이아웃 , 디자인적용
</td>
 </tr>
 
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/54922625?v=4" width="100" height="100"></td>
  <td align='center'>Huijae Ryu</td>
  <td align='center'>Back-End (Firebase)</td>
  <td align='center'><a href="https://github.com/hellohidi"><img src="http://img.shields.io/badge/hellohidi-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:fbgmlwo123@naver.com"><img src="https://img.shields.io/badge/fbgmlwo123@naver.com-green?logo=gmail&style=social"/></a></td>
  <td> Realtime Firebase를 활용한 설문조사 저장 및 관리 기능 구현<br>설문조사 정보를 기반으로 필요단백질량 산출기능 구현</td>
 </tr>

 <tr>
  <td align='center'><img src="https://user-images.githubusercontent.com/109564764/206620876-4172d475-8930-4829-9b7e-d6b9d248c59e.jpeg" width="50" height="50"></td>
  <td align='center'>Sungeun Yeo</td>
  <td align='center'>Front-End (kotlin)</td>
   <td align='center'><a href="https://github.com/YeoSungeun"><img src="http://img.shields.io/badge/YeoSungeun-green?style=social&logo=github"/></a></td>
 <td align='center'><a href="mailto:dutjddms@naver.com"><img src="https://img.shields.io/badge/dutjddms@naver.com-green?logo=gmail&style=social"/></a></td>
    <td> 로고 디자인 및 스플래시 화면 구현<br>
설문조사, 상품 목록, 상품 상세 정보 페이지 구현
</td>
 </tr>

 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/79249376?v=4" width="100" height="100"></td>
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






