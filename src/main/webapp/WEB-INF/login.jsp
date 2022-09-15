<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta h=name="viewport" content="width=device-width, initial-scale=1">
    <title>登录页面</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script scr="js/bootstrap.js"></script>
</head>
<body>
    <div class="container text-center">
        <form class="form-signin" action="/loginServlet">
            <h2 class="form-signin-heading">登录</h2>
            <input type="text" name="userName" class="form-control" placeholder="用户名" required autofocus>
            <input type="password" name="password" class="form-control" placeholder="密码" required>
            <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        </form>
    </div>
</body>
</html>