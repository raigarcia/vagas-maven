<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="alteraVaga" method="post">

		<input type="hidden" name="id" value="${vaga.id}" />

		<textarea name="nome" rows="2" cols="20">
		${vaga.nome}
		</textarea>

		<textarea name="descricao" rows="2" cols="20">
		${vaga.descricao}
		</textarea>

		<input type="submit" value="Alterar" />
	</form>

</body>
</html>