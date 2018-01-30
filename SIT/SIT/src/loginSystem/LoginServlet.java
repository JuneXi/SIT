package loginSystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	protected void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();	
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.print("got user name and pw");
		User user = new User();
		user.setName(userName);
		user.setPassword(password);
		
		/*if(Validate.checkUser(user)){
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rs = req.getRequestDispatcher("Welcome");
			rs.forward(req, res);
		}*/
		out.println("test");
		/*RequestDispatcher rs = req.getRequestDispatcher("welcome");
		rs.forward(req, res);*/
		
		
	}

}
