<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
				<h4>問い合わせフォーム</h4>
				<td><label>お名前:</label></td>
				<td><input type="text" name="name" ></td>
				<p>性別<br>
				<input type="radio" name="q1" value="male"> 男性
				<input type="radio" name="q1" value="female"> 女性
				<br>
				<br>
				<td>お問い合わせ内容:</td>
				<td><textarea name="otoiawase"></textarea></td>

				<br>
				<br>

				<input type="submit" value="送信">

</body>
</html>