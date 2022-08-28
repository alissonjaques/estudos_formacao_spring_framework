package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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

//@WebFilter("/entrada")
public class ControladorFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void destroy() {}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("ControladorFilter");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String paramAcao = request.getParameter("acao");

		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		String nome = "";
		Acao acao;
		switch (paramAcao) {
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
		 * try { Class classe = Class.forName(nomeDaClasse); // carrega a classe através
		 * do nome da classe no diretório Acao acao = (Acao)classe.newInstance(); nome =
		 * acao.executa(request,response); } catch (ClassNotFoundException |
		 * InstantiationException | IllegalAccessException e) { throw new
		 * ServletException(e); }
		 */

		String[] tipoEndereco = nome.split(":");
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			System.out.println(tipoEndereco[1]);
			response.sendRedirect(tipoEndereco[1]);
		}
	}

}
