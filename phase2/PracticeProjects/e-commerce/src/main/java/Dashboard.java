

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Dashboard() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        
	          
	        HttpSession session=request.getSession(false);  
	        if(session!=null){  
	        String name=(String)session.getAttribute("username");  
	          
	        out.print("Hello, "+name+" Welcome to Profile");  
	        out.println("<a href='Logout'>Logout of session</a><br>");
	        }  
	        else{  
	            out.print("Please login first");  
	            out.println("<a href='index.html'>Login</a><br>");
	           // request.getRequestDispatcher("index.html").include(request, response);  
	        }  
	        out.close();  
	    }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
