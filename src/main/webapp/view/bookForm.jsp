<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mohammad Abdolla
  Date: 22.01.2019
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<div class="col-sm-6 mx-auto">
    <h4 class="text-primary text-center">Add new Book</h4>
    <form:form method="post" action="/bookSave" modelAttribute="book">
        <form:input path="ISBN" type="hidden"/>
        <div class="form-group">
            <form:input
                    type="text"
                    path="title"
                    placeholder="Name"
                    class="form-control"
            />
        </div>
        <div class="form-group">
            <form:input
                    type="text"
                    path="releaseYear"
                    placeholder="Release year"
                    class="form-control"
            />
        </div>
        <div class="form-group">
            <form:input
                    type="text"
                    path="author"
                    placeholder="Author"
                    class="form-control"
            />
        </div>
        <td><input type="submit" value="Submit"/></td>
    </form:form>
</div>
</body>
</html>
