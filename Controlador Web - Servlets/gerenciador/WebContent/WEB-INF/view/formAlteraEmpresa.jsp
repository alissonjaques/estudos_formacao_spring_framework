<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulário de Cadastro Empresa</title>
    </head>
    <body>
    	<c:import url="logout-parcial.jsp"/>
        <form action="${linkEntradaServlet}" method="post">
            Nome: <input type="text" name="nome" value="${empresa.nome}"/>
            <br><br>
            CNPJ: <input type="text" name="cnpj" value="${empresa.cnpj}"/>
            <br><br>
            Data de Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>            
            <input type="hidden" name="id" value="${empresa.id}"/>
            <input type="hidden" name="acao" value="AlteraEmpresa">
            <input type="submit"/>
        </form>        
    </body>
</html>