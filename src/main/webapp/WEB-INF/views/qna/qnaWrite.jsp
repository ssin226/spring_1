<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Qna Write Form</h1>
	
	<form action="./qnaWrite" method="post">
		<input type = "text" name = "title">
		<input type = "text" name = "writer">
		<input type = "text" name = "age">
		<p>
			<input type = "checkbox" name = "name" value = "ssin">
			<input type = "checkbox" name = "name" value = "hyun">
			<input type = "checkbox" name = "name" value = "min">
		</p>
		<button>CLICK</button>
	</form>

	<a href= "./qnaList">Qna List</a>
	<a href = "../">Home</a>

</body>
</html>