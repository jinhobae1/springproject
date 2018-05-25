<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="views/common.css">
<style type="text/css">
header {
	height: 100px;
	background-color: blue;
}

header h1 {
	line-height: 100px;
}

#newWrite {
	text-align: right;
	line-height: 30px;
	width: 100%;
	height: 30px;
}

section {
	text-align: center;
}

table {
	width: 800px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table {
	margin-left: auto;
	margin-right: auto;
}

th, td {
	padding: 5px;
}

footer {
	height: 60px;
	background-color: blue;
	text-align: center;
}

footer h1 {
	line-height: 60px;
}
</style>
</head>
<body>
	<header>
		<h1>SPMS(Simple Project Management System)</h1>
	</header>
	<div id="newWrite">
		<a href="register">새 프로젝트 등록</a>
	</div>
	<section>
		<table>
			<th>프로젝트 이름</th>
			<th>시작날짜</th>
			<th>종료날짜</th>
			<th>상태</th>
			<c:if test="${list.size()>0 }">
				<c:forEach var="item" items="${list }">
					<tr>
						<td><a href="read?projectno=${item.projectno }">${item.projectname }</a></td>
						<td><fmt:formatDate value="${item.regdate}"
								pattern="yyyy-MM-dd" /></td>
						<td><fmt:formatDate value="${item.enddate }"
								pattern="yyyy-MM-dd" /></td>
						<td>${item.nowproject }</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</section>
	<div id="newWrite">
		<a href="listAll">보기화면으로 이동</a>
	</div>
	<footer>
		<h1>SPMS@2016</h1>
	</footer>

</body>
</html>