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
             String adress = request.getParameter("regions");
             System.out.println(request.getParameter("regions"));

        List <String> listPost = new ArrayList<String>();
        List <String> listName = new ArrayList<String>();
        List <String> listEmail = new ArrayList<String>();
        List <String> listAdress = new ArrayList<String>();
         List <String> listDomain = new ArrayList<String>();
        List <String> listPhone = new ArrayList<String>();
         List <String> listDescription = new ArrayList<String>();
           try
      {     
        
            String query="SELECT poste.post, poste.email, entreprise.name, entreprise.adress, entreprise.domain, entreprise.phone, entreprise.description  FROM poste,entreprise WHERE poste.email = entreprise.email";
        
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");
         PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(query);
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
      <li><a href="authentification.jsp">Connexion</a></li>
      <li><a href="#">Offres</a></li>
    </ul>
  </nav>
  <div class="nav-margin"></div>
  <div class="grid">
    <div class="recher">
      <div> <img src="images/portfolio.png" id="emploi"> Emploi recherché </div>
      <br>
      <!--Make sure the form has the autocomplete function switched off:-->
      <form class="in-form" >
        <div>
          <input id="inputCountry" type="text" name="regions" placeholder="Région">
        </div>
          <input type="submit" value="" class="envoyer" id="search" onclick="myFunction(event)" >
      </form>
    </div>

    <div class="entrepriseContainer">
     
        
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

                <div class="inline-data"> <img src="images/location.png" alt="" class="local"> <div class="city-name"><%= listAdress.get(i) %></div>
                    <img src="images/domain.png" alt="" class="local"> <div><%= listDomain.get(i) %></div>
                    <img src="images/call.png" alt="" class="local"> <div><%= listPhone.get(i) %></div> 
              </div>
              <div>
                  <form method="post" action="FileUpload" enctype="multipart/form-data" >
                     
                       <label for="file" id ="fileLabel" class="postuler"> Ajouter un CV</label>
                      <input type="file" name="file" id="file" onchange="pressed()"/>
                      <input type="submit" value="Postuler maintenant" name="upload" id="upload" class="postuler" /> 
                      <%
                          System.out.print(i);
                          System.out.print(listPost.get(i));
                          System.out.print(listEmail.get(i));
                          System.out.print(request.getAttribute("poste"));
                          System.out.print(request.getAttribute("email"));
                          if(listPost.get(i).equals(request.getAttribute("poste"))&& listEmail.get(i).equals(request.getAttribute("email"))){
                          
                     %>
                      <label class="message">${message}</label>
                      <% }%>
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
  
  function myFunction(e){
          e.preventDefault();
  var citySearched = document.getElementById('inputCountry').value;
  var container = document.getElementsByClassName('wrapper');
  var cityDB = document.getElementsByClassName('city-name');
  for (var i=0; i<container.length; i++)
  {
      console.log(cityDB[i].innerHTML);
  if (cityDB[i].innerHTML.toUpperCase() == citySearched.toUpperCase()){
      container[i].style.display = "flex";
  }
  else
  {
      container[i].style.display = "none";
      console.log(citySearched);
  }
  }
}
  </script>
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
