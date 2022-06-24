<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<div class="container text-center">

    <a href="<%=request.getContextPath()%>/list" class="btn btn-primary">List Phone</a>
    <a href="<%=request.getContextPath()%>/add" class="btn btn-primary">Add Phone</a>
</div>
</body>
</html>