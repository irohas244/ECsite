<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー登録</title>
</head>
<body>
  <form action="/example2/FormSampleServlet" method="post">
  名前：<input type="text" name="name"><br>
  お問い合わせの種類：
  <select name="qtype">
  <option value="company">会社について</option>
  <option value="product">製品について</option>
  <option value="support">アフターサポートについて</option>
  </select><br>
  お問い合わせ内容：
  <textarea name="body"></textarea><br>
  <input type="submit">
  </form>
</body>
</html>
