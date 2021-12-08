<%-- 
    Document   : intranetCan
    Created on : Dec 3, 2021, 6:00:56 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
  <title>Candidat</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="navbar.css" rel="stylesheet">
  <link href="intranetCan.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>

</head>

<body>
  <nav>
    <ul>
      <div><a class="logo" href="#">Carriere</a>
        <p>Mettons-nous au travail</p>
      </div>
      <li><a href="javascript:disconnect();">Déconnexion</a></li>
    </ul>
  </nav>
  <div class="nav-margin"></div>
  <div class="grid">
    <div class="recher">
      <div> <img src="images/portfolio.png" id="emploi"> Emploi recherché </div>
      <br>
      <!--Make sure the form has the autocomplete function switched off:-->
      <form class="in-form">
        <div>
          <input id="inputCountry" type="text" name="regions" placeholder="Région">
        </div>
        <input type="submit" value="" class="envoyer">
      </form>
    </div>

    <div class="entrepriseContainer">
      <h1 style="text-align: center;">Bonjour ${name}! Vous pouvez maintenant postuler votre CV pour n'importe quel
        emploi.</h1>
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
              <div>
                <button class="postuler">Postuler maintenant </button>
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
              <div>
                <button class="postuler">Postuler maintenant </button>
              </div>
            </div>
          </div>
        </div>
      </div>






    </div>
  </div>


  <script src="search.js"></script>
  <script src="script.js"></script>
  <script src="disconnect.js"></script>

</body>

</html>
