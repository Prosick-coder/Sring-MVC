<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@page  isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Hey there I am here
 <br> <br>
 
 Result is : <%= request.getAttribute("result") %> -->
 Result is : {result}
 
</body>
</html>