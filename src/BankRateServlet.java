import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BankRateServlet", urlPatterns = "/bank-rate")
public class BankRateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rentMoney = Float.parseFloat(request.getParameter("rentMoney"));
        int rentMonth = Integer.parseInt(request.getParameter("rentMonth"));
        float rate = Float.parseFloat(request.getParameter("rate"));

        float payMoney = rentMoney * (100 + rentMonth * rate) / 100;

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<h1>Rent Money: " + rentMoney + "</h1>");
        printWriter.println("<h1>Rent month: " + rentMonth + "</h1>");
        printWriter.println("<h1>Bank rate: " + rate + "</h1>");
        printWriter.println("<h1>Money to pay: " + payMoney + "</h1>");
        printWriter.println("</html>");
    }
}
