<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Players</title>
</head>
<body>
<h1>Players List</h1>  
 <table border="2" width="70%" cellpadding="2">  
 <tr>    
          
  
<tr><th>Id</th><th>Player Name</th><th>Team name</th><th>Amount bid</th><th>Bid time</th></tr>  
   <c:forEach var="pu" items="${list}">   
   <tr>  
   <td>${pu.id}</td>  
   <td>${pu.name}</td>
   <td>${pu.teamname}</td>  
   <td>${pu.bidamount}</td> 
   <td>${pu.bidtime}</td>
    </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="player">Bid Player</a>  

</body>
</html>