<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<body>  
<a href="hello">Click here...</a>  
</body>  
</html> 


web.xml

<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
	<display-name>Archetype Created Web Application</display-name>
	<servlet>
		<servlet-name>spring6</servlet-name>
		<servlet-class>
			org.springframework.web.servlet.DispatcherServlet
		</servlet-class>
	</servlet>

<servlet-mapping>
<servlet-name>spring6</servlet-name>
		<url-pattern>/</url-pattern>
</servlet-mapping>
</web-app>


