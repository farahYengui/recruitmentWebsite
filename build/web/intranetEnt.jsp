<%-- 
    Document   : intranetEnt
    Created on : Dec 3, 2021, 6:01:58 PM
    Author     : HP
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
     <%
         String name = "";
        String adress = "";
        String domain = "";
        String description = "";
        String phone = "";
        String email = session.getAttribute("email").toString();
      
        List <String> listPost = new ArrayList<String>();
           try
      {       
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db?useUnicode=true &useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false& serverTimezone=UTC", "root", "");
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
PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT post from poste where email=?");
pstmt.setString(1,email); 
ResultSet rslt= pstmt.executeQuery();
while(rslt.next()){
    listPost.add(rslt.getString("post"));
      }

      }catch( Exception exp)
       {
System.out.println (exp.getMessage());
       }


%>

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

      <h4><%= name %></h4>
      <h4> <%= domain%> </h4>
      <h4> <%= adress %></h4>
 
    </div>
    <div class="right">
      <div class="info">
        <h3>Information</h3>
        <div class="info_data">
          <div class="data">
            <h4> &nbsp; &nbsp;Nom </h4>
            <form>
              <div class=" input ">
                

                <input class="myInput" type="text" name="name" placeholder="Nom" disabled="disabled" value= "<%= name %>">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Local </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="adress" placeholder="Local" disabled="disabled" value= "<%= adress %>">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Domaine </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="domain" placeholder="Domaine" disabled="disabled" value= "<%= domain %>">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>
          <div class="data">
            <h4> &nbsp; &nbsp;Description </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="description" placeholder="Description" disabled="disabled" value= "<%= description %>">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Numéro </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="text" name="phone" placeholder="numéro" disabled="disabled" value= "<%= phone %>">

                <input type="submit" value="modifier" class="envoyer">
              </div>
            </form>


          </div>

          <div class="data">
            <h4> &nbsp; &nbsp;Email </h4>
            <form>
              <div class=" input ">

                <input class="myInput" type="email" name="email" placeholder="Email" disabled="disabled" value= "<%= email %>">

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
<% for(int i=0;i<listPost.size();i++){ %>
        <h4> <%= listPost.get(i) %> </h4> 
        <a href="servletUrl?param=value"><img src="images/remove.png"></a>
        <form action="FileDownload" method="get">
            <input type="text" value="<%= listPost.get(i) %>" hidden="hidden" name="poste">
            <input type="text" value="<%= email %>" hidden="hidden" name="email">
            <button>télécharger les CV</button>
        </form>
<% }%>
          
            <form action="PosteServlet" method="post" class="inline-post">
                <input class="ajouter" type="text" name="name" value="<%= name %>" hidden="hidden">
                <input class="ajouter" type="text" name="email" value="<%= email %>" hidden="hidden"> 
                <input class="ajouter" type="text" name="post" placeholder="Ajouter poste" style="width: 240px;">
            
            <button type="submit"> <img src="images/add.png"></button>
            </form>
          </div>
        </div>


      </div>
    </div>
  </div>
<script src="disconnect.js"></script>
</body>

</html>