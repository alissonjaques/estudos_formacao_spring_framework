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

public class AlteraEmpresa implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String paramDataEmpresa = request.getParameter("data");
        SimpleDateFormat  dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataAbertura = null;
        try {
			dataAbertura = dataFormatada.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
        
        Integer id = Integer.valueOf(request.getParameter("id"));
        System.out.println("Alterando nova empresa " + id);
        
        Banco banco = new Banco();
        
        Empresa empresa = banco.buscaEmpresaPeloId(id);
        empresa.setNome(request.getParameter("nome"));
        empresa.setCnpj(request.getParameter("cnpj"));
        empresa.setDataAbertura(dataAbertura);
        return "redirect:entrada?acao=ListasEmpresas";          
	}
}
