package alura.com.servelet.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
//		chamar JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		rd.forward(request, response);
		
		
		
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>ola nome da empresa: " + nomeEmpresa + "</body></html>");
	}

}
