import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<form action='' method='post'>");
        stringBuilder.append("账号：<input thpe='text' name='loginName' value=''><br>");
        stringBuilder.append("密码：<input thpe='password' name='loginPwd' value=''><br>");
        stringBuilder.append("<input type='submit' name='submit' value='登录'>");
        stringBuilder.append("<input type='reset' name='reset' value='取消'>");
        stringBuilder.append("</form>");
        showMsg(resp, stringBuilder.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg;
        String loginName = req.getParameter("loginName");
        String loginPwd = req.getParameter("loginPwd");
        if ("exllino".equals(loginName) && "123456".equals(loginPwd)) {
            msg = "登录成功，用户名： " + loginName;
        } else {
            msg = "账号或密码错误";
        }
        showMsg(resp, msg);
    }

    private void showMsg(HttpServletResponse resp, String msg) throws IOException {
        resp.setCharacterEncoding("UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<header>");
        stringBuilder.append("<title>maven-web</title>");
        stringBuilder.append("meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">");
        stringBuilder.append("</header>");
        stringBuilder.append("<body>");
        stringBuilder.append(msg);
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
        PrintWriter out = resp.getWriter();
        out.println(stringBuilder.toString());
        out.close();
    }
}
