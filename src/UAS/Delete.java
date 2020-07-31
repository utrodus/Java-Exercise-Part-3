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
public class Delete {

    DBConnect dbConnect = new DBConnect();

    public void delete(int no) {

        try {
            dbConnect.Connect();
            Statement statement = dbConnect.con.createStatement();

            String sql = "DELETE FROM transaksi WHERE No =" + no;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Sukses Menghapus Data");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
