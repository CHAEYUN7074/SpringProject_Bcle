/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-23 08:09:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PreClubUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1639549998000L));
    _jspx_dependants.put("jar:file:/C:/Bcle/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Bcle/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

   request.setCharacterEncoding("UTF-8");
String cp = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>ClubCreate.jsp</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(cp);
      out.write("/js/jquery-ui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(cp);
      out.write("/js/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   \r\n");
      out.write("   $(document).ready(function()\r\n");
      out.write("   {\r\n");
      out.write("      //카테고리 대분류(category_L_Id)가 변경되었을 경우 수행해야 할 코드 처리\r\n");
      out.write("      $(\"#category_L_Id\").change(function()\r\n");
      out.write("      {\r\n");
      out.write("         //lert($(\"#category_L_Id\").val());\r\n");
      out.write("         \r\n");
      out.write("         // Ajax 요청 및 응답 처리\r\n");
      out.write("         $.ajax(\r\n");
      out.write("         {\r\n");
      out.write("            type : \"POST\"\r\n");
      out.write("            ,url : \"ajaxcategory.action\"\r\n");
      out.write("            ,data : {category_L_Id : $(\"#category_L_Id\").val()}\r\n");
      out.write("            ,dataType : \"json\" //{key : vlaue}\r\n");
      out.write("            ,success : function(result)\r\n");
      out.write("            {\r\n");
      out.write("               $(\"#category_S_Id\").children().remove();\r\n");
      out.write("               $(\"#category_S_Id\").append(\"<option value=\\\"\\\">선택</option>\");\r\n");
      out.write("               \r\n");
      out.write("               for(var i=0; i<result.length; i++)\r\n");
      out.write("               {\r\n");
      out.write("                  $(\"#category_S_Id\").append(\"<option value=\\\"\"+result[i].category_s_id+\"\\\">\"+result[i].s_cat+\"</option>\");\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("            ,error : function(e)\r\n");
      out.write("            {\r\n");
      out.write("               alert(e.responseText);\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      $(\"#region_L_Id\").change(function()\r\n");
      out.write("      {\r\n");
      out.write("         //alert('변경');\r\n");
      out.write("         //alert($(\"#region_L_Id\").val());\r\n");
      out.write("         \r\n");
      out.write("         $.ajax(\r\n");
      out.write("         {\r\n");
      out.write("            type : \"POST\"\r\n");
      out.write("            ,url : \"ajaxregion.action\"\r\n");
      out.write("            ,data : {region_L_Id : $(\"#region_L_Id\").val()}\r\n");
      out.write("            ,dataType : \"json\"\r\n");
      out.write("            ,success : function(result)\r\n");
      out.write("            {\r\n");
      out.write("               //alert(result);\r\n");
      out.write("               $(\"#region_S_Id\").children().remove();\r\n");
      out.write("               $(\"#region_S_Id\").append(\"<option value=\\\"\\\">선택</option>\");\r\n");
      out.write("               \r\n");
      out.write("               for(var i=0; i<result.length; i++)\r\n");
      out.write("               {\r\n");
      out.write("                  $(\"#region_S_Id\").append(\"<option value=\\\"\"+result[i].region_s_id+\"\\\">\"+result[i].local+\"</option>\");\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("            ,error : function(e)\r\n");
      out.write("            {\r\n");
      out.write("               alert(e.responseText);\r\n");
      out.write("            }\r\n");
      out.write("         \r\n");
      out.write("          });\r\n");
      out.write("   \r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("   });\r\n");
      out.write("      //동아리명 중복 검사\r\n");
      out.write("      \r\n");
      out.write("    $(document).ready(function()\r\n");
      out.write("   {\r\n");
      out.write("      \r\n");
      out.write("      $('.title').focusout(function()  //focusout\r\n");
      out.write("      {\r\n");
      out.write("         let userTitle = $('.title').val();   \r\n");
      out.write("         \r\n");
      out.write("         $.ajax({\r\n");
      out.write("            url : \"checktitle.action\" // ①컨트롤러로~\r\n");
      out.write("            , type : \"POST\"\r\n");
      out.write("            , data : {userTitle : userTitle}\r\n");
      out.write("            , dataType : \"json\"      \r\n");
      out.write("            , success : function(result) //Check title에서 여기로 왔다.\r\n");
      out.write("            {\r\n");
      out.write("               if(result.title == 0){\r\n");
      out.write("                  $(\"#checkTitle\").html('이미 동일한 이름의 동아리가 존재합니다.');\r\n");
      out.write("                  $(\"#checkTitle\").css('color', 'red');\r\n");
      out.write("                  $('#title').val(''); //중복된 내용삭제\r\n");
      out.write("\r\n");
      out.write("               }\r\n");
      out.write("               else\r\n");
      out.write("               {\r\n");
      out.write("\r\n");
      out.write("                  $(\"#checkTitle\").html('사용할 수 있는 동아리 이름입니다.');\r\n");
      out.write("                  $(\"#checkTitle\").css('color', 'green');\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("            , error : function(e)\r\n");
      out.write("            {\r\n");
      out.write("               alert(e.responseText); //에러사항 보여주기\r\n");
      out.write("            }\r\n");
      out.write("         })\r\n");
      out.write("      })\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write(" //각 상황별 alert 창 → required로 했는데 클리어하지가 않아서, 각 상황에 맞게 알림창을 띄우기로했다.\r\n");
      out.write("   $(document).ready(function()\r\n");
      out.write("   {\r\n");
      out.write("      $(\"#submitBtn\").click(function()\r\n");
      out.write("      {/* \r\n");
      out.write("         if ($(\"#title\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"동아리명을 입력하세요.\");\r\n");
      out.write("            $(\"#title\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         if ($(\"#category_L_Id\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"카테고리를 선택해주세요\");\r\n");
      out.write("            $(\"#category_L_Id\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("         if ($(\"#category_S_Id\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"카테고리를 선택해주세요\");\r\n");
      out.write("            $(\"#category_S_Id\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("         if ($(\"#region_L_ID\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"지역을 선택해주세요\");\r\n");
      out.write("            $(\"#region_L_ID\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("         if ($(\"#region_S_ID\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"지역을 선택해주세요\");\r\n");
      out.write("            $(\"#region_S_ID\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("         if ($(\"#max\").val().length == 0)\r\n");
      out.write("         {\r\n");
      out.write("            alert(\"최대 인원을 입력하세요\");\r\n");
      out.write("            $(\"#max\").focus();\r\n");
      out.write("            return;\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("          if ($(\"#content\").val().length == 0)\r\n");
      out.write("          {\r\n");
      out.write("          alert(\"내용을 입력하세요\");\r\n");
      out.write("          $(\"#content\").focus();\r\n");
      out.write("          return;\r\n");
      out.write("          } \r\n");
      out.write(" */\r\n");
      out.write("         \r\n");
      out.write("         $(\"#updateForm\").submit();\r\n");
      out.write("      });\r\n");
      out.write("   });\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <!-- \r\n");
      out.write("ClubCreate.jsp\r\n");
      out.write("- 동아리장 - 동아리 개설하기(발의하기)\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("   <div class=\"wrap\">\r\n");
      out.write("      <!-- 네브 영역 -->\r\n");
      out.write("      <div>\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("     <!-- \r\n");
      out.write("     HttpSession session = request.getSession();\r\n");
      out.write("     session.setAttribute(\"id\", id);\r\n");
      out.write("       -->   \r\n");
      out.write("      <!-- 콘텐츠 영역 -->\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("         <h1>[ 동아리 발의 ]</h1>\r\n");
      out.write("         <hr>\r\n");
      out.write("\r\n");
      out.write("         <div>\r\n");
      out.write("            <form action=\"preclubupdate.action\" method=\"post\" id=\"updateForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("               <div>\r\n");
      out.write("                  <input type=\"text\" name=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.cid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none;\"> <!-- cid 안보이게 삽입 -->\r\n");
      out.write("                  <p>\r\n");
      out.write("                  동아리명<input type=\"text\" name=\"title\" id=\"title\" class=\"title\" maxlength='20'  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <input type=\"button\" value=\"중복확인\" id=\"check\">\r\n");
      out.write("                  <span id=\"checkTitle\" style=\"font-size: small;\"></span><br>\r\n");
      out.write("                  \r\n");
      out.write("                  프로필 사진\r\n");
      out.write("                  <input type=\"file\" name=\"url\" id=\"url\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.url }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                  <p>\r\n");
      out.write("                  <!-- \r\n");
      out.write("                     동아리장<input type=\"text\" name=\"nickname\" id=\"nickname\"\r\n");
      out.write("                        placeholder=\"로그인 상태인 사람 여기에 자동 닉네임 뿌려주기\" disabled=\"disabled\"> \r\n");
      out.write("                     개설예정일<input\r\n");
      out.write("                        type=\"text\" name=\"preopendate\" id=\"preopendate\"\r\n");
      out.write("                        placeholder=\"자동입력\" disabled=\"disabled\">\r\n");
      out.write("                         -->\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <div>\r\n");
      out.write("                     카테고리 \r\n");
      out.write("                     <select id=\"category_L_Id\" name=\"category_L_Id\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     </select> \r\n");
      out.write("                     <select id=\"category_S_Id\" name=\"category_S_Id\">\r\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.category_s_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected=\"selected\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.s_cat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <div>\r\n");
      out.write("\r\n");
      out.write("                     지역  \r\n");
      out.write("                     <select id=\"region_L_Id\" name=\"region_L_Id\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     </select>      \r\n");
      out.write("                     <select id=\"region_S_Id\" name=\"region_S_Id\">\r\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.region_s_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected=\"selected\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.local}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option> \r\n");
      out.write("                     </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <p>\r\n");
      out.write("                     가입 최대인원 설정<input type=\"text\" id=\"max\" name=\"max\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.max}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <div>\r\n");
      out.write("                     <p>내용</p>\r\n");
      out.write("                     <textarea rows=\"10\" cols=\"70\" id=\"content\" name=\"content\" maxlength='100'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div>\r\n");
      out.write("                     <h5>동아리 가입시 제한조건(옵션)</h5>\r\n");
      out.write("                     \r\n");
      out.write("                     <div>\r\n");
      out.write("                        지역제한\r\n");
      out.write("                        <input type=\"radio\" name=\"regionlimit\" value=\"X\" id=\"regionlimitX\" \r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.limit_id == 'X' ? \"checked=\\\"checked\\\"\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("                        <label for=\"regionlimitX\">없음</label>\r\n");
      out.write("                        <input type=\"radio\" name=\"regionlimit\" id=\"regionlimitO\" value=\"O\"\r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.limit_id == 'O' ? \"checked=\\\"checked\\\"\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" > \r\n");
      out.write("                        <label for=\"regionlimitO\">있음</label>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        나이제한\r\n");
      out.write("                        <input type=\"radio\" name=\"agelimit\" id=\"agelimitX\" value=\"X\" checked=\"checked\"> \r\n");
      out.write("                        <label for=\"agelimitX\">없음</label>\r\n");
      out.write("                        <input type=\"radio\" name=\"agelimit\" id=\"agelimitO\"  value=\"O\"> \r\n");
      out.write("                        <label for=\"agelimitO\">있음</label>\r\n");
      out.write("                        <br>※동아리장이 성인인 경우 10대만 모집하는것은 불가능합니다.\r\n");
      out.write("                     </div>\r\n");
      out.write("\r\n");
      out.write("                     <div>\r\n");
      out.write("                        <button type=\"button\" class=\"btn\" id=\"submitBtn\">등록</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn\" id=\"cancleBtn\" onclick=\"location.href='MainPage.jsp'\">취소</button>\r\n");
      out.write("                     </div>\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /PreClubUpdateForm.jsp(189,9) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("nav.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /PreClubUpdateForm.jsp(224,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("category");
      // /PreClubUpdateForm.jsp(224,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryLList }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                            <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.category_l_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                            ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.category_l_id == category.category_l_id ? \"selected=\\\"selected\\\"\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("                             >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.l_cat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /PreClubUpdateForm.jsp(240,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("region");
      // /PreClubUpdateForm.jsp(240,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${regionLList }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                            <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.region_l_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                            ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preopen.region_l_id == region.region_l_id ? \"selected=\\\"selected\\\"\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("                             >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
