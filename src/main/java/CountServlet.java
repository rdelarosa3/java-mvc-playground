import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int hitCount;
    public void init() {
        hitCount = 0;
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        boolean countReset = Boolean.parseBoolean(request.getParameter("reset"));
        if(countReset) {
            hitCount = 0;
        }else{
            hitCount += 1;
        }
        String title = "Total Number of Visits";
        String docType = "<!DOCTYPE html>";
        out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
            "<h1 align = \"center\">" + title + "</h1>\n" +
            "<h2 align = \"center\">" + hitCount + "</h2>\n" +
            "</body>\n" +
            "</html>"
        );
    }
}
