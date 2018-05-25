<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<section>
		작업이 완료 되었습니다. <br> <a href="listAll">목록보기</a>
	</section>
	<footer>
		<h1>SPMS@2016</h1>
	</footer>
</body>
</html>