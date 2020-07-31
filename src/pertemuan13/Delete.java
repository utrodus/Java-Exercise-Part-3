/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author utrodus
 */
public class Delete {
    
    Koneksi konek = new Koneksi();
    public void delete(int nim) {

        try {
            
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "DELETE FROM identitas WHERE nim =" + nim  ;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
