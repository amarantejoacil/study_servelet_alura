package alura.com.servelet.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class ListaEmpresasServelet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  		Banco banco = new Banco();
  	  	List<Empresa> listaEmpresas = banco.getEmpresas();
  	
  	  	PrintWriter out = response.getWriter();
  	
		out.println("<html><body></html>");
		out.println("<body>");
		out.println("<ul>");
		
		for(Empresa empresa : listaEmpresas) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}
		
		out.println("</ul>");  		  	    
		out.println("</body>");		
		out.println("</html>");
		
		
	}
  	
  	
  	
  	
  	

}
