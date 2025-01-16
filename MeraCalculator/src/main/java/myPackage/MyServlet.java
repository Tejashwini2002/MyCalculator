package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		// you must type caste the input values from String to Integer values (Parsing)
		
        String str3 = request.getParameter("bt1"); // In this String str3, we are fetching the value specified in the button tag
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int ans;
		
		if(str3.equals("1")) ans= num1 + num2;
		else if(str3.equals("2")) ans= num1 - num2;
		else if(str3.equals("3")) ans= num1 * num2;
		else ans=num1/num2;
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Ans = "+ans);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
