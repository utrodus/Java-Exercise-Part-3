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
    
    DBConnect konek = new DBConnect();
    public void delete(int nim) {

        try {
            
            konek.Connect();
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
