<%--
  Created by IntelliJ IDEA.
  User: hokis
  Date: 2019-01-23
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看图书</title>
</head>
<body>
    <center>
        <br>
        <br>
        <h2>书名：《${book.bookName}》</h2>
        <br>
        详情：
        <br>
        ID：${book.bookId}
        <br>
        <br>
        作者：${book.bookAuthor}
        <br>
        <br>
        发行时间：${book.bookPubdate}
        <br>
        <br>
        单价（￥）：${book.bookPrice}
        <br>
        <br>
        <br>
        <a href="javascript:window.history.back();">返回</a>

    </center>

</body>
</html>
