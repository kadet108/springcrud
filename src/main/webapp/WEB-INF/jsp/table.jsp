<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="java.util.List" %>

<script type="text/javascript" src="js/crud.js"></script>

<html>
    <body>
        <div id="content">


		<c:set var="peopleSize" value="<%=((List)request.getAttribute("people")).size() %>"/>

			<table id="rounded-corner" class="tablesorter">
				<thead>
					<tr>
						<th scope="col" class="rounded-company">ID</th>
						<th scope="col">IMIE</th>
						<th scope="col">NAZWISKO</th>
						<th scope="col" class="rounded-q4">WIEK</th>
					</tr>
				</thead>
				<c:forEach items="${people}" var="person" varStatus="rowCounter">
					<c:choose>
			          <c:when test="${rowCounter.count < peopleSize}">
					      <tr>
					      	<td>${person.id}</td>
					      	<td>${person.name}</td>
					      	<td>${person.surname}</td>
					      	<td>${person.age}</td>
					      </tr> 
			          </c:when>
			          <c:otherwise>
						<tfoot>
					      <tr>
					      	<td class="rounded-foot-left">${person.id}</td>
					      	<td>${person.name}</td>
					      	<td>${person.surname}</td>
					      	<td class="rounded-foot-right">${person.age}</td>
					      </tr> 
					    </tfoot>
			          </c:otherwise>
			        </c:choose>
			    </c:forEach>
			</table>
			
			<form action="addNewPerson">
				<div style="float:left">
					<div>IMIE</div>
					<div><input type="text" name="name"></div>
				</div>
				<div style="float:left">
					<div>NAZWISKO</div>
					<div><input type="text" name="surname"></div>
				</div>
				<div style="float:left">
					<div>WIEK</div>
					<div><input type="text" name="age"></div>
				</div>
				<div style="float:left">
					<div>&nbsp;</div>
					<div><input type="submit" name="submit" value="+"></div>
				</div>
			</form>
        </div>

	    <script language="javascript">
		    $(document).ready(function() 
		    	    { 
		    	        $("#rounded-corner").tablesorter(); 
		    	    } 
		    	); 
	    </script>
    
    </body>
    
    
</html>