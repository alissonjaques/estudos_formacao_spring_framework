package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Banco;
import model.Empresa;

public class MostraEmpresa implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Mostrando dados da empresa");
		Banco banco = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Empresa empresa = banco.buscaEmpresaPeloId(id);
		System.out.println(empresa.getNome());
		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
}
