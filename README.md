# 백구 : 모두를 위한 군사보안 경보 시스템 <수정할 부분>

<p align='center'>
<img src="https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/blob/main/image/canary_2.0.png" alter="LOGO"/><br>
 <img src='https://img.shields.io/badge/Version-1.0.0-blue?style=for-the-badge&logo'>
 <a href='https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/blob/main/LICENSE'><img src='https://img.shields.io/badge/License-GNU GPL v3.0-blue?style=for-the-badge&logo'></a>
</p>

Canary는 머신러닝을 활용하여 사진 안의 보안 위반 가능성이 있는 요소를 식별하고, 자동 모자이크 처리를 하고, 이를 사용자에게 경고해주는 통합 보안 경보 시스템입니다. 
Canary App, Canary in Instagram, Admin logweb으로 구성되어 있으며, 앱에서 처리된 사진에는 QR코드가 들어가 처리 여부를 쉽게 식별할 수 있습니다.

## 🗂️프로젝트 소개
본 프로젝트는 사진의 보안 내용을 제거하는 기능과 그러한 기능을 가진 카메라를 제공함으로서,  
* **군 내에서 카메라를 사용 가능하게 함**과 동시에,
*  SNS에 올릴 사진의 보안 위반 가능성을 경고하여 사용자가 **자발적으로** 보안을 준수 할 수 있게 합니다.
*  또 현재 SNS올라가 있는 게시물을 검사를 해 **보안에 대한 경각심**을 일으킬 수 있습니다.


<details>
 <summary>📃주제 정의 문서</summary>
 
 ### 문제 발견하기
   - 2018년 12월 27일 국방부는 ‘병영문화 혁신 정책’으로 병사들의 일과 후 핸드폰 사용을 결정했습니다. 
   - 이 영향으로 군대 내의 많은 부조리가 사라졌고 병사들의 스트레스가 줄어드는 등 여러 긍정적인 효과가 나타났습니다.  
   - 하지만 군사 보안을 이유로 휴대폰의 중요한 기능 중 하나인 카메라 사용을 전면적으로 통제 하고 있는 상황입니다.  
 
 ### 문제 정의
 - 현재 '국방모바일보안' 어플로 군 장병들의 카메라 사용이 전면적으로 차단된 상황입니다.
 - 추억 남기기, 부모님께 자신의 모습 보여드리기, 공익을 위한 제보 등 카메라가 있어야만 가능한 일들을 할 수 없고, 이로 인한 장병들의 사기 저하가 발생하고 있습니다.
 - 그러나 카메라 사용을 제약 없이 허용할 시 군사기밀 등의 유출 가능성이 존재, 국가 안보에 심각한 위협이 가해질 수 있습니다.
 
 ### 아이디어 내기
 
 - "보안 위반 가능성이 있는 요소들을 식별하여 모자이크 처리를 해 주는 카메라를 만들자."
 - "모호한 군사 보안 규정을 사용자에게 정확하게 알려주어 보안 사고를 사전에 방지하자."
 - "또한, 이미 업로드 된 SNS 게시글도 사용자가 요청한다면 보안위반 가능성을 경고해 주는 기능을 제공하자."
 
</details>


<details>
 <summary>📈시스템 흐름도</summary>
 
 ### User-case Diagram
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/134690667-abe8f797-01a8-44db-ae89-ef7809c22d64.png"/></p>
 
 ### Sequence Diagram
  <p align='center'><img src="https://user-images.githubusercontent.com/40621030/136720501-bbe98072-abbc-4797-a0c2-c66771f7e04a.png"/></p>
 
 ### Architecture
  <p align='center'><img src="https://user-images.githubusercontent.com/40621030/136720255-0456ffd4-4d7d-4d2e-b5c5-09387c5861fa.png"/></p>
</details>

<details>
 <summary>🖊개발 문서</summary>

