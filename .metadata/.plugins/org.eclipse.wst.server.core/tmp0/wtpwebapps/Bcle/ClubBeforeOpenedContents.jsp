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
<title>ClubBeforeOpenedContents.jsp</title>
<style type="text/css">
.box {
	width: 150px;
	height: 150px;
	border-radius: 70%;
	overflow: hidden;
}

.profile {
	width: 100%;
	height: 100%;
	object-fit: cover;
}

.container {
	display: flex;
}
</style>
</head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(function()
	{
		$(".updateBtn").click(
				function()
				{

					$(location).attr("href",
							"preclubupdateform.action?cid=" + $(this).val());

				});

		$(".deleteBtn").click(
				function()
				{

					if (confirm("현재 선택한 데이터를 정말 삭제하시겠습니까?"))
					{
						$(location).attr("href",
								"preclubdelete.action?cid=" + $(this).val());
					}
				});

	});

	//
</script>
<body>
	<!-- 
ClubBeforeOpenedContents.jsp
- 메인화면(로그인 전) 페이지 2 -⑤ 회원 모집 동아리 상세페이지(내용)
- 개절예정 동아리(스탭프 지원(동의)받는중)
 -->
	<div class="wrap">
		<!-- 네브 영역 -->
		<div>
			<c:import url="nav.jsp"></c:import>
		</div>

		<!-- 콘텐츠 영역 -->
		<div id="content">
			<h1>[ 개설예정 동아리 ]</h1>
			<hr>
			<div>
				<p>모집마감 D- ${clubDetail.day}</p>
			</div>

			<div>
				<form action="">
					<div>
						<p>
							동아리명 <input type="text" id="title" name="title"
								value="${clubDetail.title }" disabled="disabled">
						</p>
						<p>
							동아리장 <input type="text" id="nickname" name="nickname"
								value="${clubDetail.nickname }" disabled="disabled">
							가개설일 <input type="text" id="preopendate" name="preopendate"
								value="${clubDetail.preopendate}" disabled="disabled">
						</p>
						<div>
							카테고리 <input type="text" id="l_cat" name="l_cat"
								value="${clubDetail.l_cat}" disabled="disabled"> <input
								type="text" id="s_cat" name="s_cat" value="${clubDetail.s_cat}"
								disabled="disabled">
						</div>
						<div>
							지역 <input type="text" value="${clubDetail.city}"
								disabled="disabled"> <input type="text"
								value="${clubDetail.local}" disabled="disabled">
						</div>
						<p>
							가입 최대인원 설정 <input type="text" value="${clubDetail.max}"
								disabled="disabled">
						</p>
						<div>
							<p>내용</p>
							<textarea rows="10" cols="70">${clubDetail.content}</textarea>
						</div>

						<div>
							<h5>제한조건(옵션)</h5>
							<div>
								<!-- if로 받아온 지역제한 코드가 'X'면 없음이나 '-'로
                     있으면 받아온 지역명으로 보이게-->
								지역&nbsp; <input type="text" value="${clubDetail.city}"
									disabled="disabled"> <input type="text"
									value="${clubDetail.local}" disabled="disabled">
							</div>
							<div>
								<!-- if로 받아온 나이제한 코드가 'X'면 없음이나 '-'로
                     있으면 받아온 최대나이와 최소나이로 보이게  -->
								연령&nbsp; <input type="text" value="${clubDetail.min_age}"
									disabled="disabled"> ~ <input type="text"
									value="${clubDetail.max_age}" disabled="disabled">
							</div>

							<div>
								스텝<input type="button" value="지원하기">
								<div class="container">
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
								</div>
							</div>

							<div>
								총무<input type="button" value="지원하기">
								<div class="container">
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
									<div class="box" style="background: #BDBDBD;">
										<img class="profile" src="">
									</div>
								</div>
							</div>

							<div>
								<button type="button" class="btn" id="closeBtn"
									onclick="location.href='clubprelistform.action'">닫기</button>

								<button type="button" class="updateBtn" id="updateBtn"
									onclick="checkId()" value="${clubDetail.cid }"
									style="display: block">수정</button>
								<button type="button" class="deleteBtn" id="deleteBtn" onclick="checkId2()"
									value="${clubDetail.cid }">삭제</button>
							</div>


						</div>


					</div>
				</form>
			</div>
		</div>
		<!-- 풋터영역 -->
		<div>
			<c:import url="footer.jsp"></c:import>
		</div>

	</div>



</body>
<script>
	//글 작성자에게만 수정 버튼이 보이도록한다.
	$(document).ready(function()
	{
		if ('${mid}' == '${clubDetail.mid}')

		{
			$("#updateBtn").css("display", "block");
		} else
		{
			$("#updateBtn").css("display", "none");
		}

	});
	
	//글 작성자에게만 삭제 버튼이 보이도록한다.
	$(document).ready(function()
	{
		if ('${mid}' == '${clubDetail.mid}')

		{
			$("#deleteBtn").css("display", "block");
		} else
		{
			$("#deleteBtn").css("display", "none");
		}

	});
</script>
</html>