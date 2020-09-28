/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author apple
 */
public class Execute {
    public ResultSet chayQuery(Connection con , String query){
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            return rs;
        }
    
    public void ChayQueryNonResult(Connection con, String query){
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
