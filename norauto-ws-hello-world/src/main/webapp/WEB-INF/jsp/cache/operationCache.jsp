<%@ page trimDirectiveWhitespaces="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<fmt:setLocale value="fr_FR" scope="session" />
<html>
<head>
	<c:set var="metaRobots">noindex</c:set>
	<c:if test="${!empty metaRobotsOverride}">
		<c:set var="metaRobots">${metaRobotsOverride}</c:set>	
	</c:if>
	<c:if test="${!empty metaRobots}">
		<meta name="robots" content="${metaRobots}">
	</c:if>
</head>
<body>
	<center>
		<h1>opérations sur les caches du contexte norauto WebService</h1>
		<table style="text-align: center;" border="1">
			<thead>
				<tr>
					<th colspan="4">OPERATIONS GLOBALES</th>
				</tr>
			</thead>
			<tr>
				<th colspan="2">NOM DU CACHE</th>
				<th>FLUSH</th>
				<th>FORCED FLUSH</th>
			</tr>
			<tr>
				<td align="left" colspan="2">TOUS LES CACHES norauto</td>
				<td><a href="operationCache.html?phrase=${phrase}&cacheAction=flush" target="blank">GO ALL</a></td>
				<td><a href="operationCache.html?phrase=${phrase}&cacheAction=forcedFlush" target="blank">GO ALL !</a></td>
			</tr>
			<thead>
				<tr>
					<th colspan="4">OPERATIONS PAR CACHE</th>
				</tr>
			</thead>
			<tr>
				<th>NOM DU CACHE</th>
				<th>DATE DERNIER FLUSH</th>
				<th>FLUSH</th>
				<th>FORCED FLUSH</th>
			</tr>
			<c:forEach items="${cachedServices}" var="cachedService">
				<tr>
					<td align="left">${cachedService.name}</td>
					<td><fmt:formatDate value="${cachedService.lastFlush}" type="both"/></td>
					<td><a href="operationCache.html?phrase=${phrase}&cacheAction=flush&cacheName=${cachedService.name}" target="blank">GO</a></td>
					<td><a href="operationCache.html?phrase=${phrase}&cacheAction=forcedFlush&cacheName=${cachedService.name}" target="blank">GO !</a></td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<br/>
	</center>
</body>
</html>