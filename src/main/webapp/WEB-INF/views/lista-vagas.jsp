<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Vagas</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Vaga</th>
			<th>Descrição</th>
		</tr>
		<c:forEach items="${vagas}" var="vagas">
			<tr>
				<th>${vagas.id}</th>
				<th>${vagas.nome}</th>
				<th>${vagas.descricao}</th>

				<th><input type="button"
					onclick="location.href='/removeVaga?id=${vagas.id}'"
					value="Remover"></th>
					
				<th><input type="button"
					onclick="location.href='/mostraVaga?id=${vagas.id}'"
					value="Alterar"></th>
					
					<th><input type="button"
					onclick="location.href='/candidatoForm?id=${vagas.id}'"
					value="Aplicar à vaga"></th>
			</tr>
		</c:forEach>
	</table>
	<br />
	<input type="button" onclick="location.href='/menu'"
		value="Voltar ao Menu " />

</body>
</html>