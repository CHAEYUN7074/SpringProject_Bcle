/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-12-24 08:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>소라개</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mainpage.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        \r\n");
      out.write("   <!--header-->\r\n");
      out.write("   <header>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("   <!-- 주요 모임 소개배너 -->\r\n");
      out.write("   <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("    <div class=\"carousel-indicators\">\r\n");
      out.write("      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("      <div class=\"carousel-item active\">\r\n");
      out.write("        <img src=\"https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=07f7d7a9-aad7-4692-b8ae-ac83a16b9bc5&mode=raw\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"carousel-item\">\r\n");
      out.write("        <img src=\"https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=07f7d7a9-aad7-4692-b8ae-ac83a16b9bc5&mode=raw\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"carousel-item\">\r\n");
      out.write("        <img src=\"https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=e31b152a-0dd0-4a99-90e5-8226de762359&mode=raw\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\r\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\r\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("    </button>\r\n");
      out.write("  </div>\r\n");
      out.write("    <!--section.about-->\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   <!--//section.about--> \r\n");
      out.write("        <div style=\"margin: 50px;\">\r\n");
      out.write("            <form action=\"\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"동아리 이름으로 검색하기\"> <input type=\"button\" value=\"검색\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 카테고리로 검색 -->\r\n");
      out.write("        <div style=\"text-align: center;\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("                <div class=\"category-square\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <br>\r\n");
      out.write("        </div>\r\n");
      out.write("   <!--section.find-->\r\n");
      out.write("   <section class=\"join\">\r\n");
      out.write("       <div class=\"title\">\r\n");
      out.write("           <h2 class=\"en\">Find what you want <span>.</span></h2>\r\n");
      out.write("           <p>우리 지역의 소모임을 찾아봐요!</p>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"map\">\r\n");
      out.write("       <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d12663.606139647718!2d126.93995519999999!3d37.486649899999996!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sko!2skr!4v1636378273917!5m2!1sko!2skr\" width=\"100%\" height= \"540px\" allowfullscreen=\"\" loading=\"lazy\" ></iframe>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"imgBox\">\r\n");
      out.write("        <div class=\"inner\">\r\n");
      out.write("            <h3> 전국의 숨은 모임 </h3>\r\n");
      out.write("            <div class=\"bottom\">\r\n");
      out.write("              <p><a href=\"#\">서울</a> &nbsp&nbsp <a href=\"#\">세종</a> &nbsp&nbsp <a href=\"#\">강원</a> &nbsp&nbsp <a href=\"#\">인천</a>\r\n");
      out.write("              <a href=\"#\">서울</a> <span></span> <a href=\"#\">세종</a> <a href=\"#\">강원</a> <a href=\"#\">인천</a></p>\r\n");
      out.write("              <br>\r\n");
      out.write("              <p><a href=\"#\">서울</a> &nbsp&nbsp <a href=\"#\">세종</a> &nbsp&nbsp <a href=\"#\">강원</a> &nbsp&nbsp <a href=\"#\">인천</a>\r\n");
      out.write("              <a href=\"#\">서울</a> <span></span> <a href=\"#\">세종</a> <a href=\"#\">강원</a> <a href=\"#\">인천</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       </div>\r\n");
      out.write("</section>\r\n");
      out.write("<section>\r\n");
      out.write("  <div id=\"daumRoughmapContainer1568979425094\" class=\"root_daum_roughmap root_daum_roughmap_landing\" style=\"width:100%\"></div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!--계설예정동아리-->\r\n");
      out.write("  <section class=\"timeup\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h2>개설예정동아리<span>.</span></h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"#\"><p class=\"clubpic\"> <img src=\"images/hobby1.jpg\" alt=\"\"></p>\r\n");
      out.write("            <div class=\"bottom\">\r\n");
      out.write("                <p class=\"color\">모임명</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </a></li>\r\n");
      out.write("        <li><a href=\"#\"><p class=\"clubpic\"> <img src=\"images/hobby1.jpg\" alt=\"\"></p>\r\n");
      out.write("            <div class=\"bottom\">\r\n");
      out.write("                <p class=\"color\">모임명</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </a></li>\r\n");
      out.write("        <li><a href=\"#\"><p class=\"clubpic\"> <img src=\"images/hobby1.jpg\" alt=\"\"></p>\r\n");
      out.write("            <div class=\"bottom\">\r\n");
      out.write("                <p class=\"color\">모임명</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <a href=\"clubprelistform.action\">더보기</a>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
      // /MainPage.jsp(23,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("/nav.action");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /MainPage.jsp(54,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty id }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   <section class=\"about\">\r\n");
          out.write("       <div class=\"title en\">\r\n");
          out.write("           <h2 class=\"en\">Your Choice <span>.</span></h2>\r\n");
          out.write("           <p>가입한 소모임을 둘러볼까요?</p>\r\n");
          out.write("      </div>\r\n");
          out.write("      \t   ");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("   </section>\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
      // /MainPage.jsp(60,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("club");
      // /MainPage.jsp(60,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clubList }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("           <ul>\r\n");
            out.write("               <li><a href=\"clubmain.action?cid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${club.cid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                   <p class=\"clubpic\"><img src=\"images/camping.jpg\" ></p>\r\n");
            out.write("                   \t\t<div class=\"text\">\r\n");
            out.write("\t                       <h3>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${club.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</h3>\r\n");
            out.write("\t                       <input type=\"hidden\" id=cid name=\"cid\" value=\"club.cid\">\r\n");
            out.write("                   \t\t</div>\r\n");
            out.write("               \t\t</a>\r\n");
            out.write("               </li>\r\n");
            out.write("           </ul>\r\n");
            out.write("           ");
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

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("     <!--section.join-->\r\n");
          out.write("  <section class=\"join\">\r\n");
          out.write("      <div class=\"title\">\r\n");
          out.write("          <h2 class=\"en\">HAPPY JOIN <span>.</span></h2>\r\n");
          out.write("          <p>비클의 회원이 되시고 새로운 경험을 해보세요!</p>\r\n");
          out.write("      </div>\r\n");
          out.write("\r\n");
          out.write("      <button>참여하기</button>\r\n");
          out.write("  </section>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /MainPage.jsp(171,8) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("footer.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }
}
