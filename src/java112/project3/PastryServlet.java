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
        urlPatterns = { "/Pastry", "/MVC-Challenge" }
)

/**
 *  This servlet is the Controller for the "What Pastry Personality Are You?" application. It demonstrates use of
 *  MVC architecture and the flow between servlet (controller), JavaBean (model), and JSP (view). The "What Pastry
 *  Personality Are You?" app asks questions of the user and, based on the user response, determines the user's
 *  pastry personality, answering the age-old question "what kind of a pastry would you be if you were a pastry?".
 */
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

        //setting up variables for use
        Pastry yourPastry = new Pastry();
        String url = "/PastryJSP.jsp";      //TODO confirm the URL to send/forward browser to (with Gabe)

        //getting attributes; TODO - there's gotta be a way to loop this instead of manually writing it all out
        Integer odAnswer = request.getAttribute("od");
        Boolean nutsAnswer = request.getAttribute("nuts");
        String flavorAnswer = request.getAttribute("flavor");

        yourPastry.setOd(odAnswer);
        yourPastry.setNuts(nutsAnswer);
        yourPastry.setFlavor(flavorAnswer);

        //setting up attributes; TODO (only a Placeholder)
        request.setAttribute("yourPastry", yourPastry);


        //forwarding browser to output JSP (a forward since we don't want user to be able to bookmark this page)
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}