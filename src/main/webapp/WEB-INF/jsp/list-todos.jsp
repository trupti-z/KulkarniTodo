<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
	<div class="container">
		<table class="table table-striped">
			<caption>Your todos are</caption>
			<thead>
				<tr>
				
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it Done?</th>
					<th>Last updated(Dublin time)</th>
					
					
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate value="${todo.targetDate}"
								pattern="dd/MM/yyyy" /></td>
						<td>${todo.done ? 'Yes' : 'No' }</td>
						
						
						<td><fmt:formatDate value="${todo.lastUpdate}"
								pattern="dd/MM/yy HH:mm:ss" /></td>
										
						<td></td>
						<td><a type="button" style="background-color:blue;color:white;width:80px;height:34px;" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a type="button" style="background-color:red;color:white;width:80px;height:34px;" class="btn btn-warning"
							href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-todo">Add a Todo</a>
		</div>
	</div>
<%@include file="common/footer.jspf"%>