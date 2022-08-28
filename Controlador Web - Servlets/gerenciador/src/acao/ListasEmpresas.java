package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Banco;
import model.Empresa;

public class ListasEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Listando empresas");
		Banco base = new Banco();
		List<Empresa> lista = base.getEmpresas();
		request.setAttribute("empresas", lista);
		return "forward:listaEmpresas.jsp";
	}
}
