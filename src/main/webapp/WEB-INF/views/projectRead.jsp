<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="views/common.css">
<script type="text/javascript">
	function delUrl() {
		var Del = confirm("삭제 하시겠습니까?")
		if (Del == true) {
			alert("삭제 되었습니다.")
			location.href = "remove?projectno=${Project.projectno }"
		} else {
			alert("취소 되었습니다.")
		}
	}
</script>
<style type="text/css">
table, td {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	padding: 10px;
}

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
	padding-top: 20px;
	text-align: center;
}

table {
	width: 800px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
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

table {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<header>
		<h1>SPMS(Simple Project Management System)</h1>
	</header>
	<section>
		<table>
			<tr>
				<td>프로젝트 이름</td>
				<td>${Project.projectname }</td>
			</tr>
			<tr>
				<td>프로젝트 내용</td>
				<td>${Project.projectcontent }</td>
			</tr>
			<tr>
				<td>시작날짜</td>
				<td><fmt:formatDate value="${Project.regdate}"
						pattern="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<td>종료날짜</td>
				<td><fmt:formatDate value="${Project.enddate }"
						pattern="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<td>상태</td>
				<td>${Project.nowproject }</td>
			</tr>
			<tr>
				<td colspan="2"><a href="listAll">돌아가기</a> <a
					href="modify?projectno=${Project.projectno }">
						<button>수정</button>
				</a>
					<button onclick="delUrl()">삭제</button></td>
			</tr>
		</table>
	</section>
	<footer>
		<h1>SPMS@2016</h1>
	</footer>
</body>
</html>