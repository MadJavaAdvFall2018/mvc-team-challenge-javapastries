package java112.project3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "PastryServlet",
        urlPatterns = { "/Pastry", "/PastryServlet" }
)

public class PastryServlet extends HttpServlet {

    /**
     * Handles http POST requests.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Pastry yourPastry = new Pastry();
        String url = "/PastryJSP.jsp";


        request.setAttribute();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}