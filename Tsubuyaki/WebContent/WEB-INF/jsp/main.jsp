<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% page import = "model.User, model.Mutter,java.util.List" %>
    <%
    //セッションスコープに保存されたユーザー情報を取得
    User loginUser = (User) session.getAttribute("loginUser");
    //アプリケーションスコープに保存されたつぶやきリストを取得
    List<Mutter>mutterList = (List<Mutter>)application.getAttribute("mutterList");
    %>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>メイン画面</h1>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="/docoTsubu/Logout">ログアウト</a>
</p>
<p><a href="/Tsubuyaki/Main">更新</a></p>

</body>
</html>