<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
 
 
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
