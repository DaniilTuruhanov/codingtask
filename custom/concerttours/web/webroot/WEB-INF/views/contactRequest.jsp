<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Contact Request</title></head>
<body>
<form method="post">
    <input type="text" name="newSender" value="${contactRequest.sender}"/>
    <br/>
    <textarea name="newMessage">${contactRequest.message}</textarea>
    <br/>
    <input type="submit" value="Send"/>
    <c:if test="${not empty contactRequest}">
        <p>${contactRequest.sender}</p>
        <p>${contactRequest.message}</p>
    </c:if>
</form>
</body>
</html>
