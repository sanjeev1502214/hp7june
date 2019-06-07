package holiday_planner.bo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import holiday_planner.dao.RegisterDAOImpl;
import holiday_planner.vo.Register;


@WebServlet("/Register")
public class RegisterBO extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int result = 0;
				
		try
		{
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			int age = Integer.parseInt(request.getParameter("age"));
			String gender = request.getParameter("gender");
			long contactnumber = Long.parseLong(request.getParameter("contactnumber"));
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			
		Register r = new Register();
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setAge(age);
		r.setGender(gender);
		r.setContactnumber(contactnumber);
		r.setEmail(email);
		r.setPassword(password);
		
		RegisterDAOImpl rdo = new RegisterDAOImpl();
		result = rdo.registerValidation(r);
		
		if(result == 1)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("packages.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		
		}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		
	}

}
