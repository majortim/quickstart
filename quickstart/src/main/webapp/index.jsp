<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>

<body>

<form method="post" action="${pageContext.request.contextPath}/board/list" onsubmit="verifyUser()">
	<input type="text" name="userId">
	<input type="password" name="userPw">
</form>


<script>
function verifyUser(){
	
}
</script>
</body>

</html>