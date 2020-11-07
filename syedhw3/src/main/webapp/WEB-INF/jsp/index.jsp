<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>

</head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<h2>Events Information</h2>

<table class="w3-table-all">
    <tr class="w3-blue">
        <th>Description</th>
        <th>Start Date</th>
        <th>End Date</th>
    </tr>
    <c:forEach var = "Events" items = "${Eventslist}">
        <tr>
            <td>${Events.getDescription()}</td>
             <td>${Events.getStartDate()}</td>
              <td>${Events.getEndDate()}</td>


        </tr>
    </c:forEach>

</table>



</body>
</html>