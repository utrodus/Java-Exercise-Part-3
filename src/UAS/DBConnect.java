/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author utrodus
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DBConnect tesDatabase = new DBConnect();
        tesDatabase.Connect();
    }

    Connection con = null;

    String statusKoneksi;

    public void Connect() {
        try {
            String connectionURL = "jdbc:mysql://localhost:8889/koin_nu";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);

            statusKoneksi = "Terhubung";
        } catch (Exception e) {
            System.out.println(e);
            statusKoneksi = "Gagal Terhubung Database";
            System.exit(0);
        }
    }

}
