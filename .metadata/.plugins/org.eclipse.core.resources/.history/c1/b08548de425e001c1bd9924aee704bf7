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
<link rel="stylesheet" href="css/style.css">
</head>

<style>
@import
	url('https://fonts.googleapis.com/css?family=Exo+2|Noto+Sans+KR&display=swap')
	;

body {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 14px;
}

#accountSelect, #checkSelect {
	margin: 5vh 30vh 3vh 35vh;
	display: flex;
}

#accountSelect #edit {
	margin-left: 3vh;
}

.col-lg-4 p {
    margin-left: 4vh;
}

/* 캘린더 추가 */
.elegant-calencar {
	max-width: 130vh;
	text-align: center;
	position: relative;
	overflow: hidden;
	border-radius: 5px;
	-webkit-box-shadow: 0px 19px 27px -20px rgb(0 0 0/ 16%);
	-moz-box-shadow: 0px 19px 27px -20px rgba(0, 0, 0, 0.16);
	box-shadow: 0px 19px 27px -20px rgb(0 0 0/ 16%);
}

.ftco-section {
	padding: 0em 0;
}

.calendar-wrap {
	width: 65%;
	background: #fff;
	padding: 40px 20px 20px 20px;
	margin-left: 32vh;
	margin-top: 5vh;
	
}

/* <p>2021</p> p 태그 왜 정렬이 안될까 */


</style>


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
					<option value="notice">지출입등록</option>
					<option value="question">계좌/카드등록</option>
				</select>
				<div></div>
			</form>
		</div>
		<div>
			<button class="btn btn-primary btn-sm" type="button" id="edit"
				onclick="#'">수정/삭제</button>
		</div>
	</div>
	
		<div id="checkSelect">
		<div>
			<form action="" name="accountForm" method="post">
				<select name="accountKey" class="selectField">
					<!-- value값 변경해야함.. -->
					<option value="notice">--정렬선택--</option>
					<option value="talk">가입일 순</option>
					<option value="greeting">납입 순</option>
					<option value="review">미납 순</option>
				</select>
				<div></div>
			</form>
		</div>
		</div>
		
	
	<div class="calendar-wrap">
		<div class="w-100 button-wrap">
			<div
				class="pre-button d-flex align-items-center justify-content-center">
				<i class="fa fa-chevron-left"></i> <p>2021</p>
			</div>
			
			<div
				class="next-button d-flex align-items-center justify-content-center">
				<i class="fa fa-chevron-right"></i>
			</div>
		</div>
		<table id="calendar">
			<thead>
				<tr>
					<th>닉네임</th>  <!-- 동아리장, 총무한테는 실명으로 -->
					<th>1월</th>
					<th>2월</th>
					<th>3월</th>
					<th>4월</th>
					<th>5월</th>
					<th>6월</th>
					<th>7월</th>
					<th>8월</th>
					<th>9월</th>
					<th>10월</th>
					<th>11월</th>
					<th>12월</th>
				</tr>
			</thead>

			</tbody>
		</table>
	</div>
</body>
</html>