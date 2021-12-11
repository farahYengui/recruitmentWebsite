<%-- 
    Document   : intranetCan
    Created on : Dec 3, 2021, 6:00:56 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
 <%
        String adress = "";
        String domain = "";
        String description = "";
        String phone = "";
        String email = "";
      
        List <String> listPost = new ArrayList<String>();
        List <String> listName = new ArrayList<String>();
        
           try
      {       
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");
         PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
                 "SELECT poste.post, poste.entreprise, poste.email, entreprise.adress, entreprise.domain, entreprise.phone, entreprise.description  FROM poste,entreprise WHERE poste.email = entreprise.email");
ResultSet rslt= pstmt.executeQuery();
while(rslt.next()){
    listPost.add(rslt.getString("post"));
      }

         
         PreparedStatement pstmt1 = con.prepareStatement("select * from entreprise where email=?");
         pstmt1.setString(1,email); 
         
            ResultSet rs = pstmt1.executeQuery();
       if (rs.next()){
        name = rs.getString("name"); 
        adress = rs.getString("adress");
        domain = rs.getString("domain");
        description = rs.getString("description");
        phone = rs.getString("phone");
 } 

      }catch( Exception exp)
       {
System.out.println (exp.getMessage());
       }


%>

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
                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>
              </div>
              <div>
                <h4>Poste</h4>
                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>
              </div>

              <div> <img src="images/location.png" alt="" class="local"> localisation &nbsp; &nbsp;
                <img src="images/domain.png" alt="" class="local"> domain &nbsp; &nbsp;
                <img src="images/call.png" alt="" class="local"> phone &nbsp; &nbsp;
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
                <p>nhfnthnfthhhhhhhfdtj nkslpjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjd</p>
              </div>
              <div>
                <h4>Poste</h4>
                <p>inforthhhhhhhhhhhhhhhhhhhhhhhhh</p>
              </div>

              <div> <img src="images/location.png" alt="" class="local"> localisation &nbsp; &nbsp;
                <img src="images/domain.png" alt="" class="local"> domain &nbsp; &nbsp;
                <img src="images/call.png" alt="" class="local"> phone &nbsp; &nbsp;
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
  <script src="disconnect.js"></script>

</body>

</html>
