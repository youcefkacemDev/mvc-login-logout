package youcef_controller.com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Services;

import java.io.IOException;

import DAO.User;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phoneNumber = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPhoneNumber(phoneNumber);
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setGender(gender);
		
		Services.add(user);
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
	}

}
