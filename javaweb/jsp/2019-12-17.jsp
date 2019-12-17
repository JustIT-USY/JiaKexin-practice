<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashSet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	HashSet<String> names=new HashSet<String>();
	names.add("Tom");
	names.add("Mike");
	names.add("Linda");
%>

<table border="1" >
	<tr>
		<td>序号</td>
		<td>索引</td>
		<td>是否是第一个元素</td>
		<td>是否是最后一个元素</td>
		<td>元素的值</tr>
	<tr>

	<c:forEach var="name" items="<%=names %>" varStatus="statue">
		<tr>
			<td>${statue.count}</td>
			<td>${statue.index}</td>
			<td>${statue.first}</td>
			<td>${statue.last}</td>
			<td>
				<span style='background-color: ${statue.count%2 == 0?"red":"green"}'>
					<c:out value="${name}"/>
				</span>
			</td>
		
	</c:forEach>

</table>


<c:out value="<"/>
${"<"}
${'<'}
<%="<" %>
<c:out value="${'<'}"/>
