import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for processing user inputs from login, signup, and posting (items for sale)
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(", method= ").append(request.getMethod());;
				response.setContentType("text/html");
				PrintWriter out = response.getWriter(); 
		
		if (request.getParameter("login-submit")!= null ) {
			out.println("<br/><br/><html>" +
                    "   <body>" +
                    "      HTML Login Form Data: " + "Email: "  + request.getParameter("inputEmail") + ", " + "Password: " + request.getParameter("inputPassword") +                    
                    "   </body>" +
					"</html>" ); 	
			out.println("<p>Redirect URL:<a href=\"http://localhost/FindItUVA/landing.html\">Click here to redirect to the home page</a></p>");
		}
		
		if (request.getParameter("signup-submit")!=null) {
			out.println("<br/><br/><html>" +
                    "   <body>" +
                    "      HTML Signup Form Data: " + "Email: "  + request.getParameter("inputEmailSignUp") + ", " + "Password: " + request.getParameter("inputPasswordSignUp") + ", " + "Phone Number: " + request.getParameter("phoneNumberSignUp") +                    
                    "   </body>" +
                    "</html>" ); 	
			out.println("<p>Redirect URL:<a href=\"http://localhost/FindItUVA/landing.html\">Click here to redirect to the home page</a></p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}

