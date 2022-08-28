<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulário de Cadastro Empresa</title>
    </head>
    <body>
        <form action="${linkEntradaServlet}" method="post">
            Login: <input type="text" name="login"/>
            <br><br>
            Senha: <input type="password" name="senha"/>            
            <input type="hidden" name="acao" value="Login" />
            <input type="submit" />
     	</form>        
    </body>
</html>