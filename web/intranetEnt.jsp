<%-- 
    Document   : intranetEnt
    Created on : Dec 3, 2021, 6:01:58 PM
    Author     : HP
--%>

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
      <h4>nom entreprise</h4>
      <h4>local </h4>
      <h4>domaine</h4>
      <div class="social_media">
        <ul>
          <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
          <li><a href="#"><i class="fab fa-twitter"></i></a></li>
          <li><a href="#"><i class="fab fa-instagram"></i></a></li>
        </ul>
      </div>
    </div>
    <div class="right">
      <div class="info">
        <h3>Information</h3>
        <div class="info_data">
          <div class="data">
            <h4> &nbsp; &nbsp;Nom </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="myCountry" placeholder="Nom">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Local </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="myCountry" placeholder="Local">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Domaine </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="myCountry" placeholder="Domaine">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Description </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="myCountry" placeholder="Description">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Numéro </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="number" name="myCountry" placeholder="numéro">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Email </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="email" name="myCountry" placeholder="Email">

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

            <h4> developpeur java</h4> <a href="#"><img src="images/remove.png"> </a>
            <h4> developpeur java</h4> <a href="#"><img src="images/remove.png"> </a>


            <form>
              <input class="ajouter" type="text" name="ajouter" placeholder="Ajouter poste">
            </form>
            <a href=""> <img src="images/add.png"></a>





          </div>
        </div>


      </div>
    </div>
<script src="disconnect.js"></script>
</body>

</html>
