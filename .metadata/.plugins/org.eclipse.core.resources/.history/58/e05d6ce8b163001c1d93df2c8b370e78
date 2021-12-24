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

      // 세션 처리 과정 추가 필요 ★
      
      //cid 수신
      String cid = request.getParameter("cid");
      
      ClubDTO club =new ClubDTO();

      try
      {
        club = dao.showPreOpenClub(cid);

         mav.addObject("clubDetail", club);
        

         mav.setViewName("ClubBeforeOpenedContents.jsp");
         
      } catch (Exception e)
      {
         System.out.println(e.toString());
      }

      return mav;
   }

}