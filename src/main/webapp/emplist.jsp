<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20 
							<br />
							安全退出
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>ID</td>
							<td>Name</td>
							<td>Salary</td>
							<td>Age</td>
							<td>Operation</td>
						</tr>
						<c:forEach var="e" items="${sessionScope.list}">
						<tr class="row1">
							<td><c:out value="${e.id}"/></td>
							<td><c:out value="${e.username}"/></td>
							<td><c:out value="${e.salary}"/></td>
							<td><c:out value="${e.age}"/></td>
							<td>
								<a href="${pageContext.request.contextPath}/emp/remove?id=<c:out value="${e.id}"/>">delete emp</a>&nbsp;
								<a href="${pageContext.request.contextPath}/emp/selectById?id=<c:out value="${e.id}"/>">update emp</a>
							</td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/addEmp.jsp'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
