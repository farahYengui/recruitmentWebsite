<%-- 
    Document   : intranetEnt
    Created on : Dec 3, 2021, 6:01:58 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>
  <link rel="stylesheet" href="navbar.css">
  <link rel="stylesheet" href="intranetEnt.css">
  <link href='https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap' rel='stylesheet'>
  <title>Compte de l'entreprise</title>
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>

<body>
  <nav>
    <ul>
      <div><a class="logo" href="#">Carriere</a>
        <p>Mettons-nous au travail</p>
      </div>
      <li><a href="javascript:disconnect();">Déconnexion</a></li>
      <li><a href="entreprise.jsp">Candidats</a></li>
      <li><a href="intranetEnt.jsp">Compte</a></li>
    </ul>
  </nav>
  <div class="nav-margin"></div> 

  <div class="wrapper">
    <div class="left">
      <img src="images/account.png" alt="user" width="128">
     
      <h4>${name}</h4>
      <h4> ${domain}</h4>
      <h4> ${adress}</h4>
    
    </div>
    <div class="right">
      <div class="info">
        <h3>Information</h3>
        <div class="info_data">
          <div class="data">
            <h4> &nbsp; &nbsp;Nom </h4>
            <form>
              <div class=" input ">
                

                <input class="myInput" type="text" name="name" placeholder="Nom" disabled="disabled" value= "${name}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Local </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="adress" placeholder="Local" disabled="disabled" value= "${adress}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Domaine </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="domain" placeholder="Domaine" disabled="disabled" value= "${domain}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Description </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="description" placeholder="Description" disabled="disabled" value= "${description}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Numéro </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="phone" placeholder="numéro" disabled="disabled" value= "${phone}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Email </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="email" name="email" placeholder="Email" disabled="disabled" value= "${email}">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>









        </div>
      </div>

      <div class="projects">
        <h3>Postes disponibles</h3>
        <div class="projects_data">
          <div class="dat">
<% 
  try
       {

     Class.forName("com.mysql.jdbc.Driver");// charger le driver

     Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/recruitment_db", "root", "");

/***************************/
PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT post from poste");


ResultSet rs= pstmt.executeQuery(); // retourne une table rs

while(rs.next()){
    %>
  <h4> <% rs.getString("post") ; %></h4> <a href="#"><img src="images/remove.png"> </a>
  <% }
       }catch(Exception exp)
       {
    

       }

%>
          
            

            <form action="PosteServlet" method="post" >
             
                 <input type="hidden" name="name" value="${name}">
                
              <input class="ajouter" type="text" name="post" placeholder="Ajouter poste">
            
            <button type="submit"> <img src="images/add.png"></button>
            </form>




          </div>
        </div>


      </div>
    </div>
<script src="disconnect.js"></script>
</body>

</html>
