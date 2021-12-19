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
<title>Join.jsp</title>
<style type="text/css">
/* .outer {
  display: flex;
  align-items: center; 
  flex-direction: row; 
  justify-content: center; 
}
.inner {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%,-50%);
} */
</style>
</head>
<body>
<!-- 
 - 회원가입하기 페이지
 -->

<!-- nav 영역 -->
<div>
	<c:import url="subHeader.jsp"></c:import>
</div>
<div class="subheader">
		<p>B:CLE</p>
		<p class="title">회원가입 하기</p>
	</div>

<div class="outer">
	<div class="inner">
		<form action="">
			<div>
				프로필 사진 설정 란
				<input type="button" value="등록">
			</div>
			아이디 <input type="text" placeholder="아이디 입력">
			<input type="button" value="중복확인">
			<!-- <span>다른 아이디를 사용하세요.</span> --><br>
			비밀번호 <input type="text" placeholder="비밀번호 입력"><br>
			비밀번호 재확인 <input type="text" placeholder="비밀번호 재입력"><br>
			이름 <input type="text" placeholder="이름 입력"><br>
			이메일 <input type="text" placeholder="이메일 입력">
			<input type="button" value="인증">
			<!-- <span id="err">인증코드가 일치하지 않습니다.</span> --><br>
			주민번호 <input type="text"> - <input type="text"><input type="button" value="본인인증"><br>
			연락처 <input type="text"> - <input type="text"> - <input type="text"><br>
			닉네임<input type="text"><input type="button" value="중복확인"><input type="button" value="랜덤생성">
			<div>
				지역 설정<br>
				<span>지역은 최소 1개 설정해야합니다.</span><br>
				시 
				<select name="" id="">
					<option value="0">시 단위</option>
				</select>
				군·구
				<select name="" id="">
					<option value="0">군·구 단위</option>
				</select><br>
				<input type="text" placeholder="지역1"><input type="text" placeholder="지역2"><input type="text" placeholder="지역3">
			</div>
			<div>
				관심카테고리
				<span>관심카테고리는 최소 1개 설정해야합니다.</span><br>
				<select name="" id="">
					<option value="0">카테고리 선택</option>
				</select><br>
				<input type="text" placeholder="카테고리1"><input type="text" placeholder="카테고리2"><input type="text" placeholder="카테고리3">
				<input type="text" placeholder="카테고리4"><input type="text" placeholder="카테고리5">
			</div>
			<!-- <span>회원가입의 항목들을 모두 입력해주세요.</span> --><br>
			<input type="button" value="가입하기">
			<input type="reset" value="모두지우기">
		</form>
	</div>
</div>


</body>
</html>