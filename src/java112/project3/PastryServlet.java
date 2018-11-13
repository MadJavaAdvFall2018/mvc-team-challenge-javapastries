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

        response.setContentType("text/html");

        //setting up variables for use
        Pastry yourPastry = new Pastry();
        String url = "/YourPastry.jsp";      //TODO confirm the URL to send/forward browser to (with Gabe)

        //getting parameters; TODO - there's gotta be a way to loop this instead of manually writing it all out
        int odAnswer = Integer.parseInt(request.getParameter("od"));
        boolean nutsAnswer = Boolean.parseBoolean(request.getParameter("nuts"));
        String flavorAnswer = request.getParameter("flavor");

        //setting parameter values into the instance variable fields
        yourPastry.setOd(odAnswer);
        yourPastry.setNuts(nutsAnswer);
        yourPastry.setFlavor(flavorAnswer);
        log("###################################################" + odAnswer);
        log("###################################################" + flavorAnswer);
        yourPastry.run();

        //setting attribute; TODO: do we need more than just this? the instance variable is all we need, right?
        request.setAttribute("yourPastry", yourPastry);


        //forwarding browser to output JSP (a forward since we don't want user to be able to bookmark this page)
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
