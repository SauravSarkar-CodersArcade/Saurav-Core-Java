<html>
   <head>
      <title>Setting HTTP Status Code</title>
   </head>
   
   <body>
   <%  
         response.sendError(415, "The server will not accept the request, because the media type is not supported.!!!" );
      %>
      
   </body>
</html>