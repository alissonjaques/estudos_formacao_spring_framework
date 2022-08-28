<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Nova Empresa Criada</title>
    </head>
    <body>
    	<c:import url="logout-parcial.jsp"/>
    	<c:if test= "${not empty nome}">
            <p>Empresa de Razão Social ${nome} e CNPJ ${cnpj} cadastrada com sucesso!</p>
        </c:if>

        <c:if test= "${empty nome}">
            <p>Nenhuma empresa cadastrada!</p>
        </c:if>
        
    </body>
</html>