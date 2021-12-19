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
<title>ClubCreate.jsp</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript" src="<%=cp%>/js/jquery-ui.js"></script>
<script type="text/javascript" src="<%=cp%>/js/ajax.js"></script>>
<!-- <script type="text/javascript">

   $(document).ready(function()
   {
      //카테고리 대분류(category_L_Id)가 변경되었을 경우 수행해야 할 코드 ㅓ리
      $("#category_L_Id").change(function(){
         
         //테스트
         //alert("변경");
         
         // Ajax 요청 및 응답 처리
         ajaxRequest();
      });
      
   });
   
   function ajaxRequest()
   {
      var values = [];   
      
      $.post("ajaxcategory.action" ,{category_L_Id : $("#category_L_Id").val()} ,function(data)
      {
         $("#category_S_Id").children().remove();
         $("#category_S_Id").append("<option value=''>선택</option>");
         
         //alert(data);갯수는 맞음 
         
         console.log();
      
      
         
      /*    for(var i=0 in data)
         {
            $("#category_S_Id").append("<option value='" + data.get(i).getCategory_s_id+"'>"
                   + console.log(data.get(0).getL_cat())+"</option>");
                  /* + data[0].S_cat+"</option>"); */
                  /* + data.get(i).S_cat+"</option>"); */
         
          
         
      
         
      });
      
      
   }
</script> -->
<script type="text/javascript">

   $(document).ready(function()
    {
      $("#submitBtn").click(function()
      {
         //alert("확인");
         
         $("#clubForm").submit();
         
      });
      
    });
</script>

</head>
<body>
   <!-- 
ClubCreate.jsp
- 동아리장 - 동아리 개설하기(발의하기)

 -->

   <div class="wrap">
      <!-- 네브 영역 -->
      <div>
         <c:import url="nav.jsp"></c:import>
      </div>
     <!-- 
     HttpSession session = request.getSession();
     session.setAttribute("id", id);
       -->   
      <!-- 콘텐츠 영역 -->
      <div id="content">
         <h1>[ 동아리 발의 ]</h1>
         <hr>

         <div>
            <form action="clubinsert.action" method="post" id="clubForm">
               <div>
                  <p>
                  동아리명<input type="text" name="title" id="title">
                  </p>
                  프로필 사진
                  <input type="text" name="url" id="url">
                  <p>
                  <!-- 
                     동아리장<input type="text" name="nickname" id="nickname"
                        placeholder="로그인 상태인 사람 여기에 자동 닉네임 뿌려주기" disabled="disabled"> 
                     개설예정일<input
                        type="text" name="preopendate" id="preopendate"
                        placeholder="자동입력" disabled="disabled">
                         -->
                  </p>
                  <div>
                     카테고리 
                     <select id="category_L_Id" name="category_L_Id">
                         <option value="" selected="selected">대분류</option> 
                        <c:forEach var="category" items="${categoryLList }">
                           <option value="${category.category_l_id }">${category.l_cat }</option>
                        </c:forEach>
                     </select> 
                     <select id="category_S_Id" name="category_S_Id">
                        <option value="" selected="selected">소분류</option> <!-- 테스트 시 대분류 여행 선택하고 해주세요 ~-->
                        <option value="1" >국내여행</option>
                        <option value="2" >해외여행</option>
                     </select>
                  </div>


                  <div>

                     지역  
                     <select id="region_L_ID" name="region_L_Id">
                        <option value="" selected="selected">시</option> 
                        <c:forEach var="region" items="${regionLList }">
                           <option value="${region.region_l_id }">${region.city}</option>
                        </c:forEach>
                     </select>      
                     <select id="region_S_ID" name="region_S_Id">
                        <option value="" selected="selected">군/구</option> 
                  <option value="1" >전체</option>   <!-- 테스트 시 지역 서울로 선택하고 해주세요 ~-->
                        <option value="2" >강남구</option>
                     </select>
                  </div>

                  <p>
                     가입 최대인원 설정<input type="text" id="max" name="max" placeholder="최대 200명">
                  </p>
                  <div>
                     <p>내용</p>
                     <textarea rows="10" cols="70" id="content" name="content">
                     </textarea>
                  </div>
                  <div>
                     <%-- <c:import url="beePicCreated.jsp"></c:import> --%>
                  </div>

                  <div>
                     <h5>동아리 가입시 제한조건(옵션)</h5>
                     
                     <div>
                        지역제한
                        <input type="radio" name="regionlimit" value="X" id="regionlimitX" checked="checked">
                        <label for="regionlimitX">없음</label>
                        <input type="radio" name="regionlimit" id="regionlimitO" value="O" > 
                        <label for="regionlimitO">있음</label>
                        <br>
                        나이제한
                        <input type="radio" name="agelimit" id="agelimitX" value="X" checked="checked"> 
                        <label for="agelimitX">없음</label>
                        <input type="radio" name="agelimit" id="agelimitO"  value="O"> 
                        <label for="agelimitO">있음</label>
                        <br>※동아리장이 성인인 경우 10대만 모집하는것은 불가능합니다.
                     </div>

                     <div>
                        <button type="button" class="btn" id="submitBtn">등록</button>
                        <button type="button" class="btn" id="cancleBtn" onclick="location.href='MainPage.jsp'">취소</button>
                     </div>

                  </div>

               </div>
            </form>
         </div>
      </div>

   </div>




</body>
<script type="text/javascript">


</script>
</html>