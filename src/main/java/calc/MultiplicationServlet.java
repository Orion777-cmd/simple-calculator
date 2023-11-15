package calc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MultiplicationServlet
 */
@WebServlet("/multiply")
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationServlet() {
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
		String firstNumberStr = request.getParameter("firstNumber");
        String secondNumberStr = request.getParameter("secondNumber");

        // Perform the multiplication
        try {
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);
            double result = firstNumber * secondNumber;

            // Set content type
            response.setContentType("text/html");

            // Get PrintWriter object
            PrintWriter out = response.getWriter();

            // HTML response with Bootstrap styling
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");
            out.println("<title>Multiplication Result</title>");
            out.println("</head>");
            out.println("<body class=\"bg-secondary text-white d-flex align-items-center justify-content-center\" style=\"height: 100vh;\">");
            out.println("<div class=\"text-center\">");
            out.println("<p class=\"h1\">Multiplication Result:</p>");
            out.println("<p class=\"h3\">" + result + "</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            // Handle invalid input
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Invalid Input</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Invalid input for multiplication</p>");
            out.println("</body>");
            out.println("</html>");
        }	
        
	}

}
