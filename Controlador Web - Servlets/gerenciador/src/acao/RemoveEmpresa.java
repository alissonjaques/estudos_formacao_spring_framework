package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Banco;

public class RemoveEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Removendo empresa");
		Banco banco = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		banco.remove(id);
		return "redirect:entrada?acao=ListasEmpresas";
	}
}
