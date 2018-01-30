package loginSystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Welcome extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
		
		res.setContentType("text/html;charset=UTF-8");
		String name = req.getParameter("userName");
		PrintWriter out = res.getWriter();
		out.print("welcome " + name);
		
	}

}
