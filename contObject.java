package testIlya;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class contTest
 */
@WebServlet("/servlet/testIlya.contTest")
public class contObject extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  request.setCharacterEncoding("UTF-8");
  response.setContentType("text/html; charset=utf-8");
    
  testDAO dao = new testDAO();
  
  try {
   List<test> entities = dao.getAll();
   
   request.setAttribute("entityList", entities);
   
   RequestDispatcher dispatcher = request.getRequestDispatcher("testIlya/test.jsp");
   dispatcher.forward(request, response);
  } catch (Exception e) {
   e.printStackTrace();
   response.getWriter().println("Произошла ошибка: " + e.getMessage());
  } finally {
   dao.close();
  }
     
    //request.setAttribute("testList", testList);  
    //request.getRequestDispatcher("testIlya/test.jsp").forward(request, response);
    
    //com.basis.ProgramFlow.forward("testIlya/test.jsp", request, response, this);
   }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}