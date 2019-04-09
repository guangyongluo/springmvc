<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Function Tag</title>
</head>
<body>
<c:set var="myString" value="Hello World"/>
${fn:contains(myString, "Hello")}<br>
${fn:contains("Stella Cadente", "Cadente" )}<br>
${fn:containsIgnoreCase("Stella Cadente", "CADENTE")}<br>
${fn:endsWith("Hello World", "World")}<br>
${fn:escapeXml("Use <br/> to change lines")}<br>
${fn:indexOf("Stella Cadente", "Cadente")}<br>
<c:set var="myArray" value='${["one","two","three"].stream().toArray()}' />
${fn:join(myArray, ",")}<br>
${fn:length("Stella Cadente")}<br>
${fn:replace("Stella Cadente", "e" , "E")}<br>
<c:set var="split" value='${fn:split("my, world", ",")}'/>
<table>
    <c:forEach var="substring" items="${split}">
    <tr><td>${substring}</td></tr>
    </c:forEach>
</table>
${fn:startsWith("Stella Cadente", "St")}<br>
${fn:substring("Stella Cadente", 0, 4)}<br>
${fn:substringAfter("Stella Cadente", "e")}<br>
${fn:substringBefore("Stella Cadente", "e")}<br>
${fn:toLowerCase("Stella Cadente")}<br>
${fn:toUpperCase("Stella Cadente")}<br>
${fn:trim("       Stella Cadente        ")}<br>
</body>
</html>
