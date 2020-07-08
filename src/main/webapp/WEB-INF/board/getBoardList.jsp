<%@page import="com.springbook.biz.board.BoardService"%>
<%@page import="com.springbook.biz.member.MemberService"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
<style>
#boardListBox{
	width:"800px";
	margin:"0 auto";
}
</style>
</head>
<body>
<div id="boardListBox">
<h1>글 목록</h1>
<h3>xxxxx님 환영합니다. <a href="logout.do">로그아웃</a></h3>

<form action="getBoardList.do" method="post">
<table border="1" width="700" cellspacing="0" cellpadding="0">
	<tr>
		<td align="right">
			<select name="searchCondition">
				<option value="TITLE">제목</option>
				<option value="CONTENT">내용</option>
			</select>
			<input type="text" name="searchKeywrod" />
			<input type="submit" value="검색" />
		</td>
	</tr>
</table>
<table border="1" width="700" cellspacing="0" cellpadding="0">
	<tr>
		<th bgcolor="orange" width="100">번호</th>
		<th bgcolor="orange" width="200">제목</th>
		<th bgcolor="orange" width="150">작성자</th>
		<th bgcolor="orange" width="150">등록일</th>
		<th bgcolor="orange" width="100">조회수</th>
	</tr>
	<c:forEach items="${boardList}" var="vo">
	 <tr>
	    <td>${vo.seq }</td>
	    <td align="left"><a href="getBoard.do?seq=${vo.seq }">${vo.title }</a></td>
	    <td>${vo.writer }</td>
	    <td>${vo.regdate }</td>
	    <td>${vo.cnt }</td>
	</tr>
	</c:forEach>
</table>
<br />
<a href="insertBoard.jsp">새글쓰기</a>
</form>
</div>
</body>
</html>