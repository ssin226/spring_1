<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel = "stylesheet" href = "./resources/css/home.css">
</head>
<body>
<h1>
	Hello world! Spring
</h1>

<img src = "./etc/images/Penguins.jpg">

<P>  The time on the server is ${serverTime}. </P>

<a href = "./notice/noticeList?name=notice">Go Notice</a>
<a href = "./qna/qnaList">Go Qna</a>

<h3>Master</h3>
<h3>GITHUB</h3>
</body>
</html>
