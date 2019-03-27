<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">First name</th>
        <th scope="col"> Last name</th>
        <th scope="col">Nationality</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="author" items="${authors}">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td>${author.Nationality}</td>
        </tr>
        <td> <button class="btn btn-warning" onclick="window.location.href='/update/${author.id}'"> Edit </button> </td>
        <td> <button class="btn btn-danger"onclick="window.location.href='/delete/${author.id}'"> Delete </button> </td>
    </c:forEach>
    </tbody>
</table>
</body>
</html>