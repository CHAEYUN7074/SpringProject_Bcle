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
<script type="text/javascript" src="<%=cp%>/js/ajax.js"></script>
<script type="text/javascript">
   
   $(document).ready(function()
   {
      //카테고리 대분류(category_L_Id)가 변경되었을 경우 수행해야 할 코드 처리
      $("#category_L_Id").change(function()
      {
         //lert($("#category_L_Id").val());
         
         // Ajax 요청 및 응답 처리
         $.ajax(
         {
            type : "POST"
            ,url : "ajaxcategory.action"
            ,data : {category_L_Id : $("#category_L_Id").val()}
            ,dataType : "json" //{key : vlaue}
            ,success : function(result)
            {
               $("#category_S_Id").children().remove();
               $("#category_S_Id").append("<option value=\"\">선택</option>");
               
               for(var i=0; i<result.length; i++)
               {
                  $("#category_S_Id").append("<option value=\""+result[i].category_s_id+"\">"+result[i].s_cat+"</option>");
               }
            }
            ,error : function(e)
            {
               alert(e.responseText);
            }
         });
      });
      
      $("#region_L_Id").change(function()
      {
         //alert('변경');
         //alert($("#region_L_Id").val());
         
         $.ajax(
         {
            type : "POST"
            ,url : "ajaxregion.action"
            ,data : {region_L_Id : $("#region_L_Id").val()}
            ,dataType : "json"
            ,success : function(result)
            {
               //alert(result);
               $("#region_S_Id").children().remove();
               $("#region_S_Id").append("<option value=\"\">선택</option>");
               
               for(var i=0; i<result.length; i++)
               {
                  $("#region_S_Id").append("<option value=\""+result[i].region_s_id+"\">"+result[i].local+"</option>");
               }
            }
            ,error : function(e)
            {
               alert(e.responseText);
            }
         
          });
   
      });
      
   });
      //동아리명 중복 검사
      
    $(document).ready(function()
   {
      
      $('.title').focusout(function()  //focusout
      {
         let userTitle = $('.title').val();   
         
         $.ajax({
            url : "checktitle.action" // ①컨트롤러로~
            , type : "POST"
            , data : {userTitle : userTitle}
            , dataType : "json"      
            , success : function(result) //Check title에서 여기로 왔다.
            {
               if(result.title == 0){
                  $("#checkTitle").html('이미 동일한 이름의 동아리가 존재합니다.');
                  $("#checkTitle").css('color', 'red');
                  $('#title').val(''); //중복된 내용삭제

               }
               else
               {

                  $("#checkTitle").html('사용할 수 있는 동아리 이름입니다.');
                  $("#checkTitle").css('color', 'green');
               }
            }
            , error : function(e)
            {
               alert(e.responseText); //에러사항 보여주기
            }
         })
      })
   });
   
/* 
이 방법도 되는데 더 쉬운 방법을 찾아냄..ㅠㅜㅠ 
   이 주석은 지우셔도 됩니다!!! 전 아까워서 못지우는중 ㅎ
   function ajaxRequest()
   {
         
      $.post("ajaxcategory.action" ,{category_L_Id : $("#category_L_Id").val()} ,function(data)
      {
         $("#category_S_Id").children().remove();
         $("#category_S_Id").append("<option value=''>선택</option>");
         
         //alert(data); //-- [{"category_s_id:" : "1"},{"s_cat:" : "국내여행"}...]       
         //data 는 json 배열 
         
         const cateSlist = JSON.parse(data); //Object 형으로 파싱
         //alert(cateSlist);
         //[object Object],[object Object],[object Object]...
         
          ★★★★★시행착오 ^^....하 
         alert(cateSlist[1].category_s_id);  //undefined
         alert(cateSlist[1].s_cat); // 국내여행
         alert(cateSlist[2].category_s_id); // 2 (해외여행의 id)
         alert(cateSlist[2].s_cat); // undefined
         
         //-- ["category_s_id:" "1"],["s_cat" : "국내여행"],  ["category_s_id:" : "2"]  ["s_cat:" : "해외여행"]  
         //     ------------------------  -------------------     -----------------       ----------------
         //             0                         1                         2                     3
            // 이런 형태이기 때문에 undefined 번갈아 뜨는거 였음 ㅎ
           
            
            
         for(var i=1; i<=cateSlist.length; i+=2)
         {
            $("#category_S_Id").append("<option value=\""+cateSlist[i-1].category_s_id+"\">"+cateSlist[i].s_cat+"</option>");
         }
          
         /*
         //확인
         $("#category_S_Id").change(function(){
            
            alert($("#category_S_Id").val());
         });
         
         
      });
       */
       
 //각 상황별 alert 창 → required로 했는데 클리어하지가 않아서, 각 상황에 맞게 알림창을 띄우기로했다.
   $(document).ready(function()
   {
      $("#submitBtn").click(function()
      {
          if ($.trim($("#title").val()).length == 0)
         {
            alert("동아리명을 입력하세요.");
            $("#title").focus();
            return;
         }
         
         if ($("#category_L_Id").val() == "")
         {
            alert("카테고리를 선택해주세요");
            $("#category_L_Id").focus();
            return;
         }
         if ($("#category_S_Id").val()== "")
         {
            alert("카테고리를 선택해주세요");
            $("#category_S_Id").focus();
            return;
         }
         //다되는데 지역은 왜 안되는지 모르겠다...
         if ($("#region_L_Id").val()== "")
         {
            alert("지역을 선택해주세요");
            $("#region_L_Id").focus();
            return;
         }
         if ($("#region_S_ID").val()== "")
         {
            alert("지역을 선택해주세요");
            $("#region_S_ID").focus();
            return;
         }
         if ($("#max").val().length == 0)
         {
            alert("최대 인원을 입력하세요");
            $("#max").focus();
            return;
         }

          if ($("#content").val().length == 0)
          {
	          alert("내용을 입력하세요");
	          $("#content").focus();
	          return;
          }
  
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
            <form action="clubinsert.action" method="post" id="clubForm" enctype="multipart/form-data">
               <div>
                  <p>
                  동아리명<input type="text" name="title" id="title" class="title" maxlength='20'>
                  </p>
                  <input type="button" value="중복확인" id="check">
                  <span id="checkTitle" style="font-size: small;"></span><br>
                  
                  프로필 사진
                  <input type="file" name="url" id="url">
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
                        <option value="" selected="selected">소분류</option>
                     </select>
                  </div>


                  <div>

                     지역  
                     <select id="region_L_Id" name="region_L_Id">
                        <option value="" selected="selected">시</option> 
                        <c:forEach var="region" items="${regionLList }">
                           <option value="${region.region_l_id }">${region.city }</option>
                        </c:forEach>
                     </select>      
                     <select id="region_S_Id" name="region_S_Id">
                        <option value="" selected="selected">군/구</option> 
                     </select>
                  </div>

                  <p>
                     가입 최대인원 설정<input type="text" id="max" name="max" placeholder="최대 200명">
                  </p>
                  <div>
                     <p>내용</p>
                     <textarea rows="10" cols="70" id="content" name="content" maxlength='100'></textarea>
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