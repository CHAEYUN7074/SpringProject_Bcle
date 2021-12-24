package com.test.mvc;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PreOpenClubDetailController implements Controller
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

      // 세션처리 -----------------------------------------

      HttpSession session = request.getSession();
      if (session.getAttribute("id") == null) // -- 로그인이 되어 있지 않은 상황
      {
         mav.setViewName("redirect:loginpage.action");
         return mav;
      }
      // ------------------------------------------------- 세션 처리

      // cid 수신
      String cid = request.getParameter("cid");
      // 세션값 id 수신 --MEMBERINFO의 주키(ID)임
      String id = (String) session.getAttribute("id");
      
      ClubDTO club = new ClubDTO();
      String mid = "";
      String joinCheck = "";
      try
      {
         club = dao.showPreOpenClub(cid); //입력한 상세정보 써주기 위한 처리
         mid = dao.searchMid(id); //--★추가 -- 세션 받은 id에 해당하는 MID 반환 

         //--★ 추가 .해당 동아리에 가입신청 되어있는지 확인 (되어 있다면 어떤 position으로)
         joinCheck = dao.searchJoin(mid, cid); //가입 안되어있으면 -1, 되어있으면 직위id반환
         
         //System.out.println(joinCheck);// 
         
         mav.addObject("clubDetail", club);
         mav.addObject("mid", mid); //-- 현재 로그인 한 사람의 mid
         mav.addObject("joinCheck", joinCheck); //--[지원하기]제어 위해 추가 

         
         mav.setViewName("ClubBeforeOpenedContents.jsp");

      } catch (Exception e)
      {
         System.out.println(e.toString());
      }

      return mav;
   }

}