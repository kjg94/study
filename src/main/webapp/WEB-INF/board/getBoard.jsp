<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page import="com.springbook.biz.board.BoardService"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<style>
#boardListBox{
	width:"800px";
	margin:"0 auto";
}
</style>
</head>
<body>
<div id="boardListBox">
<h3> 글 상세</h3>
<a href="logout.do">log-out</a>
<br />

<form action="updateBoard.do" method="post">
	<input type="text" name="seq" value="${vo.seq}" hidden="hidden"  />
		<table>
			<tr>
				<th bgcolor="orange" width="70">제목</th>
				<td align="left">
				<input type="text" name="title" value="${vo.title}" />
				</td>
			</tr>
			<tr>
				<th bgcolor="orange" width="70">작성자</th>
					<td align="left">${vo.writer}</td>
			</tr>
			<tr>
				<th bgcolor="orange" width="70">내용</th>
					<td align="left">
						<textarea name="content" cols="50" rows="10">${vo.content}</textarea></td>
			</tr>
			<tr>
				<th bgcolor="orange" width="70">등록일</th>
					<td align="left">${vo.regdate}</td>
			</tr>
			<tr>
				<th bgcolor="orange" width="70">조회수</th>
					<td align="left">${vo.cnt}</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="글 수정" />
				</td>
			</tr>
		</table>
	</form>
	<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${vo.seq}">글삭제</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">글목록</a>	
</div>
</body>
</html>