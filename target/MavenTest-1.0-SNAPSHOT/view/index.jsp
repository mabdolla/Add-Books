<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Book</th>
        <th scope="col"> Release year</th>
        <th scope="col">Author</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.releaseYear}</td>
            <td>${book.author}</td>
        </tr>
        <td> <button class="btn btn-warning" onclick="window.location.href='/update/${book.ISBN}'"> Edit </button> </td>
        <td> <button class="btn btn-danger"onclick="window.location.href='/delete/${book.ISBN}'"> Delete </button> </td>
    </c:forEach>
    </tbody>
</table>
</body>
</html>