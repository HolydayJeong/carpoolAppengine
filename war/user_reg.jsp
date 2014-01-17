<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreService" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<%@ page import="com.google.appengine.api.datastore.Query" %>
<%@ page import="com.google.appengine.api.datastore.FetchOptions" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.PersistenceManagerFactory" %>

<%@ page import="test.PMF" %>
<%@ page import="test.User" %>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	String id = request.getParameter("id");
	String stu_num = request.getParameter("stu_num");
	String list = request.getParameter("list");
	
	out.println(list);
	

//	pm.close();
	//Query query = new Query("select * from User where id ="+id+" and stu_num="+stu_num);
	//List<User> users = (List<User>).execute(query);

	//out.println(query);
//	out.println("success");
%>
