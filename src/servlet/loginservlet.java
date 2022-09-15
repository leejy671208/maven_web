import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        String username=request.getParameter("userName");
        String password=request.getParameter("password");

        User user=new User(username,password);

        userService us=new userServiceImpl();


    }
}