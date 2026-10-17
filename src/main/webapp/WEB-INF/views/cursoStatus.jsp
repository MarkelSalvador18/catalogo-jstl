<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <title>Estado del curso</title>
</head>

<body>
    <h1>
        <c:out value="${courseName}" />
    </h1>

    <c:if test="${plazas > 0}">
        <p class="available">Plazas disponibles: ${plazas}</p>
    </c:if>

    <c:if test="${plazas == 0}">
        <p class="not-available">No quedan plazas disponibles.</p>
    </c:if>

</body>
</html>