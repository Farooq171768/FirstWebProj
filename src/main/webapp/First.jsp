<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My First JSP page</title>
</head>
<body style="background-color:#e2e2e2">
	<h1 style='color:Green'>First JSP page</h1>
	<!-- Declaration Tag -->
	<%!
	int a=50;
	int b=30;
	String name="Farooq";
	public int doSum(){
		return a+b;
	}
	public String reverse(){
		StringBuffer sb=new StringBuffer(name);
		return sb.reverse().toString();
	}
	%>
	<!-- Scriptlet Tag -->
	<%
		out.println("Value of a is: " +a);
		out.println("<br>");
		out.println("Value of a is: " +b);
		out.println("<br><br>");
		out.println("Sum of "+a+" and "+b+" is:"+doSum());
		out.println("<br><br>");
		out.println("Reversed string: "+reverse());
		
	%>
	
	<!-- Expression Tag -->
	<h1>Sum is:<%= doSum() %></h1>
	<h1 style='color:red'> <%=doSum() %></h1>
	
</body>
</html>