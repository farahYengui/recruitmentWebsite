/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author RYZEN7
 */
public class Poste {
    public String postulation(String post,String entreprise){
        String res="";
           try
      {  /**CONNEXION BDD**/
        
       out.print("1");
         Class.forName("com.mysql.jdbc.Driver");// charger le driver ODBC

         Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db", "root", "");
out.print("2");
         /**requete insertion**/

         PreparedStatement pstmt1 = (PreparedStatement) con.prepareStatement("insert into poste (post,entreprise) values (?,?)");

         pstmt1.setString(1,post);
         pstmt1.setString(2,entreprise);
     out.print("3");   
         
       
         
         int resultat = pstmt1.executeUpdate();
         out.print("4");
res = "Votre ajout est effectué avec succes";



     }catch( Exception exp)
       {
System.out.println (exp.getMessage());
res = "erreur !!!";
out.print("err");
       }
          return res;         
    }
    
}
