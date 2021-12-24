<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    request.setCharacterEncoding("UTF-8");
    String cp = request.getContextPath();
%>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>소라개</title>
    <link rel="stylesheet" href="css/mainpage.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
    <div class="wrap">
        
   <!--header-->
   <header>
    <c:import url="/nav.action"></c:import>
    </header>
   <!-- 주요 모임 소개배너 -->
   <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=07f7d7a9-aad7-4692-b8ae-ac83a16b9bc5&mode=raw" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=07f7d7a9-aad7-4692-b8ae-ac83a16b9bc5&mode=raw" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=e31b152a-0dd0-4a99-90e5-8226de762359&mode=raw" class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
    <!--section.about-->
    <c:choose>
	<c:when test="${!empty id }">
   <section class="about">
       <div class="title en">
           <h2 class="en">Your Choice <span>.</span></h2>
           <p>가입한 소모임을 둘러볼까요?</p>
      </div>
      	   <c:forEach  var="club" items="${clubList }">
           <ul>
               <li><a href="clubmain.action?cid=${club.cid }">
                   <p class="clubpic"><img src="images/camping.jpg" ></p>
                   		<div class="text">
	                       <h3>${club.title }</h3>
	                       <input type="hidden" id=cid name="cid" value="club.cid">
                   		</div>
               		</a>
               </li>
           </ul>
           </c:forEach>
   </section>
   </c:when>
   <c:otherwise>
     <!--section.join-->
  <section class="join">
      <div class="title">
          <h2 class="en">HAPPY JOIN <span>.</span></h2>
          <p>비클의 회원이 되시고 새로운 경험을 해보세요!</p>
      </div>

      <button>참여하기</button>
  </section>
	</c:otherwise>
</c:choose>
  
   <!--//section.about--> 
        <div style="margin: 50px;">
            <form action="">
                <input type="text" placeholder="동아리 이름으로 검색하기"> <input type="button" value="검색">
            </form>
        </div>
        <!-- 카테고리로 검색 -->
        <div style="text-align: center;">
            <div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
            </div>
            <div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
                <div class="category-square"></div>
            </div>
                <br>
        </div>
   <!--section.find-->
   <section class="join">
       <div class="title">
           <h2 class="en">Find what you want <span>.</span></h2>
           <p>우리 지역의 소모임을 찾아봐요!</p>
       </div>

       <div class="map">
       <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d12663.606139647718!2d126.93995519999999!3d37.486649899999996!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sko!2skr!4v1636378273917!5m2!1sko!2skr" width="100%" height= "540px" allowfullscreen="" loading="lazy" ></iframe>
       </div>

       <div class="imgBox">
        <div class="inner">
            <h3> 전국의 숨은 모임 </h3>
            <div class="bottom">
              <p><a href="#">서울</a> &nbsp&nbsp <a href="#">세종</a> &nbsp&nbsp <a href="#">강원</a> &nbsp&nbsp <a href="#">인천</a>
              <a href="#">서울</a> <span></span> <a href="#">세종</a> <a href="#">강원</a> <a href="#">인천</a></p>
              <br>
              <p><a href="#">서울</a> &nbsp&nbsp <a href="#">세종</a> &nbsp&nbsp <a href="#">강원</a> &nbsp&nbsp <a href="#">인천</a>
              <a href="#">서울</a> <span></span> <a href="#">세종</a> <a href="#">강원</a> <a href="#">인천</a></p>
            </div>
        </div>
       </div>
</section>
<section>
  <div id="daumRoughmapContainer1568979425094" class="root_daum_roughmap root_daum_roughmap_landing" style="width:100%"></div>
</section>

  
  <!--계설예정동아리-->
  <section class="timeup">
    <div class="title">
        <h2>개설예정동아리<span>.</span></h2>
    </div>
    <ul>
        <li><a href="#"><p class="clubpic"> <img src="images/hobby1.jpg" alt=""></p>
            <div class="bottom">
                <p class="color">모임명</p>

            </div>
        </a></li>
        <li><a href="#"><p class="clubpic"> <img src="images/hobby1.jpg" alt=""></p>
            <div class="bottom">
                <p class="color">모임명</p>

            </div>
        </a></li>
        <li><a href="#"><p class="clubpic"> <img src="images/hobby1.jpg" alt=""></p>
            <div class="bottom">
                <p class="color">모임명</p>
            </div>
        </a></li>
    </ul>
    <a href="clubprelistform.action">더보기</a>
  </section>

    </div>
    <div>
        <c:import url="footer.jsp"></c:import>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>