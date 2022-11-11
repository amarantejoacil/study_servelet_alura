<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

String nome = "executando codigo java dentro da jsp";
System.out.println(nome);

%>

Empresa: <% out.println(nome); %>


</body>
</html>