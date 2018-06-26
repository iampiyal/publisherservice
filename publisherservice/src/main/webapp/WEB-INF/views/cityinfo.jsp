
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<body>
	<div class="container">
		<h1>All Cities</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>CITY NAME</th>
					<th>DESTINY</th>
					<th>START_TIME</th>
					<th>END_TIME</th>
				</tr>
			</thead>
			<c:forEach var="city" items="${cities}">
				<tr>
					<td>${city.cityName}</td>
					<td>${city.destiny}</td>
					<td>${city.startTime}</td>
					<td>${city.endTime}</td>
				</tr>
				<c:set var="chosencity" value="${city.cityName}" scope="page" />
			</c:forEach>
			<tr>
				<td><spring:url value="http://localhost:8090/cities/${chosencity}"
						var="distanceurl" />
					<button class="btn btn-info"
						onclick="location.href='${distanceurl}'">Get Shortest
						Distance</button></td>
			</tr>
		</table>
	</div>
</body>
</html>