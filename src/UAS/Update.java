/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author utrodus
 */
public class Update {

    DBConnect konek = new DBConnect();

    public void update(int nim, String nama, String alamat, String jk) {

        try {

            konek.Connect();
            Statement statement = konek.con.createStatement();

            
            String sql_nama = "update identitas set nama='" + nama + "'where nim='" + nim + "'";
            String sql_alamat = "update identitas set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_jenis = "update identitas set jeniskelamin='" + jk + "'where nim='" + nim + "'";

            
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
