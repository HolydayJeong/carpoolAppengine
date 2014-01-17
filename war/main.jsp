<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	DecimalFormat df = new DecimalFormat("00");
	Calendar calendar = Calendar.getInstance();
	//Date date = new Date();
	String hour;
	if( calendar.get(Calendar.AM_PM) == Calendar.PM){
      hour = df.format(calendar.get(Calendar.HOUR)+12); //Calendar.PM이면 12를 더한다
   	} else {
      hour = df.format(calendar.get(Calendar.HOUR));
   	}
	
	String minute = df.format(calendar.get(Calendar.MINUTE));
	String second = df.format(calendar.get(Calendar.SECOND));
			
	String date = hour+minute+second;
	int i = 2;
	String test =  "test"+i ;
%>
<%=date%><br><
	<Form name="gotest" method="post" action="http://3-dot-handong-project-in-13.appspot.com/user_reg">
		<input type="hidden" name="id" value= "<%=date%>+1"/>
		<input type="hidden" name="name" value= "<%=date%>"/>
		<input type="hidden" name="stu_num" value= "<%=i%>"/>
		<input type="hidden" name="pw" value= "<%=date%>"/>
		<input type="hidden" name="phNum" value= "<%=i%>"/>
		<input type="submit"/>
	</Form>
	
</body>
</html>