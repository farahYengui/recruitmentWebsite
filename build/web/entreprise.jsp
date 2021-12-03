<%-- 
    Document   : entreprise
    Created on : Dec 3, 2021, 5:59:39 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>compte entreprise</title>
         <link rel="stylesheet" href="navbar.css">
         <link rel="stylesheet" href="entreprise.css">
        <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>
        <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
        <link href='https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap' rel='stylesheet'>
  
    </head>
    <body>
      <nav>
        <ul>
          <div><a class="logo" href="#">Carriere</a>
            <p>Mettons-nous au travail</p>
          </div>
          <li><a href="javascript:disconnect();">Déconnexion</a></li>
          <li><a href="entreprise.jsp">candidats</a></li>
          <li><a href="intranetEnt.jsp">Compte</a></li>
        </ul>
      </nav>
      <div class="nav-margin"></div>
        
  <div class="container">
            <div class="entreprise">
            <h1>Poste </h1>
            <div class="listeCan">
                
                <ul style="display: flex; justify-content:space-around;">
                    <li>candidat1</li>
                    
                    <li style=" position: relative; bottom: 15px;" > <img src="images/location.png" alt=""class="local" > Adresse </li>
                    <li><a class="cv" href="#">Télécharger CV</a> </li>
                </ul>
                
            </div>
            
           
            </div>
             
            
         </div>
    



 



<script src="disconnect.js"></script>
        
       
    
    </body>
</html>   
