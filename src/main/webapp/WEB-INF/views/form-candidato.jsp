<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	

<form action="criaCandidato" method="post">

	Nome:
	<input type="text" name="nome" /> Email:
	<input type="text" name="email" /> Telefone:
	<input type="text" name="telefone" /> 
	
	<input type="submit" value="Enviar" onclick="location.href='/criarCandidato?id=${vagas.id}'">
		</form>
</body>
</html>