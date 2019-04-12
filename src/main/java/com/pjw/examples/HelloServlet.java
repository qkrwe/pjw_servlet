package main.java.com.pjw.examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������ ������ ó���� �ϰ� ������ ����� JSP�� ���� �� ����� �ѱ��.
 * 
 * @author Jacob
 */
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����͸� �����.
		String name = "������";

		// �����͸� request�� �¿��.
		request.setAttribute("name", name);

		// /WEB-INF/jsp/hello.jsp�� forward �Ѵ�.
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,
				response);
	}
}