
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
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="css/list.css"> -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
@import
	url('https://fonts.googleapis.com/css?family=Exo+2|Noto+Sans+KR&display=swap')
	;

body {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 14px;
}

.contents {
	margin: 5vh 34vh 5vh 30vh;
}

.card {
	margin-left: 5vh;
}

.row g-0 {
	margin-bottom: 2vh;
	border: 1px;
}

#balance{
	margin: 10vh 30vh 3vh 41vh;
}

#accountSelect {
	margin: 5vh 30vh 3vh 35vh;
	display: flex;
}

#accountSelect #edit {
	margin-left: 3vh;
}

#calendar {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 14px;
	font-weight: bold;
	margin-top: 5vh;
}

#detail {
	width: 60%;
	height: 520px;
	text-align: left;
	margin: 3vh 30vh 10vh 35vh;
}

#detail p {
	font-weight: bold;
}

table {
	border: 1px;
}
/* 캘린더 추가 */
.elegant-calencar {
    max-width: 130vh;
    text-align: center;
    position: relative;
    overflow: hidden;
    border-radius: 5px;
    -webkit-box-shadow: 0px 19px 27px -20px rgb(0 0 0 / 16%);
    -moz-box-shadow: 0px 19px 27px -20px rgba(0, 0, 0, 0.16);
    box-shadow: 0px 19px 27px -20px rgb(0 0 0 / 16%);
}

.ftco-section {
    padding: 0em 0;
}

/*리스트 추가 */
#bbsList {
    width: 930px;
    margin: 30px auto;
    text-align: left;
}

#bbsList_title 
{
	width:664px;   /* 690px - (padding-left+border:3px+border:3px) */
	padding-left:20px;
	height:40px;
	border:3px solid #D6D4A6;
	text-align:left;
	font-weight: bold;
	line-height:40px;
	font-size:14pt;
	margin-bottom:30px;
}


#bbsList_header 
{
	height:27px;
}

#bbsList_header #leftHeader
{
	float:left;
	width:345px;
	text-align:left;
}

#bbsList_header #rightHeader
{
	float:right;
	width:345px;
	text-align:right;
}

#bbsList_header .selectFiled 
{
	border:1px solid; 
	border-color:#666666; 
	background-color:#ffffff; 
	font-family:굴림; 
	font-size:9pt;
	height: 20px;
}

#bbsList_header .textFiled 
{
	border:1px solid; 
	height:13px; 
	padding:2px 2px 2px 2px; 
	border-color:#666666; 
	background-color:#ffffff; 
	font-family:"굴림"; 
	font-size:9pt;
}

#bbsList_list 
{
	clear:both;
}

#bbsList_list dd 
{
	float:left;
	height:27px;
	line-height:27px;
	text-align:center;
	margin-left:8vh;
}


#bbsList_list #title 
{
	height:30px;
	border-top:1px solid #CCCCCC;
	border-bottom:1px solid #CCCCCC;
	background-color: #E6E4E6;
}

#bbsList_list #title dl 
{
	height:27px;
	border-left:0px solid #5db062;
	border-right:0px solid #5db062;
}



#bbsList_list #title dt {
    float: left;
    line-height: 34px;
    text-align: center;
    margin: 0vh 0vh 0vh 8vh;
}


#bbsList_list #lists 
{
	clear:both;
}

#bbsList_list #lists dl 
{
	float:left;
	border-bottom:1px solid #E4E4E4;
}

#bbsList_list a 
{
	line-height: 27px;
}

#bbsList_list #footer 
{
	clear:both;
	height:32px;
	line-height:32px;
	margin-top:5px;
	text-align:center;
}

</style>
</head>
<body>
	<c:import url="nav.jsp"></c:import>
	<c:import url="meetingmain.jsp"></c:import>

	<div id="accountSelect">
		<div>
			<form action="" name="accountForm" method="post">
				<select name="accountKey" class="selectField">
					<!-- value값 변경해야함.. -->
					<option value="notice">월별</option>
					<option value="talk">회비납입현황</option>
					<option value="greeting">동아리원별</option>
					<option value="review">연도별</option>
					<option value="question">카드별</option>
				</select>
				<div></div>
			</form>
		</div>
		<div>
			<button class="btn btn-primary btn-sm" type="button" id="edit"
				onclick="#'">수정/삭제</button>
		</div>

	</div>
	<!-- 달력 -->
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center"></div>
			<div class="row">
				<div class="col-md-12">
					<div class="elegant-calencar d-md-flex">
						<div class="wrap-header d-flex align-items-center img"
							style="background-image: url(images/bg.jpg);">
							<p id="reset">Today</p>
							<div id="header" class="p-0">
								<!-- <div class="pre-button d-flex align-items-center justify-content-center"><i class="fa fa-chevron-left"></i></div> -->
								<div class="head-info">
									<div class="head-month"></div>
									<div class="head-day"></div>
								</div>
								<!-- <div class="next-button d-flex align-items-center justify-content-center"><i class="fa fa-chevron-right"></i></div> -->
							</div>
						</div>
						<div class="calendar-wrap">
							<div class="w-100 button-wrap">
								<div
									class="pre-button d-flex align-items-center justify-content-center">
									<i class="fa fa-chevron-left"></i>
								</div>
								<div
									class="next-button d-flex align-items-center justify-content-center">
									<i class="fa fa-chevron-right"></i>
								</div>
							</div>
							<table id="calendar">
								<thead>
									<tr>
										<th>Sun</th>
										<th>Mon</th>
										<th>Tue</th>
										<th>Wed</th>
										<th>Thu</th>
										<th>Fri</th>
										<th>Sat</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- 달력 끝 -->
	
	<div id="bbsList">
		<p>월별 세부 입출입 내역</p>
		<div id="bbsList_list">
			<div id="title">
				<dl>
					<dt>일자</dt>
					<dt>분류</dt>
					<dt>세부내역</dt>
					<dt>사용내역</dt>
					<dt>금액</dt>
					<dt>계좌</dt>
					<dt>카드</dt>
					<dt>개인지출</dt>
					<dt>비고</dt>
				</dl>
			</div>
			<!-- #title -->
			<div id="contents">
				<dl>
					<dd>1일</dd>
					<dd>정기회비</dd>
					<dd>-</dd>
					<dd>-</dd>
				<dd>100,000</dd>
				<dd>
					-</dd>
				<dd>
					-</dd>
				<dd>-</dd>
				<dd>2명</dd>
			</dl>

			</div>
			</div>
	</div>
	<div id ="balance">
	<p>잔고</p>
	<p>100,000 원</p>
	</div>


	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/c_main.js"></script>

</body>

</html>