- [Github wiki home](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki)
- [DesignThinking](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/DesignThinking)
- [UX UI](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/UX-UI)
- [개발 일지-AI](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/AI)
- [개발 일지-BackEnd](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/%EB%B0%B1%EC%97%94%EB%93%9C)
- [개발 일지-FrontEnd](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/%ED%94%84%EB%A1%A0%ED%8A%B8%EC%97%94%EB%93%9C)
- [개발 일지-Instagra chatbot](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/SNS-Bot)
- [개발 타임라인](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/%EA%B0%9C%EB%B0%9C-%ED%83%80%EC%9E%84%EB%9D%BC%EC%9D%B8)
- [멘토링 일지](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/%EB%A9%98%ED%86%A0%EB%A7%81-%EC%9D%BC%EC%A7%80)
- [회의록](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/wiki/%ED%86%B5%ED%95%A9-%ED%9A%8C%EC%9D%98%EB%A1%9D)


</details>


## 📔기능 설명

<!--
### 🖥화면 정의
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

 ### 🐤**Admin Server**

 Canary app의 사용 log를 보고와 model, dataset version관리를 할 수 있는 API Server입니다.  
 node js에서도 해당 기능을 쓰는 만큼 여러 플랫폼에서 접근 가능하도록 REST API Server로 구성했습니다.
 
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/137884075-bed5c980-72db-472e-820d-6754080d704c.PNG" height="250"/></p>
 Canary app 사용 날짜와 사용자 id, 이미지에서 검출된 객체에 대한 기록이 남습니다.
 
 <p align='center'><img src="https://user-images.githubusercontent.com/40621030/137884362-a8e7f87f-167c-4294-ba99-07ebadb3d6e2.PNG" height="250"/></p>
 성능이 가장 좋은 모델의 weight 주소를 조회하여 canary server의 모델을 최신모델로 업데이트 할 수 있습니다.
 
 Django를 사용했기 때문에 Django admin 또한 사용할 수 있습니다.
 <p align='center'><img src="https://user-images.githubusercontent.com/86545225/137576790-1e7b5459-fdbd-4cc8-9e3b-d27a3bd3b1b4.jpg" height="250"/></p>

---

## 컴퓨터 구성 / 필수 조건 안내 (Prerequisites) --> 
* ECMAScript 6 지원 브라우저 사용
* 권장: Google Chrome 버젼 77 이상
* python >= 3.6 
* pytorch >= 1.7

---

## 🔨기술 스택 (Technique Used) 
### Server(back-end)
<table>
 <tr>
  <td><a href='https://nodejs.org/ko/'><img src='https://user-images.githubusercontent.com/40621030/136699173-a5a2e626-9161-4e30-85fd-93898671896e.png' height=80/></a></td>
  <td><a href='https://www.mysql.com/'><img src='https://user-images.githubusercontent.com/40621030/136699174-e540729d-0092-447c-b672-dfa5dcfd41a7.png' height=80/></a></td>
  <td><a href='https://www.goorm.io//'><img src='https://res.cloudinary.com/crunchbase-production/image/upload/c_lpad,f_auto,q_auto:eco,dpr_1/uifol9klj1ht0squxhje' width = 200 height=120/></a></td>
 </tr>
 <tr>
  <td align='center'>Node js</td>
  <td align='center'>MySQL</td>
  <td align='center'>Goorm Server Deploy</td>
 </tr>
</table>

