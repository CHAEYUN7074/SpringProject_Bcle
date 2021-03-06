package com.test.mvc;


import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ClubSearchController implements Controller
{
   //주요 속성 구성
   // → 인터페이스 형태의 자료형을 속성으로 구성
   private IClubDAO dao;

   // setter 구성
   public void setDao(IClubDAO dao)
   {
      this.dao = dao;
   }
   
   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      ModelAndView mav = new ModelAndView();

      // 세션 처리 과정 추가 필요 
      
      //지역 리스트 추가 필요
      //카테고리 리스트 추가 필요
      String title = request.getParameter("search");
      
      
      ///////////////////////////////////
		/*
		 * if (request.getMethod().equalsIgnoreCase("GET")) { // 디코딩 처리 title =
		 * URLDecoder.decode(title, "UTF-8"); }
		 */
      ///////////////////////////////////////
      
      
      
      
      ArrayList<ClubDTO> searchList = new ArrayList<ClubDTO>();

      try
      {
    	  searchList = dao.searchList(title);

         mav.addObject("searchList", searchList);
        

         mav.setViewName("ClubBeforeOpenedListSearch.jsp");
         
         
      } catch (Exception e)
      {
         System.out.println(e.toString());
      }

      return mav;
   }

}
        
