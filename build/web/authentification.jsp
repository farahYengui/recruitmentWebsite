<%-- 
    Document   : authentification
    Created on : Dec 3, 2021, 5:58:14 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="style.css" />
  <title>CARRIERE</title>
  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>
  <link rel="stylesheet" href="navbar.css">
  <link href="signIn.css" rel="stylesheet">
  <link href="signUpEntreprise.css" rel="stylesheet">
  <link href="intranetCan.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css?family=Bangers' rel='stylesheet'>
  <link href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap" rel="stylesheet">
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
  <div id="connexion">
    <div class="button">
      <button id="candidat" class="button1">Candidat</button>
      <button id="entreprise" class="button1">Entreprise</button>
    </div>
    <div>
      <div id="sign-in-candidat">
        <h2>TROUVEZ UNE MEILLEURE FAÇON DE TRAVAILLER</h2>
        <div class="container" id="container">
          <div class="form-container sign-up-container">
            <form action="#">
              <h1>Inscription</h1>
              <div class="social-container">
                <a href="#" class="social"><img src="images/facebook.png"></a>
                <a href="#" class="social"><img src="images/google.png"></a>
                <a href="#" class="social"><img src="images/linkedin.png"></a>
              </div>
              <span>ou bien utiliser votre e-mail pour créer un compte</span>
              <input type="text" placeholder="Name" class="sign-in-input"/>
              <input type="email" placeholder="Email" class="sign-in-input"/>
              <input type="password" placeholder="Password" class="sign-in-input"/>
              <button>S'inscrire</button>
            </form>
          </div>
          <div class="form-container sign-in-container">
            <form action="#">
              <h1>Connexion</h1>
              <div class="social-container">
                <a href="#" class="social"><img src="facebook.png"></a>
                <a href="#" class="social"><img src="google.png"></a>
                <a href="#" class="social"><img src="linkedin.png"></a>
              </div>
              <span>ou bien utiliser votre compte</span>
              <input type="email" placeholder="Email" class="sign-in-input"/>
              <input type="password" placeholder="Password" class="sign-in-input" />
              <a href="#">Mot de passe oublié?</a>
              <button>Se connecter</button>
            </form>
          </div>
          <div class="overlay-container">
            <div class="overlay">
              <div class="overlay-panel overlay-left">
                <h1>Re-bonjour!</h1>
                <p>
                  Pour rester connecté avec nous, veuillez vous connecter avec vos informations personnelles</p>
                <button class="ghost" id="signIn">Se connecter</button>
              </div>
              <div class="overlay-panel overlay-right">
                <h1>Bonjour, ami!</h1>
                <p>
                  Entrez vos données personnelles pour pouvoir héberger votre CV</p>
                <button class="ghost" id="signUp">S'inscrire</button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div id="sign-in-entreprise">
        <h2>TROUVEZ UNE MEILLEURE FAÇON DE TRAVAILLER</h2>
        <div class="container" id="container1">

          <div class="form-container sign-up-container">
            <h3>
              Créer un compte de votre entreprise
            </h3>
            <form>
              <div class="info_data">
                <div class="slideshow-container slide-width">
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Nom </h4>
                      <div class=" input ">
                        <input class="myInput" type="text" name="myCountry" placeholder="Nom de l'entreprise">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Local </h4>
                      <div class=" input ">
                        <input class="myInput" type="text" name="myCountry"
                          placeholder="Où se trouve votre entreprise?">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Domaine </h4>
                      <div class=" input ">

                        <input class="myInput" type="text" name="domaine"
                          placeholder="Quel est le domaine de votre entreprise?">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Description </h4>
                      <div class=" input ">
                        <textarea class="myInput" name="description" placeholder="Décrire votre entreprise" rows="5"
                          cols="33"></textarea>

                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Numéro </h4>
                      <div class=" input ">
                        <input class="myInput" type="text" name="numero" placeholder="+216 00 000 000">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Email </h4>
                      <div class=" input ">
                        <input class="myInput" type="email" name="email" placeholder="email@adress.com">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4> &nbsp; &nbsp;Mot de passe: </h4>
                      <div class=" input ">
                        <input class="myInput" type="password" name="myCountry" placeholder="Saisir votre mot de Passe">
                        <input class="myInput" type="password" name="myCountry"
                          placeholder="Confirmer votre mot de Passe">
                      </div>
                    </div>
                  </div>
                  <div class="step fade">
                    <div class="data">
                      <h4>Votre compte a été crée avec succès.</h4>
                      <a href="intranetEnt.jsp">Cliquez ici pour en accéder.</a>
                    </div>
                  </div>
                  <a class="p" onclick="plusSlides(-1)">&#10094;</a>
                  <a class="n" onclick="plusSlides(1)">&#10095;</a>

                </div>


              </div>
            </form>
          </div>
          <div class="form-container sign-in-container">
            <form action="#">
              <h1>Connexion</h1>
              <div class="social-container">
                <a href="#" class="social"><img src="images/facebook.png"></a>
                <a href="#" class="social"><img src="images/google.png"></a>
                <a href="#" class="social"><img src="images/linkedin.png"></a>
              </div>
              <span>ou bien utiliser votre compte</span>
              <input type="email" placeholder="Email" class="sign-in-input"/>
              <input type="password" placeholder="Password" class="sign-in-input"/>
              <a href="#">Mot de passe oublié?</a>
              <button>Se connecter</button>

          </div>
          <div class="overlay-container">
            <div class="overlay">
              <div class="overlay-panel overlay-left">
                <h1>Re-bonjour!</h1>
                <p>
                  Pour rester connecté avec nous, veuillez vous connecter avec les informations de votre entreprise.</p>
                <button class="ghost" id="signIn1">Se connecter</button>
              </div>
              <div class="overlay-panel overlay-right">
                <h1>Bonjour, Entrepreneur!</h1>
                <p>
                  Entrez les données de votre entreprise pour chercher des candidats.</p>
                <button class="ghost" id="signUp1">S'inscrire</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="grid" id="offres">
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
  <script src="signIn.js"></script>
  <script src="signUpEntreprise.js"></script>
</body>

</html>