<details>
 <summary>Node js 설명</summary>
 
 ### MySQL 데이터베이스 구성
 - Database 명 : Node_db
 - DB 관리자 명 : node_admin

 - User Table
   - id : 유저 id
   - name : 유저 이름
   - d_num : 유저 군번
   - password : 유저 비밀번호
   - time : 유저 생성 TimeStamp
 ```
 mysql> desc user_t;
 +----------+-------------+------+-----+-------------------+----------------+
 | Field    | Type        | Null | Key | Default           | Extra          |
 +----------+-------------+------+-----+-------------------+----------------+
 | id       | int(10)     | NO   | PRI | NULL              | auto_increment |
 | name     | varchar(20) | NO   |     | NULL              |                |
 | d_num    | varchar(10) | NO   | UNI | NULL              |                |
 | password | varchar(70) | NO   |     | NULL              |                |
 | time     | datetime    | YES  |     | CURRENT_TIMESTAMP |                |
 +----------+-------------+------+-----+-------------------+----------------+

 mysql> select * from user_t;
 +----+-------------+------------+--------------------------------------------------------------+---------------------+
 | id | name        | d_num      | password                                                     | time                |
 +----+-------------+------------+--------------------------------------------------------------+---------------------+
 | 23 | test user   | 2000001111 | 1234                                                         | 2021-10-15 14:19:17 |
 | 24 | 211015User2 | 2001112234 | $2b$08$lXHyNYavVlyr71UyREC54eppxSfTZGq41by4o9VeeqFfmE8oETJbO | 2021-10-15 14:47:18 |
 | 25 | 오삼핵      | 2176032332 | $2b$08$B85JF1HCTvsYcGvZlFuG2OXlBNvascx6sD/La/k1x.VxO35whIa1i | 2021-10-15 14:50:49 |
 | 26 | 211012User  | 2012341234 | $2b$08$8OBxs8J3Qu9VKyno4KltXuVykBIOYUgX0Apf9NXdECF4cWt4XzVuC | 2021-10-16 07:53:41 |
 +----+-------------+------------+--------------------------------------------------------------+---------------------+
 ```

 - Upload Table
   - uploader_d_num : 업로드 유저의 군번
   - img_id : 유저 업로드 img id
   - upload_time : img 업로드 TimeStamp
 ```
 mysql> desc upload_t;
 +----------------+-------------+------+-----+-------------------+-------+
 | Field          | Type        | Null | Key | Default           | Extra |
 +----------------+-------------+------+-----+-------------------+-------+
 | uploader_d_num | varchar(10) | NO   | MUL | NULL              |       |
 | img_id         | varchar(30) | NO   | PRI | NULL              |       |
 | upload_time    | datetime    | YES  |     | CURRENT_TIMESTAMP |       |
 +----------------+-------------+------+-----+-------------------+-------+

 mysql> select * from upload_t;
 +----------------+-----------------------+---------------------+
 | uploader_d_num | img_id                | upload_time         |
 +----------------+-----------------------+---------------------+
 | 2176000528     | decoded_1634309470576 | 2021-10-15 14:51:10 |
 | 2176000528     | decoded_1634309639604 | 2021-10-15 14:53:59 |
 | 2176000528     | decoded_1634309884641 | 2021-10-15 14:58:04 |
 | 2176000528     | decoded_1634310044242 | 2021-10-15 15:00:44 |
 | 2001112234     | decoded_1634370069825 | 2021-10-16 07:41:09 |
 | 2001112234     | decoded_1634370191443 | 2021-10-16 07:43:11 |
 +----------------+-----------------------+---------------------+
 ```

 ***
  ### API문서
  *auth - Authentication Handling*

  **POST /auth/create-user**  
  > parameters: {"name": "string", "d_num":"string", "password": "string"}   
  > status: 201   
  > respose: {"status":201,"user_name":name,"msg":'User Created Successful'}

  **POST /auth/login**  
  > parameters: {"d_num": "string", "password": "string"}   
  > status: 200   
  > respose: {"status":200,"msg":"User : ${db_result[0].name} => Login Successful"}


  *img - Images Handling*

  **POST /img/upload**
  > parameters: {"img_binary":"base64 encoded string","d_num":"string"}   
  > status: 200 -> 204 or 205로 변경 고려   
  > respose: {"status":200,"imd_id":img_id,"user_d_num":d_num}

  **GET /img/output-params/:img_id/:d_num**
  > parameters: {"name": "string", "d_num":"string", "password": "string"}   
  > status: 200   
  > respose: {"status":201,"user_name":name,"msg":'User Created Successful'}
 </details>
 
### Front-end
<table>
 <tr>
  <td align='center'><img src='https://user-images.githubusercontent.com/40621030/136700782-179675b0-9bae-4ecf-b94a-e73073d24be5.png' height=80></td>
  <td align='center'><img src='https://user-images.githubusercontent.com/19565940/137632602-01a7fc0f-00af-49af-bc96-8aee25b83a9d.png' height=80></td>
  <td align='center'><img src='https://user-images.githubusercontent.com/19565940/137632657-bf613560-c27e-4dcf-b229-024230185e3b.png' height=80></td>
 </tr>
 <tr>
  <td align='center'>Flutter</td>
  <td align='center'>Libraries from pub.dev</td>
  <td align='center'>Dart</td>
 </tr>
