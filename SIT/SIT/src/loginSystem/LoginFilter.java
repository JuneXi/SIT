package loginSystem;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter{
	
	public void init(FilterConfig fc) throws ServletException{
		
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain){
		//PrintWriter out = res.getWriter();
		//HttpSession session = req.getssion();;
		
	}
	
	public void destroy(){}
	

}
