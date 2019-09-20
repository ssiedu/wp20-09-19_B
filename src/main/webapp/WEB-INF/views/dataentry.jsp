<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<html>
<body>
	<h3>Student Entry Form</h3>
	<hr>
	<form:form action="savestudent" modelAttribute="student">
		<pre>
		RollNo	<form:input path="rno"/>	<form:errors path="rno"/>
		SName	<form:input path="sname"/>	<form:errors path="sname"/>
		Address	<form:input path="address"/><form:errors path="address"/>
		EmailId	<form:input path="email"/>  <form:errors path="email"/>
		Marks .	<form:input path="marks"/>	<form:errors path="marks"/>
			<input type="submit" value="Save"/>
		</pre>
	
	</form:form>
	<hr>
	
</body>
</html>