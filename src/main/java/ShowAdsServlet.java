import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class ShowAdsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads listads = DaoFactory.getAdsDao();
        List<Ad> ads = listads.all();
        request.setAttribute("ads", ads);
        request.setAttribute("name", "robert");
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
