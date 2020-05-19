<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>

<!-- IE 지원  -->
<script src="https://cdn.jsdelivr.net/npm/es6-promise@4/dist/es6-promise.min.js"></script> 
<script src="https://cdn.jsdelivr.net/npm/es6-promise@4/dist/es6-promise.auto.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

<link href="${pageContext.request.contextPath}/resources/css/common.css" rel="stylesheet">
</head>

<body>

<form id="formSearch" onsubmit="return onSubmit(event)">
	<select name="searchType">
		<option value="name">이름</option>
		<option value="info">정보</option>
	</select>
	<input type="text" name="searchText">
	<button type="submit">검색</button>
</form>


<table id="tblList" class="tbl-solid">
	<colgroup>
		<col width="10%">
		<col width="45%">
		<col width="45%">
	</colgroup>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>정보</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>

<script>
function onSubmit(evt){
	
	list();
	
	return false;
}

function list(){
	axios.defaults.baseURL = '${pageContext.request.contextPath}';

	var searchType = document.querySelector("select[name=searchType]").value;
	var searchText = document.querySelector("input[name=searchText]").value;

 	axios.get( '/entertainers/type/' + searchType + (searchText ? '/text/' + searchText : '') )
		.then(function (response) {
		    console.log(response);
		    draw(response.data);

		})
		.catch(function (error) {
		    console.log(error);
		})
		.then(function () {
		    // always executed
		});
} 

function draw(entList){
	var tbody = document.querySelector("#tblList tbody");

	tbody.innerHTML = "";

	for(var i = 0; i < entList.length; i++){
		var newRow   = tbody.insertRow();

		newRow.insertCell(0).appendChild(document.createTextNode(entList[i].seq));
		newRow.insertCell(1).appendChild(document.createTextNode(entList[i].entName));
		newRow.insertCell(2).appendChild(document.createTextNode(entList[i].entInfo));
	}
}

function ready(callback){
    // in case the document is already rendered
    if (document.readyState!='loading') callback();
    // modern browsers
    else if (document.addEventListener) document.addEventListener('DOMContentLoaded', callback);
    // IE <= 8
    else document.attachEvent('onreadystatechange', function(){
        if (document.readyState=='complete') callback();
    });
}

ready(function(){
	list();
});
</script>
</body>

</html>