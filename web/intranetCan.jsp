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
        List <String> listPost = new ArrayList<String>();
        List <String> listName = new ArrayList<String>();
        List <String> listEmail = new ArrayList<String>();
        List <String> listAdress = new ArrayList<String>();
         List <String> listDomain = new ArrayList<String>();
        List <String> listPhone = new ArrayList<String>();
         List <String> listDescription = new ArrayList<String>();
           try
      {       
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");
         PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
                 "SELECT poste.post, poste.email, entreprise.name, entreprise.adress, entreprise.domain, entreprise.phone, entreprise.description  FROM poste,entreprise WHERE poste.email = entreprise.email");
ResultSet rslt= pstmt.executeQuery();
while(rslt.next()){
    listPost.add(rslt.getString("poste.post"));
    listName.add(rslt.getString("entreprise.name"));
    listEmail.add(rslt.getString("poste.email"));
    listAdress.add(rslt.getString("entreprise.adress"));
    listDomain.add(rslt.getString("entreprise.domain"));
    listPhone.add(rslt.getString("entreprise.phone"));
    listDescription.add(rslt.getString("entreprise.description"));
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
        
        <% for(int i=0;i<listPost.size();i++){ %>     
      <div class="wrapper">
        <div class="right">
          <div class="info">
            <h3><%= listName.get(i) %></h3>
            <div class="info_data">
              <div>
                <p><%= listDescription.get(i) %></p>
              </div>
              <div>
                <h4>Poste</h4>
                <p><%= listPost.get(i) %></p>
              </div>

              <div> <img src="images/location.png" alt="" class="local"> <%= listAdress.get(i) %> &nbsp; &nbsp;
                <img src="images/domain.png" alt="" class="local"> <%= listDomain.get(i) %> &nbsp; &nbsp;
                <img src="images/call.png" alt="" class="local"> <%= listPhone.get(i) %> &nbsp; &nbsp;
              </div>
              <div>
                  <form method="post" action="FileUpload" enctype="multipart/form-data" >
                      <label for="file" id ="fileLabel" class="postuler"> Ajouter un CV</label>
                      <input type="file" name="file" id="file" onchange="pressed()"/>
                      <input type="submit" value="Postuler maintenant" name="upload" id="upload" class="postuler" />
                      <label class="message">${message}</label>
                      <input type="text" value="<%= listPost.get(i) %>" name="poste" hidden="hidden" />
                      <input type="text" value="<%= listEmail.get(i) %>" name="email" hidden="hidden"/>
                  </form>
              </div>
            </div>
          </div>
        </div>
      </div>
<% }%>
    </div>
  </div>


  <script src="search.js"></script>
  <script src="disconnect.js"></script>
  <script>
      window.pressed = function(){
    var file = document.getElementById('file');
    var fileLabel = document.getElementById('fileLabel');
    if(file.value == "")
    {
        fileLabel.innerHTML = "Ajouter un CV";
    }
    else
    {
        var theSplit = file.value.split('\\');
        fileLabel.innerHTML = theSplit[theSplit.length-1];
    }
};
  </script>

</body>

</html>
