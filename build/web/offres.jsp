<%-- 
    Document   : offres.jsp
    Created on : Dec 6, 2021, 2:08:03 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="intranetCan.css" rel="stylesheet">
   
  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>      
  <link href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="navbar.css">
    </head>
    <body>
         <nav>
    <ul>
      <div><a class="logo" href="#">Carriere</a>
        <p>Mettons-nous au travail</p>
      </div>
      <li><a href="#connexion">Connexion</a></li>
      <li><a href="#offres">Offres</a></li>
    </ul>
  </nav>
  <div class="nav-margin"></div>
          <div class="grid" id="offres">
    <div class="recher">
      <div> <img src="images/portfolio.png" id="emploi"> Emploi recherché </div>
      <br>
      <form class="in-form">
        <div>
          <input id="inputCountry" type="text" name="regions" placeholder="Région">
        </div>
        <input type="submit" value="" class="envoyer">
      </form>
    </div>

    <div class="entrepriseContainer">
      <div class="wrapper">
        <div class="right">
          <div class="info">
            <div style="height:100px;"> </div>
            <h3>Nom de l'entreprise</h3>
            <div class="info_data">
              <div>
                <h4>Description</h4>
                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>
              </div>
              <div>
                <h4>Domaine</h4>
                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>
              </div>
              <div> <img src="images/location.png" alt="" class="local"> localisation &nbsp; &nbsp;
                <img src="images/user.png" alt="" class="local"> nombre de poste
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="wrapper">
        <div class="right">
          <div class="info">
            <h3>Nom de l'entreprise</h3>
            <div class="info_data">
              <div>
                <h4>Description</h4>
                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>
              </div>
              <div>
                <h4>Domaine</h4>
                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>
              </div>
              <div> <img src="images/location.png" alt="" class="local"> localisation &nbsp; &nbsp;
                <img src="images/user.png" alt="" class="local"> nombre de poste
              </div>
            </div>
          </div>
        </div>
      </div>

    </div>
  </div>
  <footer>
    Tous les droits sont réservés, 2021.
  </footer>
     <script src="search.js"></script>
    </body>
</html>
