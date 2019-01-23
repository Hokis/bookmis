<%--
  Created by IntelliJ IDEA.
  User: hokis
  Date: 2019-01-23
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找图书资料</title>
    <script src="/static/jquery.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function (e) {
            alert("即将着色...");
            $("a").css({"color":"red","font-size":"20px"});
        });
    </script>
</head>
<body>

    <center>
        <br>
        <br>
        <a href="/getbook/b0001">查看b0001</a>
        <br>
        <br>
        <a href="/getbook/b0002">查看b0002</a>

    </center>

</body>
</html>
