package acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Banco;
import model.Empresa;

public class NovaEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
        String paramDataEmpresa = request.getParameter("data");
        SimpleDateFormat  dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataAbertura = null;
        try {
			dataAbertura = dataFormatada.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
        
        int id = Banco.chaveSequencial + 1;
        Banco.chaveSequencial = id;
        Empresa empresa = new Empresa(id,request.getParameter("nome"),request.getParameter("cnpj"),dataAbertura);
        System.out.println(empresa);
        Banco banco = new Banco();
        banco.adiciona(empresa);
        
        request.setAttribute("nome", empresa.getNome());
        request.setAttribute("cnpj", empresa.getCnpj());
        return "redirect:entrada?acao=ListasEmpresas";
   }
}
