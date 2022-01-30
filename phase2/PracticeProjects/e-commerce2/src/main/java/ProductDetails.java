

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product p=new Product();
		CRUD crud =new CRUD();
		PrintWriter pw=response.getWriter();
		p.setPid(Integer.parseInt(request.getParameter("pid")));
		
			try {
				
				ResultSet rs=CRUD.select(p);
				if(rs!=null) {
				pw.print("Pid     Product Name         price       ProductDate \n");
				while(rs.next()) {
					pw.print("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"     "+rs.getDouble(3)+"\t"+rs.getString(4));
				}
				
					
				}
				else {
					pw.print("No product found with this id");
				}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
