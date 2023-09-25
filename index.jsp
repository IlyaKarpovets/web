<%@page contentType="text/html" pageEncoding="cp1251"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
 <table>
  <thead>
   <tr>
    <th>Fio</th>
    <th>Address</th>
   </tr>
  </thead>
  <tbody>
   <c:forEach var="entity" items="${entityList}">
    <tr>
     <td>"${entity.id} /></td>
     <td>${entity.fio} /></td>
     <td>${entity.address} /></td>
    </tr>
   </c:forEach>
  </tbody>
 </table>
</body>
</html>