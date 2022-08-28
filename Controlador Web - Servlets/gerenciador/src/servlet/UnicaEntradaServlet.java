package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.Acao;
import acao.AlteraEmpresa;
import acao.ListasEmpresas;
import acao.Login;
import acao.LoginForm;
import acao.Logout;
import acao.MostraEmpresa;
import acao.NovaEmpresa;
import acao.NovaEmpresaForm;
import acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");				
		//String nomeDaClasse = "gerenciador.acao." + paramAcao;
		//String nomeDaClasse = "gerenciador\\src\\acao\\"+ paramAcao+".class";
		String nome = "";
		Acao acao;
		switch(paramAcao) {
			case "AlteraEmpresa":
				acao = (Acao) new AlteraEmpresa();
				nome = acao.executa(request, response);
				break;
			case "ListasEmpresas":
				acao = (Acao) new ListasEmpresas();
				nome = acao.executa(request, response);
				break;
			case "Login":
				acao = (Acao) new Login();
				nome = acao.executa(request, response);
				break;
			case "LoginForm":
				acao = (Acao) new LoginForm();
				nome = acao.executa(request, response);
				break;
			case "MostraEmpresa":
				acao = (Acao) new MostraEmpresa();
				nome = acao.executa(request, response);
				break;
			case "NovaEmpresa":
				acao = (Acao) new NovaEmpresa();
				nome = acao.executa(request, response);
				break;
			case "NovaEmpresaForm":
				acao = (Acao) new NovaEmpresaForm();
				nome = acao.executa(request, response);
				break;
			case "RemoveEmpresa":
				acao = (Acao) new RemoveEmpresa();
				nome = acao.executa(request, response);
				break;
			case "Logout":
				acao = (Acao) new Logout();
				nome = acao.executa(request, response);
				break;
		}
		/*
		try {
			Class classe = Class.forName(nomeDaClasse); // carrega a classe atrav�s do nome da classe no diret�rio
			Acao acao = (Acao)classe.newInstance();
			nome = acao.executa(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}*/
				
		String[] tipoEndereco = nome.split(":");
		if(tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEndereco[1]);
			rd.forward(request, response);			
		} else {
			System.out.println(tipoEndereco[1]);
			response.sendRedirect(tipoEndereco[1]);			
		}		
	}

}
