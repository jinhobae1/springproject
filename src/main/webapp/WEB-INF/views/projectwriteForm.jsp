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
	padding-top: 20px;
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

#border {
	border-right: hidden;
	border-left: hidden;
	border-bottom: hidden;
}

.btn {
	margin: 5px;
	padding: 10px;
}
</style>
</head>
<body>
	<header>
		<h1>SPMS(Simple Project Management System)</h1>
	</header>
	<section>
		<form action="register" method="post">
			<table>

				<tr>
					<td><label>프로젝트 이름</label></td>
					<td><input type="text" name="projectname"></td>

				</tr>
				<tr>

					<td><label>프로젝트 내용</label></td>
					<td><textarea rows="50" cols="30" name="projectcontent">${readproject.projectcontent }</textarea></td>

				</tr>
				<tr>

					<td><label>시작날짜</label></td>
					<td><input type="date" name="regdat"></td>

				</tr>
				<tr>

					<td><label>마지막 날짜</label></td>
					<td><input type="date" name="enddat"></td>

				</tr>
				<tr>

					<td><label>상태</label></td>
					<td><select name="nowproject">
							<option value="준비">준비
							<option value="진행중">진행중
							<option value="종료">종료
							<option value="보류">보류
					</select></td>

				</tr>
				<tr>
					<td id="border"></td>
					<td id="border"><input type="submit" value="저장" class="btn">
						<a href="listAll"><input type="button" value="취소" class="btn"></a>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<footer>
		<h1>SPMS@2016</h1>
	</footer>
</body>
</html>