package calc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class OperationsServlet
 */
@WebServlet("/operations")
public class OperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operation = request.getParameter("operation");

        // Assuming you have MultiplicationsServlet and AdditionsServlet mapped to "/multiply" and "/add" respectively
        if ("*".equals(operation)) {
            // Redirect to MultiplicationsServlet
            request.getRequestDispatcher("/multiply").forward(request, response);
        } else if ("+".equals(operation)) {
            // Redirect to AdditionsServlet
            request.getRequestDispatcher("/add").forward(request, response);
        } else {
            // Handle other operations or show an error
            response.getWriter().println("Invalid operation selected");
        }
    }
	

}
