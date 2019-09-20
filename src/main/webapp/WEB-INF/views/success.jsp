<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Following Details Are Submitted</h3>
	<hr>
		<pre>
		RollNo	${student.rno}
		SName	${student.sname}
		Address	${student.address}
		EmailId	${student.email}
		Marks	${student.marks}
		</pre>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>