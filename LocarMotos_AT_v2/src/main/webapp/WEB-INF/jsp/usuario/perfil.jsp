<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="styles.css">
    <title>Index</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container-user">
    <h3>Listagem de Usuários</h3>
    <c:if test="${empty usuarios}">
        <h5>Não existem usuários cadastrados!!!</h5>
    </c:if>
    <c:if test="${not empty usuarios}">
    <h5>Quantidade de usuários cadastrados: ${usuarios.size()}!!!</h5>
</div>

    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="foto">
        <button type="submit">Enviar</button>
    </form>
</c:if>
</body>
</html>