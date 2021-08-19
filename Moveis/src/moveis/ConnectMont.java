/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveis;

/**
 *
 * @author Usuario
 */

import java.sql.*;

public class ConnectMont {
    final private String driver = "org.firebirdsql.jdbc.FBDriver";
    String CHARSET = "?encoding=ISO8859_1";
    String server = "127.0.0.1";
    String porta = "3050";
    String user = "SYSDBA";
    String pwd = "masterkey";
    
    Connection link = null;
    
    public Connection Connect() {        
        try{
            Class.forName(driver);
            link =
                DriverManager.getConnection(
                "jdbc:firebirdsql://" + server + ":" + porta + "/C://fbdb//MONT_SRV.fdb" + CHARSET, user, pwd);
            System.out.println("Conexão feira com scesso DB Montagem");
        }catch (Exception e){
            System.out.println("Não foi possível conectar ao banco: " + e.getMessage());
        }
        return link;
    }
}
