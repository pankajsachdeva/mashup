<%-- 
    Document   : index
    Created on : 28 Mar, 2015, 1:14:35 PM
    Author     : pankaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Welcome Admin</h1>
        <form action="AdminPage.jsp" metho="GET">
        <p> Enter city name 
        <input type="text" name="CityBox" value="" /></p>
        <p>Enter the latitude
        <input type="text" name="latitudeField" value="" /></p>
        <p>Enter the longitude
        <input type="text" name="longitudeField" value="" /></p>
        <p>Enter the radius
        <input type="text" name="radiusField" value="" /></p>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>
