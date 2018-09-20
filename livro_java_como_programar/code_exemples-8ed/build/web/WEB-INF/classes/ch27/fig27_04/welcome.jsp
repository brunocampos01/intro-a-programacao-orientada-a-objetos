<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.4: welcome.jsp -->
<!-- JSP que processa uma solicita��o "get" contendo dados. -->

<html xmlns = "http://www.w3.org/1999/xhtml">

   <!-- se��o de cabe�alho do documento -->
   <head>
      <title>Processing "get" requests with data</title>
   </head>

   <!-- se��o de corpo do documento -->
   <body>
      <% // inicia scriptlet                                   
                                                              
         String name = request.getParameter( "firstName" );   
                                                              
         if ( name != null )                                  
         {                                                    
      %> <%-- fim de scriptlet para inserir de dados de template fixa --%> 

            <h1>
               Hello <%= name %>, <br />
               Welcome to JavaServer Pages!
            </h1>

      <% // continua scriptlet                                
                                                              
         } // fim do if
         else {                                               
                                                              
      %> <%-- fim de scriptlet para inserir de dados de template fixa --%> 

            <form action = "welcome.jsp" method = "get">
               <p>Type your first name and press Submit</p>
      
               <p><input type = "text" name = "firstName" />
                  <input type = "submit" value = "Submit" />
               </p>
            </form>

      <% // continua scriptlet                                
                                
         } // fim de else
                                
      %> <%-- fim de scriptlet --%>
   </body>

</html>  <!-- fim do documento de XHTML -->

<!--
/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
-->