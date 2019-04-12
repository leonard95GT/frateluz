/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.telaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodolfo
 */
public class FrateluzCompleto {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        bancoDados bd = new bancoDados();
        
        try (Connection conex = bancoDados.getConexao()) {
            //JOptionPane.showMessageDialog(null, "Banco deu certo");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        telaPrincipal t = new telaPrincipal();
        //t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setVisible(true);
        
        
        //espaço para código de chamada (BD)        
        
    }
    
}
