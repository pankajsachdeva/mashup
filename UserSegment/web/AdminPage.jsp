<%-- 
    Document   : AdminPage.jsp
    Created on : 28 Mar, 2015, 1:42:47 PM
    Author     : pankaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.GetData.DBGet" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h4>
            Details of the users in city <%= request.getParameter("CityBox")%>
        </h4>
            <%
            //String city= request.getParameter("CityBox");
            DBGet obj=new DBGet();
            String lat=request.getParameter("latitudeField");
            String lon=request.getParameter("longitudeField");
            String radius=request.getParameter("radiusField");           
            ResultSet resultSet=obj.getDB(Double.parseDouble(lat),Double.parseDouble(lon),Integer.parseInt(radius));
            
            %>
            
             <TABLE BORDER="1">
            <TR>
                <TH>User Id</TH>
                <TH></TH>
                
            </TR>
            <% while(resultSet.next()){ %>
            <TR>
                <TD> <%= resultSet.getString(1) %></td>
                
            </TR>
            <% } %>
        </TABLE>
    </body>
</html>
