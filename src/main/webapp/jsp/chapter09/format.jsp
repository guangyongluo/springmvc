<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Format Tag</title>
</head>
<body>
formatNumber Tag: <br>
<fmt:formatNumber value="12" type="number"/><br>
<fmt:formatNumber value="12" type="number" minIntegerDigits="3"/><br>
<fmt:formatNumber value="12" type="number" minFractionDigits="2"/><br>
<fmt:formatNumber value="123456.78" pattern=".000"/><br>
<fmt:formatNumber value="123456.78" pattern="#,###.##"/><br>
<fmt:formatNumber value="12" type="currency" /><br>
<fmt:formatNumber value="12" type="currency" currencyCode="CNY"/><br>
<fmt:formatNumber value="12.34" type="currency" currencyCode="CNY" currencySymbol="￥"/><br>
<fmt:formatNumber value="0.12" type="percent"/><br>
<fmt:formatNumber value="0.125" type="percent" minFractionDigits="3"/><br>
formatDate Tag: <br>
Default: <fmt:formatDate value="${now}"/><br>
Short: <fmt:formatDate value="${now}" dateStyle="short"/><br>
Medium: <fmt:formatDate value="${now}" dateStyle="medium"/><br>
Long: <fmt:formatDate value="${now}" dateStyle="long"/><br>
Full: <fmt:formatDate value="${now}" dateStyle="full"/><br>

Default time: <fmt:formatDate type="time" value="${now}"/><br>
Short time: <fmt:formatDate type="time" value="${now}" dateStyle="short"/><br>
Medium time: <fmt:formatDate type="time" value="${now}" dateStyle="medium"/><br>
Long time: <fmt:formatDate type="time" value="${now}" dateStyle="long"/><br>
Full time: <fmt:formatDate type="time" value="${now}" dateStyle="full"/><br>

Default both: <fmt:formatDate type="both" value="${now}"/><br>
Short both: <fmt:formatDate type="both" value="${now}" dateStyle="short"/><br>
Medium both: <fmt:formatDate type="both" value="${now}" dateStyle="medium"/><br>
Long both: <fmt:formatDate type="both" value="${now}" dateStyle="long"/><br>
Full both: <fmt:formatDate type="both" value="${now}" dateStyle="full"/><br>

Time Zone CT: <fmt:formatDate type="time" value="${now}" timeZone="CT"/><br>
Time Zone HST: <fmt:formatDate type="time" value="${now}" timeZone="HST"/><br>
Time Zone UTC: <fmt:formatDate type="time" value="${now}" timeZone="UTC"/><br>

<fmt:formatDate value="${now}" type="both" pattern="dd.MM.yy"/><br>
<fmt:formatDate value="${now}" type="both" pattern="dd.MM.yyyy"/><br>

<fmt:timeZone value="GMT">
    <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>
</fmt:timeZone>

<fmt:timeZone value="HST">
    <fmt:formatDate value="${now}" type="both" timeStyle="full"/><br>
</fmt:timeZone>

<fmt:timeZone value="CST">
    <fmt:formatDate value="${now}" type="both" dateStyle="full"/><br>
</fmt:timeZone>
</body>
</html>
