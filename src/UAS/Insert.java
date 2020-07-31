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
public class Insert {

    DBConnect dbconnect = new DBConnect();

    public void addData(String kecamatan, int jumlah, String kotakinfaq, String tgltransaksi, int totaltransaksi) {

        try {

            dbconnect.Connect();
            Statement statement = dbconnect.con.createStatement();

            String query = "insert into transaksi (kecamatan, jumlah, kotakinfaq, tgltransaksi, totaltransaksi)" 
                    + "values('" + kecamatan + "', '" + jumlah + "','" + kotakinfaq + "','" + tgltransaksi + "','" + totaltransaksi + "')";

            statement.executeUpdate(query);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//            menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Sukses Menyimpan Data");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
