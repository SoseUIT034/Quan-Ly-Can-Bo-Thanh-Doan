<!DOCTYPE html>
 <%@page import="javax.jws.WebParam.Mode"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html lang="en">
<head>
<!-- <c:url value="/resources/lylich_canbo/css/bootstrap.min.css"/> -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lylich_canbo/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lylich_canbo/css/bootstrap-theme.min.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lylich_canbo/css/jquery-ui.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lylich_canbo/css/MyStyle.css"/>">



<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!-- <link rel="stylesheet" type="text/css" href="../../resources/lylich_canbo/css/bootstrap.min.css"> -->
<!-- <link rel="stylesheet" type="text/css" href="../../resources/lylich_canbo/css/jquery-ui.css"> -->
<!-- <link rel="stylesheet" type="text/css" href="../../resources/lylich_canbo/css/MyStyle.css"> -->

<!-- <script src="../../resources/lylich_canbo/js/jquery-1.12.2.js"></script> --> 
<!-- <script src="../../resources/lylich_canbo/js/bootstrap.min.js"></script> -->
<!-- <script src="../../resources/lylich_canbo/js/jquery-ui.js"></script> -->
<!-- <script src="../../resources/lylich_canbo/js/myjs.js"></script> -->

<title>Thông tin cán bộ</title>


</head>
<body ">

	<!---header--->
	<%@include file ="../layout/header.jsp" %>
	<!---header--->
	
	<sec:authorize access="hasAnyRole('Admin','Employee')">
	
	<div class="content container"  style="padding-top:30px; border: rebeccapurple; border-style: dotted; padding:50px">
 		 <a href="create">  Thêm mới</a>
 		 <table class="table table-hover table-striped">
 		 	<thead>
		 		 <tr>
		 			<th>STT</th>
		 		 	<th> Mã cán bộ </th>
		 		 	<th> Tên cán bộ </th>
		 		 	<th> Tên gọi khác </th>
		 		 	<th> Địa chỉ  </th>
		 		 	<th> Quê quán </th>
		 		 	<th> Ngày sinh</th>
		 		 	<th></th>
		 		 	<th></th>
		 		 	<th></th>
		 		 </tr>
	 		 </thead>
	 		 <tbody>
		 		 <c:forEach items="${listLylich}" var="item" varStatus="loop">
					<%-- option value=${item.maTrinhDoChuyenMon}>${item.tenTrinhDoChuyenMon}</option> --%>
					<tr>
						<td>${loop.index+1}</td>
			 		 	<td> ${item.canboByMaCanBo.maCanBo} </td>
			 		 	<td> ${item.tenCanBo} </td>
			 		 	<td> ${item.tenGoiKhac} </td>
			 		 	<td> ${item.hoKhauThuongTru} </td>
			 		 	<td> ${item.queQuan} </td>
			 		 	<td> ${item.ngaySinh} </td>
			 		 	<td><a href="detail/${item.canboByMaCanBo.maCanBo}">Chi tiết</a></td>
			 		 	<td><a href="edit/${item.canboByMaCanBo.maCanBo}">Sửa</a></td> 
			 		 	<td><a href="canbo/themchucvu/${item.canboByMaCanBo.maCanBo}">Thêm chức vụ</a></td>
		 		 	</tr>
				 </c:forEach>
	 		  </tbody>
 		 </table>
		
	</div>				
	
	</sec:authorize>
	<!---footer--->
	<%@include file="../layout/footer.jsp" %>
	<!---footer--->
<%-- <script src="<c:url value="/resources/lylich_canbo/js/jquery-2.2.2.js"/>"></script>
<script src="<c:url value="/resources/lylich_canbo/js/bootstrap.min.js"/>"></script> --%>
<script src="<c:url value="/resources/lylich_canbo/js/jquery-ui.js"/>"></script>
<script src="<c:url value="/resources/lylich_canbo/js/myjs.js"/>"></script>
<script src="<c:url value="/resources/lylich_canbo/js/create.js"/>"></script>
</body>
</html>