<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a {
		text-decoration: none;
		cursor: pointer;
	}
</style>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h3>user list！！</h3>
	
	<a href="index.jsp">继续注册</a>
	
	<table class="table">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>birthday</td>
			<td>money</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.name}</td>
				<td>${u.birthday}</td>
				<td>${u.money}</td>
				<td>
					<a href="User_delete?id=${u.id }">删除</a>
					|
					<a href="User_updateUI?id=${u.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<c:if test="${page.p != 1 }">
					<a href="User_find?p=1">首页</a>
				</c:if>
				<a href="User_find?p=${page.prev }">上一页</a>
				
				<c:forEach begin="${page.startPage }" end="${page.endPage }" var="x">
					<c:if test="${page.p == x }">
						<font color="red">
							${x }
						</font>
					</c:if>
					<c:if test="${page.p != x }">
						<a href="User_find?p=${x }">
							${x }
						</a>
					</c:if>
				</c:forEach>
				
				
				<a href="User_find?p=${page.next }">下一页</a>
				<c:if test="${page.p != page.maxPage }">
					<a href="User_find?p=${page.maxPage }">末页</a>
				</c:if>
				
				<font color="red" size="5">
					${page.p }
				</font>
				/
				${page.maxPage }
				
				<form action="User_find" style="display: inline;">
				 	跳到第<input size="1" type="text" name="p" />页<button type="submit">GO</button>
				</form>
			</td>
		</tr>
	</table>

	
</body>
</html>