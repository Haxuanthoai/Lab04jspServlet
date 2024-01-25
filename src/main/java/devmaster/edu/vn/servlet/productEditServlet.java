package devmaster.edu.vn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productEdit")
public class productEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public productEditServlet() { 
		super();
	}

	protected void doGet(HttpServletRequest request,
HttpServletResponse response)
		throws ServletException, IOException {
           // code đọc dữ liệu sửa ở đâu
	}
	protected void doPost(HttpServletRequest request,
HttpServletResponse response)
		throws ServletException, IOException {
		// khi ghi lại  nd sửa, code ở đây
	}
}