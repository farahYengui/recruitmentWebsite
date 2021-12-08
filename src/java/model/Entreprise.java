/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author RYZEN7
 */
public class Entreprise {
    public String inscrireEnt(String name,String adress, String domain, String description,String phone,String email, String password){
        String res="";
           try
      {  /**CONNEXION BDD**/
        
       
         Class.forName("com.mysql.jdbc.Driver");// charger le driver ODBC

         Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/recruitment_db", "root", "");

         /**requete insertion**/

         PreparedStatement pstmt1 = (PreparedStatement) con.prepareStatement("insert into entreprise (name,adress, domain, description, phone, email, password) values (?,?,?,?,?,?,?)");

         pstmt1.setString(1,name);
         pstmt1.setString(2,adress);
         pstmt1.setString(3,domain);
         pstmt1.setString(4,description);
         pstmt1.setString(5,phone);
         pstmt1.setString(6,email);
         pstmt1.setString(7,password);
         
       
         
         int resultat = pstmt1.executeUpdate();
res = "Votre ajout est effectué avec succes";



     }catch( Exception exp)
       {
System.out.println (exp.getMessage());
res = "erreur !!!";
       }
          return res;         
    }
    
    }

