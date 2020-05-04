/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author wesll
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://c:/Intel/SA.accdb");
            Statement st = con.createStatement();
            //st.executeUpdate("INSERT into Alunos (Matricula, Nome, Endereco, Curso) values ('1','Weslley','rua b','ADS')");
            //st.executeUpdate("DELETE from Alunos where Matricula = '1'");
            //st.executeUpdate("UPDATE Alunos SET Nome = 'Weslley Luiz' where Matricula = '1'
            ResultSet rs = st.executeQuery("select * From Alunos");
            while(rs.next()){
                System.out.println(rs.getString("Nome"));
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
