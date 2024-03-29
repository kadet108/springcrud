<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<link rel="stylesheet" type="text/css" href="css/table.css" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script> 
<script type="text/javascript" src="js/jquery.tablesorter.min.js"></script> 


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    
    <title><decorator:title default="Hello World"/></title>
    <decorator:head/>
</head>
<body>

<div id="container">

<!--     <div id="header"> -->
<!--         <h1> This is common header! </h1> -->
<!--     </div> -->
    <div id="content">
        <decorator:body/>
    </div>

    <div id="footer">
    </div>
</div>


</body>
</html>