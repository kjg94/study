<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인 화면</h1>
<hr />
<form action="./login.do" method="get">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange">아이디</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="로그인" /></td>
		</tr>
	</table>
</form>
</body>
</html>