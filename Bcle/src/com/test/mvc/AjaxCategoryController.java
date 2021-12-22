/* ==============================
 * AjaxCategoryController.java
 * - 사용자 정의 컨트롤러 
 * ==============================*/
package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.google.gson.Gson;

public class AjaxCategoryController implements Controller
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
      
      //데이터 수신 
      String category_l_id = request.getParameter("category_L_Id");
      
      ArrayList<Category> categorySList = new ArrayList<Category>();
      
      
      
      //ArrayList<Category> categoryLList = new ArrayList<Category>();
      //String result="";
      //StringBuffer sb = new StringBuffer();
   
      try
      { 
                                                            // FROM CATE S 
         categorySList = dao.categorySList(category_l_id);  // where CATEGORY_ID =???
         
         //System.out.println(categorySList.get(1).getS_cat());
         /*
          * 
          * for(int i=0; i<categorySList.size(); i++) { sb.append("{\"category_s_id\":\""
          * + categorySList.get(i).getCategory_s_id()+"\"},"); sb.append("{\"s_cat\":\""
          * + categorySList.get(i).getS_cat()+"\"},");
          * 
          * } result += sb.toString();
          * 
          * result = result.substring(0, result.length()-1); result = "[" + result + "]";
          * 
          */

         Gson gson = new Gson();
         String result = gson.toJson(categorySList);
          
         mav.addObject("categorySList", result);
         mav.setViewName("/WEB-INF/view/AjaxCategory.jsp");
         
         
      } catch (Exception e)
      {
         System.out.println(e.toString());
      }
      
         return mav;
   }
   


}