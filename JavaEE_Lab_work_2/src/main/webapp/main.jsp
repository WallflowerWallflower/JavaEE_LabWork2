<%@page contentType="text/html" pageEncoding="UTF-8" import ="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
    <title>Main Page</title>
</head>
<body>

<header>
    <nav class="ul-flex">
        <a href="registration">Registration Page</a>
        <a href="login">Login Page</a>
    </nav>
</header>

<div class="form-box">
    <div class="main-box">
        <p>Username: <span><% out.println((String)request.getAttribute("username")); %></span></p>
        <p>Password: <span><% out.println((String)request.getAttribute("password")); %></span></p>
        <p>Status: <span><% out.println((String)request.getAttribute("status")); %></span></p>
    </div>
</div>


</body>
</html>