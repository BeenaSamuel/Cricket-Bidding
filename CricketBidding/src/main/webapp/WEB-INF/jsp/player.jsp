<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bid Players</title>
</head>
<body>
  <h1>Bid player</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Player Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>  
         
     
           <tr>    
    <td>CSK:</td>    
    <td><form:input path="csk" type="number" /></td>  
</tr>       
  
  
       
<tr>    
        
         <tr>         
         <td>DC:</td>    
    <td><form:input path="dc" type="number" /></td>  
</tr>       
  <tr>    
        
         <tr>         
         <td>RCB:</td>    
    <td><form:input path="rcb" type="number" /></td>  
</tr> 
 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Bid" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>