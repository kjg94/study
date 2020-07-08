<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<style>
#boardListBox{
	width:"800px";
	margin:"0 auto";
}
</style>

</head>
<body>
<div id="boardListBox">
<h3>새로운 글쓰기</h3>
<a href="logout.do">log-out</a>
<hr />
<form action="insertBoard.do" method="post">
	<table border="1" width="700" cellspacing="0" cellpadding="0">
		<tr>
			<th bgcolor="orange" width="70">제 목</th>
			<td><input type="text" name="title" /></td>
		</tr>
		<tr>
			<th bgcolor="orange" width="70">작 성 자</th>
			<td><input type="text" name="writer" /></td>
		</tr>
		<tr>
			<th bgcolor="orange" width="70">내 용</th>
			<td><textarea name="content" cols="50" rows="10"></textarea></td>
		</tr>
		<tr>
				<td colspan="2" align="center">
				<input type="submit" value="새글쓰기" />
				</td>
			</tr>
	</table>
</form>
</div>
</body>
</html>