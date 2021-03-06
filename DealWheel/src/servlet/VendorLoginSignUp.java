package servlet;

import static services.utility.GenericConstant.NAV_TO_VENDORLOGINSIGNUP_PAGE;
import static services.utility.GenericConstant.NAV_TO_VENDORREGISTRATION_PAGE;
import static services.utility.GenericConstant.NAV_TO_VENDOR_HOME_PAGE;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.VendorLoginController;
import model.User;

@WebServlet("/vendorLoginSignUp")
public class VendorLoginSignUp extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String pagecontext = req.getContextPath();
		
		if(req.getParameter("identifier").equals("signup")){
			if(req.getParameter("password").equals(req.getParameter("confirmPassword")))
				req.getRequestDispatcher(NAV_TO_VENDORREGISTRATION_PAGE).forward(req, resp);
			else
				resp.sendRedirect(pagecontext+NAV_TO_VENDORLOGINSIGNUP_PAGE);
		}else{
			VendorLoginController vlc = new VendorLoginController();
			User user= vlc.validateUser(req.getParameter("loginEmail"), req.getParameter("loginPassword"));
			if(user!=null){
				req.getSession().setAttribute("UserName", user.getUserName());
				req.getSession().setAttribute("Useremail",user.getUserEmail());
				getServletContext().getRequestDispatcher(NAV_TO_VENDOR_HOME_PAGE).forward(req,resp);
			}else
				resp.sendRedirect(pagecontext+NAV_TO_VENDORLOGINSIGNUP_PAGE);
				
		}
		
	}

}
