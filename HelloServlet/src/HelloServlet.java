//servletはサーバサイドプログラムを作るための技術です。

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//↑heepsaervletクラスを継承
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	//dogetメソッドはサーブレットクラスがリクエストされると実行されるメソッド
	//サーブレットクラスのメインメソッドでもある
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H3>Hello Servlet!</H3>");
		out.println("</BODY>");
		out.println("</HTML>");



}
	｝

