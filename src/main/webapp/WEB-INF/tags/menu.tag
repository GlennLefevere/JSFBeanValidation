<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<nav>
	<ul>
		<li><a href="<c:url value='/'/>">Home</a></li>
		<li><a href="<c:url value='/employees/employees'/>">Employees</a></li>
		<li><a href="<c:url value='/bedrijven/bedrijven'/>">bedrijven</a></li>
		<c:url value='' var='nederlandsURL'>
			<c:param name='locale' value='nl_be' />
		</c:url>
		<li><a href='${nederlandsURL}'>Nederlands</a></li>
		<c:url value='' var='engelsURL'>
			<c:param name='locale' value='en_us' />
		</c:url>
		<li><a href='${engelsURL}'>Engels</a></li>
	</ul>
</nav>
