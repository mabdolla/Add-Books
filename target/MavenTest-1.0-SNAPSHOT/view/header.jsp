<%--
  Created by IntelliJ IDEA.
  User: Mohammad Abdolla
  Date: 22.01.2019
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Bookstore</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" ISBN="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/listOfBooks">Books</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/listOfAuthors">Authors</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/addBook">Add books</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/addAuthor">Add authors</a>
            </li>

        </ul>
    </div>
</nav>

</body>
</html>