</table>
<details>
 <summary>Flutter / Dart Packages</summary>
 
- [`get: ^4.3.8`](https://pub.dev/packages/get)
- [`http: ^0.13.3`](https://pub.dev/packages/http)
- [`validators: ^3.0.0`](https://pub.dev/packages/validators)
- [`image: ^3.0.5`](https://pub.dev/packages/image)
- [`image_picker: ^0.8.4+2`](https://pub.dev/packages/image_picker)
- [`animated_text_kit: ^4.2.1`](https://pub.dev/packages/animated_text_kit)
- [`flutter_pw_validator: ^1.2.1`](https://pub.dev/packages/flutter_pw_validator)
- [`string_validator: ^0.3.0`](https://pub.dev/packages/string_validator)
- [`qr_flutter: ^4.0.0`](https://pub.dev/packages/qr_flutter)
- [`path_provider: ^2.0.5`](https://pub.dev/packages/path_provider)
- [`url_launcher: ^6.0.12`](https://pub.dev/packages/url_launcher)
- [`cupertino_icons: ^0.1.2`](https://pub.dev/packages/cupertino_icons)


</details>




 <table>
  <tr>
   <td align='center'>Original Image</td>
   <td align='center'>Result Image</td>
  </tr>
  <tr>
   <td align='center'><img src='https://user-images.githubusercontent.com/40621030/136698553-a00eb618-7783-41d9-bd2c-203dbbd60946.jpg' width="500"/></td>
   <td align='center'><img src='https://user-images.githubusercontent.com/40621030/136698552-42c71108-9efc-4c88-a68a-3f5aec8452c6.jpg' width="500"/></td>
  </tr>
 </table>
 
 ### 실행 및 예시 ([link](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/tree/main/AI(BE)/deeplearning/kwoledge_distillation_yolov5))
</details>

---

## 💽설치 안내 (Installation Process)
### Flutter

#### 웹앱으로 설치하기
```bash 
 git clone https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary.git
 cd AI_APP_WEB_Canary_Canary/APP/myApp
 flutter run -d web-server --web-hostname=0.0.0.0
 ```
#### 안드로이드 apk 설치하기

[apk 파일 링크](https://drive.google.com/file/d/1HYsxGjHF1yBPuWPqCFXf7m7QLAFRb6hg/view?usp=sharing)  
위의 링크에 들어가셔서 다운로드 후 설치하시면 됩니다.
 
### Node js
#### AI를 이용하여 이미지를 처리하기 위해, AI(BE)의 requirements가 충족된 상태에서 Node 서버를 구동해야 합니다.
```bash
cd node_server
npm install # 통해 필요한 패키지들 다운로드
node app.js # (일회성 시행)
```


### Deep learning
 
 ```bash
 git clone https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/
 cd AI_APP_WEB_Canary_Canary/'AI(BE)'/deeplearning/kwoledge_distillation_yolov5/
 pip install -r requirements.txt
 ```

### MLOps
  ```bash
  git clone https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/
  cd AI_APP_WEB_Canary_Canary/'AI(BE)'/
  pip install -r requirements.txt
  python manage.py createsuperuser
  python manage.py migrate
  python manage.py runserver 0.0.0.0:8080
  ```
---

## 📱프로젝트 사용법 (Getting Started)
<!--
**마크다운 문법을 이용하여 자유롭게 기재**

잘 모를 경우
구글 검색 - 마크다운 문법
[https://post.naver.com/viewer/postView.nhn?volumeNo=24627214&memberNo=42458017](https://post.naver.com/viewer/postView.nhn?volumeNo=24627214&memberNo=42458017)

 편한 마크다운 에디터를 찾아서 사용
 샘플 에디터 [https://stackedit.io/app#](https://stackedit.io/app#)
-->
  #### 🐤**Canary app**
  1. 웹앱 혹은 APK를 설치하여 앱에 접속한다
  2. 3초 간의 Splash 화면 이후 홈화면에 접속한다.
  3. go버튼을 누르면 사진 처리를 위한 로그인 화면으로, help버튼을 누르면 해당 github repository로 접속한다.
  4. 로그인 창에서 올바른 정보를 입력하고 go버튼을 누르면 option page로, '회원가입 하러가기'버튼을 누르면 회원가입 창으로 넘어간다
  5. 회원가입 창에서 올바른 정보를 입력하고 가입완료 버튼을 누르면 다시 로그인 창으로 돌아온다
  6. option창에서는 갤러리에서 사진을 가져와 처리할 수 있는 Gallery버튼과 카메라로 바로 찍은 사진을 처리하는 Camera 버튼 중에 하나를 선택하면 된다.
  7. 이미지를 고르거나 찍은 후, post server 버튼을 누르면 loading 화면으로 넘어간다.
  8. loading 화면에서 이미지 처리가 완료되면 '결과 보러가기' 버튼이 등장하고, 그 버튼을 누르면 처리된 이미지를 확인 가능한 창으로 넘어간다.
  9. 보안위반 가능성이 모자이크 처리된 이미지를 클릭하면 그에 관련된 경고문을 확인할 수 있다.
  10. 처리된 이미지를 저장하기 위해선 'save' 버튼을 누르면 된다.
  11. save 버튼을 누르면 사용자의 암호화된 군번 값을 이용해 처리된 QRcode가 이미지에 삽입되고, 그 사진을 꾹 누르면 저장여부를 묻는 알림창이 뜬다.
  12. 다시 기능을 사용하기 위해선 'Try Again' 버튼을 누르면 된다.
  
  [시연 영상](https://youtu.be/MTlwTyfn_xI)
  
  #### 🐤**Admin logweb**
  ```bash
  git clone https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/
  cd AI_APP_WEB_Canary_Canary/'AI(BE)'/
  pip install -r requirements.txt
  python manage.py migrate
  python manage.py createsuperuser
  python manage.py runserver 0.0.0.0:8080
  ```
  [API문서](https://github.com/osamhack2021/AI_APP_WEB_Canary_Canary/tree/main/AI(BE)##API) 참고
  
  #### 🐤**Canary in instagram**
  ##### 시작하기 전에
  instagram에서 'osam_canary'를 follow 한 후, 명령어를 Direct Message로 보낸다
  ##### 지원 명령어
  1. 게시물 검사 명령어(최대 3개씩) : 게시물 검사하기
  2. 스토리 검사 명령어 : 스토리 검사하기  
  > 2.1 스토리 검사 시 주의 사항 : @osam_canary 계정을 스토리에 태그해주세요!  
  > 2.2 스토리는 한 번에 최대 10개 검사 가능  
---

## 📈프로젝트 전망

- 장병 사기진작  
군 장병들은 본 어플을 활용함으로써 군 내부에서도 위에서 언급한 것과 같이 다양한 방식으로 카메라를 사용할 수 있을 것입니다. 또한, 제한받고 있던 자유에 대한 권리를 일부 인정함으로써 장병들에 대한 대우가 점차 나아지는 것은 물론, 장병들의 사기가 오르고 그간의 속박감에서 일부 벗어나 
보다 활기차게 병영생활을 이어나갈 수 있으리라 기대됩니다.

- 병영생활 개선  
카메라 사용이 가능해지면, 최근 논란이 일었던 군 부실급식이나 군 내에서 일어날 수 있는 각종 부조리/사건사고 등의 현장을 촬영할 수 있게 됩니다. 이를 통해 지속적으로 군 내의 부족한 부분을 개선해나갈 수 있고, 부조리나 사건사고를 방지할 수 있어 병영생활 개선이 기대됩니다.

- SNS 보안 강화  
Instagram의 Canary 계정을 팔로우한 계정들의 스토리, 게시글을 스캔하며 보안 위반 요소가 없는지 지속적으로 탐지할 수 있습니다.

- 보안 인식 강화  
해당 서비스를 사용하며 자신이 찍거나 업로드한 사진이 sns 보안을 어떤 방식으로 위반했는지 알 수 있어 사용자의 보안 인식을 강화할 수 있습니다.

### 🍎개선할 점

- 모델 성능 개선
군 내 사이버지식정보방이라는 낙후된 개발 환경, 이마저도 제한적으로 사용할 수 있는 군 장병들로 이뤄진 팀, 보안상의 문제로 인한 국내 군 관련 이미지 데이터셋의 빈약함 등,
약 1달 동안의 온라인 해커톤으로는 만족스러운 성능을 뽑아내기 어려웠습니다.  
그러나, 초기 recall 수치 0.65 --> 데이터셋 증강 후 0.77 --> annotation과 self distillation 적용 후 0.82.  
YOLOv5 모델을 원활히 사용하기 위해선 하나의 class 당 적어도 1300장 이상의 이미지가 필요하나, 데이터셋 증강 후에도 저희는 하나의 class 당 약 1000여장 뿐이였습니다. 
또한 실제 상황과 같은 데이터가 부족해 성능이 낮아지는 현상도 발견했습니다.  
지속적인 운영을 통해 데이터를 쌓고, 그 데이터를 활용하거나 다른 데이터를 추가 시 성능이 상승할 것이고 이를 위해 지속적으로 데이터를 수집하여 데이터셋의 크기를 늘려가는 중입니다.

- 짧지 않은 이미지 처리 시간
이는 1. 서버의 성능이 낮고 2. node js와 pytorch간 터미널을 통해 데이터를 교환함으로 패키지로드, 모델로드시 많은 시간이 소요됩니다.  
따라서 Javascript에서 바로 사용할 수 있게 tensorflow.js를 활용하여 모델을 미리 메모리에 할당 후, semaphore을 변형하여 활용하면 실행시간이 줄어들 것입니다.  
또한 현재는 knowledge distillation만 적용했지만 추후에 pruning, quantization을 적용하면 동시접속자수를 늘릴 수 있습니다.

- 아이폰 사용자 지원  
Canary app의 경우 Android용으로만 개발되었습니다. Instagram siren을 통해 아이폰 사용자도 간접적으로 지원하고 있지만, 추후 OS 전용 앱을 개발하여  
더 많은 사용자가 서비스를 원활히 이용하게 할 예정입니다.


### 💡발전 가능 방향

- 타 SNS와의 연계  
현재 Instagram 계정만 지원하는 경보기 기능을 facebook 등의 타 SNS에서도 지원함으로써 보안성을 강화할 수 있습니다.
 
- 국방모바일보안 어플 연계  
현재 카메라 차단을 담당하고 있는 해당 어플과 연계함으로써 카메라 차단/해제 기능을 활용해 사용자의 어플 강제종료를 막고, 사용성을 개선할 수 있습니다. 

- 국방인사정보체계 연계  
어플 최초 실행 시 이름과 군번을 이용해 가입한다는 점에서 착안하여, 국방인사정보체계와 연계함으로써 사용자 관리가 수월해질 것입니다. 또 해당 서버를 사용함으로써 보안 사진을 일반 서버에 저장할 때 발생할 수 있는 문제를 해결하고 보안성을 강화할 수 있습니다.
  
- 검출 가능한 객체 증가/변경으로 타 분야로 확장 가능  
Object detection의 장점이 드러나는 부분입니다. 저희 팀은 군 보안 부분에 초점을 맞춰 관련 데이터를 학습시켰습니다. 이를 확장해보면 어떨까요? 자신이 검출하고 모자이크하고 싶은 객체의 dataset을 모델에 학습시키면 해당 부분을 자동으로 모자이크 해 주는 시스템으로 확장됩니다!  
예를 들어 군대가 아닌 다른 조직에서의 보안 위반 객체를 모자이크할 때, 사용자의 특성에 따라 잔인하거나 선정적인 장면 등을 자동으로 처리할 필요가 있을 때 등에서 이 시스템을 활용할 수 있습니다.


---

## 🕋팀 정보 (Team Information)

**왜** 군인들은 카메라를 자유롭게 쓰지 못 할까?  
언제부턴가 들었던 이 의문이 해커톤 경험조차 없는 육군 및 국직부대 병사 6명을 모이게 했습니다.  
군인들의 자유로운 카메라 사용과, 흔들리지 않는 국가 보안을 위해.

안녕하십니까, Team Canary입니다.  

<table>
 <tr>
  <td></td>
  <td>Name</td>
  <td>Role</td>
  <td>github</td>
  <td>e-mail</td>
 </tr>
   
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/86545225?v=4" width="50" height="50"></td>
  <td align='center'>Jaeyo Shin</td>
  <td align='center'>Leader / Deep Learning (Pytorch)</td>
  <td align='center'><a href="https://github.com/j-mayo"><img src="http://img.shields.io/badge/j_mayo-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:tlswody5110@naver.com"><img src="https://img.shields.io/badge/tlswody5110@naver.com-green?logo=gmail&style=social"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/76638529?v=4" width="50" height="50"></td>
  <td align='center'>June Seo</td>
  <td align='center'>Back-End (node.js)</td>
  <td align='center'><a href="https://github.com/giirafe"><img src="http://img.shields.io/badge/giirafe-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:seojune408@gmail.com"><img src="https://img.shields.io/badge/seojune408@gmail.com-green?logo=gmail&style=social"/></a></td>
 </tr>
 
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/54922625?v=4" width="50" height="50"></td>
  <td align='center'>Huijae Ryu</td>
  <td align='center'>Front-End (Flutter)</td>
  <td align='center'><a href="https://github.com/hellohidi"><img src="http://img.shields.io/badge/hellohidi-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:fbgmlwo123@naver.com"><img src="https://img.shields.io/badge/fbgmlwo123@naver.com-green?logo=gmail&style=social"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/62923434?v=4" width="50" height="50"></td>
  <td align='center'>Chanho Jung</td>
  <td align='center'>Deep Learning (Pytorch)</td>
  <td align='center'><a href="https://github.com/chjung99"><img src="http://img.shields.io/badge/chjung99-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:cksgh1168@gmail.com"><img src="https://img.shields.io/badge/cksgh1168@gmail.com-green?logo=gmail&style=social"/></a></td>
 </tr>

 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/35412648?v=4" width="50" height="50"></td>
  <td align='center'>Donghwan Chi</td>
  <td align='center'>Deep Learning (Pytorch)</td>
  <td align='center'><a href="https://github.com/zheedong"><img src="http://img.shields.io/badge/zheedong-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:zheedong@gmail.com"><img src="https://img.shields.io/badge/zheedong@gmail.com-green?logo=gmail&style=social"/></a></td>
 </tr>
   
 <tr>
  <td align='center'><img src="https://avatars.githubusercontent.com/u/40621030?v=4" width="50" height="50"></td>
  <td align='center'>Wonbeom Jang</td>
  <td align='center'>Deep Learning (Pytorch)<br>MLOps (Django)</td>
  <td align='center'><a href="https://github.com/wonbeomjang"><img src="http://img.shields.io/badge/wonbeomjang-green?style=social&logo=github"/></a></td>
  <td align='center'><a href="mailto:jtiger958@gmail.com"><img src="https://img.shields.io/badge/jtiger958@gmail.com-green?logo=gmail&style=social"/></a></td>
 </tr>
</table>

---

## 개발 및 협업 플랫폼

<table>
 <tr>
  <td align='center'><a href="https://azure.microsoft.com/ko-kr/services/machine-learning/"><img src="https://raw.githubusercontent.com/github/explore/eaef8552d8b082ffafe2bfc8a5023d47da904aac/topics/azure/azure.png" height=80/></a></td>
  <td align='center'><a href="https://github.com/"><img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" height=80/></a></td>
  <td align='center'><a href="https://meet.google.com/"><img src="https://user-images.githubusercontent.com/86545225/137439170-9500c5b2-c47a-4ecc-b588-8c0b14e0eb3b.png" height=80/></a></td>
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
