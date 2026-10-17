<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Catálogo</title>
</head>
<body>
    <h1>Catálogo de cursos</h1>

    <c:choose>
        <c:when test="${empty courses}">
            <p>No hay cursos disponibles.</p>
        </c:when>
        <c:otherwise>
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Participantes</th>
                        <th>Plazas</th>
                        <th>Modulos</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${course}" var="curso" varStatus="status">
                        <tr>
                            <td>${status.count}</td>
                            <td><c:out value="${curso.id}"/></td>
                            <td><c:out value="${curso.nombre}"/></td>
                            <td><c:out value="${curso.participantes}"/></td>
                            <td><c:out value="${curso.plazas}"/></td>
                            <td><c:out value="${curso.modulos}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</body>
</html>