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
<title>ClubBeforeOpenedList.jsp</title>

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript" src="<%=cp%>/js/jquery-ui.js"></script>
<script type="text/javascript" src="<%=cp%>/js/ajax.js"></script>

<!-- 부트스트랩 -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">

<style>
.box {
    width: 30px;
    height: 30px; 
    border-radius: 70%;
    overflow: hidden;
}
.profile {
    width: 100%;
    height: 100%;
    object-fit: cover;
}
</style>
</head>
<body>
   <!-- 
ClubBeforeOpenedListSearch.jsp

 -->
   
      <!-- nav 영역 -->
      <div>
         <c:import url="nav.jsp"></c:import>
      </div>

      <!-- 컨텐츠영역 -->
      <div>
         <h1>개설 예정 동아리 리스트</h1>
      </div>

      <div>
<form action="clubBeforeListSearch.action" method="post" id="searchForm">

         <div> <!-- ★ 컨트롤러 수정 필요! -->
            카테고리 <select id="category_L_Id" name="category_L_Id">
               <c:forEach var="category" items="${categoryLList }">
                  <option value="${category.category_l_id }">${category.l_cat }</option>
               </c:forEach>
            </select> <select id="category_s_id" name="category_s_id">
               <option value="" selected="selected">소분류</option>

            </select>
         </div>


         <div>

            지역 시<select id="region_L_ID" name="region_L_Id">
               <c:forEach var="region" items="${regionLList }">
                  <option value="${region.region_l_id }">${region.city}</option>
               </c:forEach>

            </select> 군/구<select id="region_S_ID" name="region_S_Id">


            </select>
         </div>

         


         <div>
            <input type="text" placeholder="동아리명을 입력해주세요" name="search" class="search" id="search"  /> 
            <button type="submit" value="검색" id="searchbutton">검색</button>
         </div>
         </form>
      </div>
      <form>
      <div>
         <select>
            <!-- 동아리 정렬 방법 -->
            <option value="1" selected="selected">최신순</option>
            <option value="2">오래된순</option>
            <option value="3">회원수</option>
         </select><br>
      </div>
      </form>

     <br><br>
      <div>
         <!-- 동아리 목록 -->
         <table>
            <c:forEach var="preclubsearch" items="${searchList}">

            <a href="preopenclubdetail.action?cid= ${preclubsearch.cid}">
               <p> ${preclubsearch.title}</p>
               <br>
            </a>
            </c:forEach>

         </table>
      </div>



      <!-- 풋터영역 -->
      <div>
         <c:import url="footer.jsp"></c:import>
      </div>



</body>
<script type="text/javascript">

   $(document).ready(function()
    {
      $("#searchbutton").click(function()
      {
         //alert("확인");
         
         $("#searchForm").submit();
         
      });
      
    });
</script>

</html>