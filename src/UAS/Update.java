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

    public void updateAllData(int no, String kecamatan, int jumlah, String tgl, String kotakinfaq, int total) {

        try {

            konek.Connect();
            Statement statement = konek.con.createStatement();

            String sql_kecamatan = "update transaksi set kecamatan='" + kecamatan + "'where No='" + no + "'";
            String sql_jumlah = "update transaksi set jumlah='" + jumlah + "'where No='" + no + "'";
            String sql_tgl = "update transaksi set tgltransaksi='" + tgl + "'where No='" + no + "'";
            String sql_kotak = "update transaksi set kotakinfaq='" + kotakinfaq + "'where No='" + no + "'";
            String sql_total = "update transaksi set totaltransaksi='" + total + "'where No='" + no + "'";

            statement.executeUpdate(sql_kecamatan);
            statement.executeUpdate(sql_jumlah);
            statement.executeUpdate(sql_tgl);
            statement.executeUpdate(sql_kotak);
            statement.executeUpdate(sql_total);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void updateTotal(int no, int total) {

        try {
            konek.Connect();
            Statement statement = konek.con.createStatement();

            String sql_total = "update transaksi set totaltransaksi='" + total + "'where No='" + no + "'";
            statement.executeUpdate(sql_total);
            statement.close();

//            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
