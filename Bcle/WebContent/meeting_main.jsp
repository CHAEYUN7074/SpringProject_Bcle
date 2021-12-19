<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>B:CLE</title>
<!-- <link rel="stylesheet" href="css/main.css"> -->
<link rel="stylesheet" href="css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<style>
@import
	url('https://fonts.googleapis.com/css?family=Exo+2|Noto+Sans+KR&display=swap')
	;

body {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 14px;
	font-weight: bold;
	margin: 0px;
	font-weight: bold;
}

.upper {
	display: flex;
	margin: 5vh 25vh 0vh 25vh;
	padding-left: 5%;
	padding-right: 5%;
	padding-top: 5%;
	background-color: white;
}

.upper>* {
	margin-right: 5vh;
}

.intro {
	width: 40vh;
}

.bottom {
	display: flex;
	padding: 5%;
	margin: 0vh 25vh 0vh 25vh;
	background-color: white;
}

.photo {
	margin: 0vh 30vh 5vh 20vh;
}

.upper>select, .upper>input {
	margin-left: 1vh;
	border: 3px solid #D9D9D9;
	border-radius: 30px;
}

.left {
	padding-left: 6%;
	padding-right: 5%;
}

section.main {
	width: 100%;
	height: 100%;
	background: url(images/island.jpg) no-repeat center/cover;
	position: relative;
	/* background-attachment: fixed; */
	overflow: hidden;
	/* 	z-index: 1; */
}

/* section.main::after {
	width: 100%;
	height: 100%;
	content: "";
	background: url(images/island.jpg) no-repeat center/cover;
	position: absolute;
	top: 0;
	left: 0;
	z-index: -1;
	/* opacity: 0.5; */
top


:

 

0;
left


:

 

0;
}
* /

.main>h2 {
	margin-left: 25vh;
	padding-top: 3%;
}

#min, #max {
	width: 8vh;
}

.bottom2 {
	margin: 0vh 25vh 10vh 25vh;
	display: flex;
	padding-bottom: 5%;
	background-color: white;
}

.right {
	background-color: white;
	width: 92vh;
	padding-left: 5%;
	padding-right: 5%;
}

/* 사진업로드 관련 */
#att_zone {
	width: 60vh;
	min-height: 150px;
	padding: 10px;
	border: 1px dotted #00f;
	margin-top: 3vh;
	margin-bottom: 3vh;
}

#att_zone:empty:before {
	content: attr(data-placeholder);
	color: #999;
	font-size: .9em;
}

/* 날씨&지도 */
.weather {
	display: flex;
	height: 50%;
	width: 80%;
	border: 1px solid gray;
}

.map {
	margin: 0vh;
	height: 50%;
	width: 80%;
	background-color: gray;
}

.weather__box1 {
	margin: 0 auto;
	width: 50%;
	height: 100%;
	border: 1px solid gray;
}

.weather__box2 {
	width: 50%;
	height: 100%; 
	border: 1px solid gray;
}

/* .weather__location{
}
.weather__description{
} */
</style>
<body>

	<section class="main">
		<h2></h2>
		<div class="upper">
			<p>모임유형 : 정모</p>
			<p>모임명 : 오늘의캠핑</p>
			주최자 : 글작성자닉네임
		</div>
		<div class="bottom">
			<div class="intro">
				<h3>모임소개</h3>
				<div class="box">이번 모임에는 서귀포에 가려고합니다.</div>
			</div>

			<div class="photo"></div>

		</div>

		<div class="bottom2">
			<div class="left">
				<h3>자세히 알려드립니다.</h3>
				<p>※회원님들은 상세 내용을 꼭 확인하신 후 참가신청해주세요</p>
				<br></br> 참가비 : 80,000원 <br> 모임일 : 2021-12-25 <br> 모임시간 :
				오전 9시<br> 모임장소 : 서울역<br> 인원 : 5 - 15<br>

			</div>


			<div class="right">
				<section class="weather">
					<!-- 날씨 아이콘 -->
					<div class="weather__box1"></div>
					<!-- 기온 -->
					<div class="weather__box2"></div>

				</section>
				<section class="map">지도연동</section>
			</div>
		</div>

	</section>

	<div class="right"></div>



	<!-- =============================== -->
	<script src="https://unpkg.com/ionicons@5.0.0/dist/ionicons.js"></script>
</body>

</html>