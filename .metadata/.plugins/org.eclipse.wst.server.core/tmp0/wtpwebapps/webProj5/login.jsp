<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
</head>
<body>

<s:property value="#session.loginDTOList.get(0).username"/>さん、ようこそ！

<br>
<table>
<tbody>
<tr>
<th>USERNAME</th>
<th>PASSWORD</th>
</tr>
<tr>
<s:iterator value="#session.oginDTOList">
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
</s:iterator>
</tr>
</tbody>
</table>

</body>
</html>