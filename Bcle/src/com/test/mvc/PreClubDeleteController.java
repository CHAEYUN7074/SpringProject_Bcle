package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class PreClubDeleteController implements Controller
{
   private IClubDAO dao;

   public void setDao(IClubDAO dao)
   {
      this.dao = dao;
   }

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      // 액션 코드
      
      ModelAndView mav = new ModelAndView();
      
      
      // 데이터 수신
      String cid = request.getParameter("cid");
      
      try
      {
         dao.remove(cid);
         
         mav.setViewName("redirect:clubprelistform.action");
         
      } catch (Exception e)
      {
         System.out.println(e.toString());
      }
      
      return mav;
      
   }
   
}