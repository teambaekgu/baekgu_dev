# 백구 : 모두를 위한 군사보안 경보 시스템 <수정할 부분>


<간략한소개>


## 🗂️프로젝트 소개


<details>
 <summary>📃주제 정의 문서</summary>
 
 ### 문제 발견하기
   
 
 ### 문제 정의
 
 
 ### 아이디어 내기
 
 
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
 <summary>🖊개발 문서</summary>

- [UX UI] 처음에 구상한 ui 넣으면 좋을듯 합니다
- [개발 일지-BackEnd] 각자 하나씩 통일해서 파일로 정리를 해볼까요?
- [개발 일지-FrontEnd]각자 하나씩 통일해서 파일로 정리를 해볼까요? 개발일지는 선택사항이니까 나중에 얘기해봅시당
- [멘토링 일지]중간평가 받았던 부분 적으면 될듯합니다
- [회의록]지금까지 회의록 첨부하면 좋을 거 같습니다


</details>


## 📔기능 설명 

<!--
### 🖥화면 정의 (아래 내용은 예시인데 이런느낌으로 해주시면 좋을 거 같습니다)
<table>
 <tr>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689804-f72fc601-00cb-462b-a332-a1bcb62ad8a1.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689811-03fca8d5-26fd-4678-a398-df31655ebae5.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689813-b89f9162-4e74-48c7-9ac6-57e22f355827.png" width="230"/></td>
 </tr>
 <tr>
  <td><img src="https://user-images.githubusercontent.com/40621030/134689816-4aeb35f6-ca24-4bc4-a4b5-902318b8d895.png" width="230"/></td>
  <td><img src="https://user-images.githubusercontent.com/40621030/134766861-33bf44f8-1330-43d2-91af-4a68f2432507.png" width="230"/></td>
 </tr>
</table>
-->

 ### 🐤**Canary app**

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

  
 ### 🐤**Admin Server** (저희는 파이어베이스)


 
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/137884075-bed5c980-72db-472e-820d-6754080d704c.PNG" height="250"/></p>
 Canary app 사용 날짜와 사용자 id, 이미지에서 검출된 객체에 대한 기록이 남습니다.
 
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/137884362-a8e7f87f-167c-4294-ba99-07ebadb3d6e2.PNG" height="250"/></p>
 성능이 가장 좋은 모델의 weight 주소를 조회하여 canary server의 모델을 최신모델로 업데이트 할 수 있습니다.
 
 Django를 사용했기 때문에 Django admin 또한 사용할 수 있습니다.
 <p align='center'><img src="https://user-images.githubusercontent.com/86545225/137576790-1e7b5459-fdbd-4cc8-9e3b-d27a3bd3b1b4.jpg" height="250"/></p>

---

## 컴퓨터 구성 / 필수 조건 안내 (Prerequisites) -->
* 안드로이드 사향?
* 안드로이드 스튜디오 사향?
* 파이어베이스도 그런게 잇을까요?

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
---

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
 </tr>
   
 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>준원님</td>
  <td align='center'>Leader / Back-End(Firebase)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>민중님</td>
  <td align='center'>Front-End (kotlin)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
 </tr>
 
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/54922625?v=4" width="50" height="50"></td>
  <td align='center'>Huijae Ryu</td>
  <td align='center'>Back-End (Firebase)</td>
  <td align='center'><a href="https://github.com/hellohidi"><img src="http://img.shields.io/badge/hellohidi-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:fbgmlwo123@naver.com"><img src="https://img.shields.io/badge/fbgmlwo123@naver.com-green?logo=gmail&style=social"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>성은님</td>
  <td align='center'>Front-End (kotlin)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="x" width="50" height="50"></td>
  <td align='center'>지수님</td>
  <td align='center'>Back-End (Firebase)</td>
  <td align='center'><a href="x"><img src="x"/></a></td>
  <td align='center'><a href="x"><img src="x"/></a></td>
 </tr>
   
</table>

---

## 개발 및 협업 플랫폼

<table>
 <tr>
  <td align='center'><a href="https://workspace.google.com/intl/ko/products/drive/"><img src="https://user-images.githubusercontent.com/54922625/205430341-1dd3ada6-5575-4c96-a24d-242f6abc3896.png" height=80/></a></td>
  <td align='center'><a href="https://github.com/"><img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" height=80/></a></td>
  <td align='center'><a href="https://zoom.us"><img src="https://user-images.githubusercontent.com/54922625/205430400-3c6a1687-aed1-44d2-adb6-1cebe4c3c725.png" height=80/></a></td>
 </tr>
 
 <tr>
  <td align='center'>Google Drive</td>
  <td align='center'>Github</td>
  <td align='center'>Zoom</td>
 </tr>
   
</table>
 





# baekgu_dev
- **레이아웃 이름**
    - 액티비티 : activity_도메인
    - 프레그먼트 : fragment_도메인
    - 리사이클러뷰 : item_도메인
    - 다이얼로그 : dialog_도메인

## activity
### 클래스 
- Activity(이름) ex) 회원가입클래스 : ActivitySignup

### xml
- activity_이름 ex) 회원가입 화면 : activity_signup


## fragment
### 클래스
- Fragment(이름) ex) 상품화면 : FragmentProduct
-
### xml
- fragment_이름 ex) 상품화면 : fragment_product

## 레이아웃 이름
### 도메인_컴포넌트_용도
- ex) 회원가입 화면안에서 이름을 보여주는 TextView : signup_tv_name

### 함수명,변수명
- camelCase
- 동사 + 명사구 + (전치사)






# baekgu_dev
- **레이아웃 이름**
    - 액티비티 : activity_도메인
    - 프레그먼트 : fragment_도메인
    - 리사이클러뷰 : item_도메인
    - 다이얼로그 : dialog_도메인

## activity
### 클래스 
- Activity(이름) ex) 회원가입클래스 : ActivitySignup

### xml
- activity_이름 ex) 회원가입 화면 : activity_signup


## fragment
### 클래스
- Fragment(이름) ex) 상품화면 : FragmentProduct
-
### xml
- fragment_이름 ex) 상품화면 : fragment_product

## 레이아웃 이름
### 도메인_컴포넌트_용도
- ex) 회원가입 화면안에서 이름을 보여주는 TextView : signup_tv_name

### 함수명,변수명
- camelCase
- 동사 + 명사구 + (전치사)
