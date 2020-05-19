<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>

<!-- IE 지원  -->
<script src="https://cdn.jsdelivr.net/npm/es6-promise@4/dist/es6-promise.min.js"></script> 
<script src="https://cdn.jsdelivr.net/npm/es6-promise@4/dist/es6-promise.auto.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>

<body>

<form method="post" action="${pageContext.request.contextPath}/board/list" onsubmit="javascript:return verifyUser()">
	<input type="text" name="userId">
	<input type="password" name="userPw">
	<button type="submit">제출</button>
</form>


<script>
function verifyUser(){
	
	axios.defaults.baseURL = '${pageContext.request.contextPath}';
	 
	axios.get('/user/verify?userId=tim')
	  .then(function (response) {
	    // handle success
	    console.log(response);
	  })
	  .catch(function (error) {
	    // handle error
	    console.log(error);
	  })
	  .then(function () {
		    console.log("finally");
	  });
 
	// Optionally the request above could also be done as
	
	axios.get('/user/test', {
	    params: {
	    	"userId": "tim"
	    }
	  })
	  .then(function (response) {
	    console.log(response);
	  })
	  .catch(function (error) {
	    console.log(error);
	  })
	  .then(function () {
	    // always executed
	    console.log("finally");
	  });
 
	return false;
}
</script>
</body>

</html>