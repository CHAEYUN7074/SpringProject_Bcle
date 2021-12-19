package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ClubInsertController implements Controller
{
   private IClubDAO dao;
   
   public void setDao(IClubDAO dao)
   {
      this.dao = dao;
   }

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      ModelAndView mav = new ModelAndView();
      
      //세션처리 -----------------------------------------
         
      HttpSession session = request.getSession();
      if (session.getAttribute("id")==null) //-- 로그인이 되어 있지 않은 상황 
      {
         mav.setViewName("redirect:loginpage.action"); 
      return mav; 
      }
      //------------------------------------------------- 세션 처리 
      
      //세션값 id 수신 --MEMBERINFO의 주키(ID)임 
      String id = (String)session.getAttribute("id");
      
      System.out.println(id+"입니다");
      //ClubCreate.jsp로부터 데이터 수신.
      // 또 세션값 id( MEMBERINFO의 ID임) 을 이용하여 MID 구해야함. --프로시저에 적용함
      
      
      String title = request.getParameter("title");
      String url = request.getParameter("url"); //프로필사진url 나중에 수정 필요 ㅠㅠ
      String category_s_id = request.getParameter("category_S_Id");
      String category_l_id = request.getParameter("category_L_Id");
      String region_s_id = request.getParameter("region_S_Id");
      String region_l_id = request.getParameter("region_L_Id");
      int max = Integer.parseInt(request.getParameter("max"));
      String content = request.getParameter("content");
      String limit_id = request.getParameter("regionlimit");
      String agelimit_id = request.getParameter("agelimit");   
      
      System.out.println(id+title+url+category_s_id+region_s_id+max+content+limit_id+agelimit_id);
      
      try
      {
         ClubDTO club = new ClubDTO();
         
         club.setId(id);
         club.setTitle(title);
         club.setUrl(url);
         club.setCategory_s_id(category_s_id);
         club.setRegion_s_id(region_s_id);
         club.setMax(max);
         club.setContent(content);
         club.setLimit_id(agelimit_id);
         club.setAgelimit_id(agelimit_id);
         
         dao.insert(club);
         
         
         mav.setViewName("redirect:clubprelistform.action");
         // ★clubbeforelist.action 이나 동아리목록list.action이나..
         // List Controller로 필요함
         
      } catch (Exception e)
      {
         System.out.println(e.toString());
      }
      
   
      
      return mav;
   }

}