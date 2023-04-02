<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form name="formulario2" action="/cep" method="post">
    <input type="text" class="text" name="cep" value="${endereco.cep}">
    <span>Cep <button class="buton3" type="submit">Procurar</button></span>
    <input type="text" class="text" name="logradouro" value="${endereco.logradouro}">
    <span>Logradouro</span>
    <input type="text" class="text" name="bairro" value="${endereco.bairro}">
    <span>Bairro</span>
    <input type="text" class="text" name="localidade" value="${endereco.localidade}">
    <span>Localidade</span>
    <input type="text" class="text" name="uf" value="${endereco.uf}">
    <span>UF</span>
</form>
<button class="signin" onclick="enviarFormularios()">Cadastrar</button>
<script>
    function enviarFormularios() {
        document.forms["formulario1"].submit();
    }
</script>