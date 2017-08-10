<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function valida() {
		alert(hello);
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adiciona Vaga</title>
</head>

<body>
	<form name="formVaga" action="adicionaVaga" method="post">
		<h3>Entre com os dados da vaga:</h3>
		Nome da vaga: <input type="text" name="nome" />
		<form:errors path="vaga.nome" cssStyle="color:red" />
		<br /> <br /> Descrição:
		<textarea name="descricao" rows="2" cols="50"></textarea>
		<br />
		<form:errors path="vaga.descricao" cssStyle="color:red" />
		<br /> <br /> <input type="submit" value="Adicionar"
			onclick="valida()" />


	</form>
	<br />
	<input type="button" onclick="location.href='/menu'"
		value="Voltar ao Menu ">
</body>
</html>