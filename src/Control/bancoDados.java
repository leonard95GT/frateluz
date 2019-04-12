/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rodolfo
 */
public class bancoDados {
  private static String user = "root";
  private static String password = "";
  private static String url = "jdbc:mysql://localhost:3306/fratelux";
  private static String servidor = "com.mysql.cj.jdbc.Driver";
  private static Connection con = null;

  public static Connection getConexao() {

      try {

          Class.forName(servidor);
          con = DriverManager.getConnection(url, user, password);
          
          return con;

      } catch (Exception e) {
          System.out.println(e.getMessage());
          return null;
      }
  }

  
  
  
  
  public static void fechar() throws SQLException {
      if (con != null) {
          con.close();

      }
  }
    

}
