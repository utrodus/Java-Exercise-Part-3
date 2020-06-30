/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_ConverterTxtDocDocx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.util.ArrayList;

/**
 *
 * @author utrodus
 */
public class ConverterApp extends javax.swing.JFrame {

    /**
     * Creates new form ConverterApp
     */
    public ConverterApp() {
        initComponents();
        this.setTitle("Aplikasi Converter File");
        this.setLocationRelativeTo(this);
        convertDoc.setEnabled(false);
        convertDocx.setEnabled(false);
    }

    public void convertToDoc(String path) {
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".doc", "doc"));
        int buka_dialog = chooser.showSaveDialog(ConverterApp.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            String filename = chooser.getSelectedFile().toString();
            if (!filename.endsWith(".doc")) {
                filename += ".doc";
            }
            pathFileAkhir.setText(filename);

            String line = null;
            ArrayList textFile = new ArrayList();
            try {
                // Baca File Txt
                FileReader fileReader = new FileReader(path);
                // membaca input file / isi file
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null) {
                    textFile.add(line);
                }
                bufferedReader.close();
                WriteDoc(filename, textFile);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "File Tidak Ada");
            }

        }
    }

    public void convertToDocx(String path) {
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".docx", "docx"));
        int buka_dialog = chooser.showSaveDialog(ConverterApp.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            String filename = chooser.getSelectedFile().toString();
            if (!filename.endsWith(".docx")) {
                filename += ".docx";
            }
            pathFileAkhir.setText(filename);

            // Baca File Txt
            String line = null;
            ArrayList textFile = new ArrayList();
            try {
                FileReader fileReader = new FileReader(path);
                // membaca input file / isi file
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null) {
                    textFile.add(line);
                }
                bufferedReader.close();
                WriteDocx(filename, textFile);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "File Tidak Ada");
            }

        }
    }

    public void WriteDoc(String filePath, ArrayList textFile) {
        try {

            Properties prop = new Properties();
            prop.setProperty("log4j.rootLogger", "WARN");

            // membuat dokumen
            String outDocEn = filePath;
            XWPFDocument document = new XWPFDocument();

            // membuat file
            FileOutputStream out = new FileOutputStream(new File(outDocEn));

            // membuat paragraf
            for (int i = 0; i < textFile.size(); i++) {
                XWPFParagraph paragraph = document.createParagraph();
                XWPFRun run = paragraph.createRun();
                run.setText(String.valueOf(textFile.get(i)));
            }

            document.write(out);
            out.close();

            JOptionPane.showMessageDialog(null, "Convert ke Doc Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void WriteDocx(String filePath, ArrayList textFile) {
        try {

            Properties prop = new Properties();
            prop.setProperty("log4j.rootLogger", "WARN");

            // membuat dokumen
            String outDocEn = filePath;
            XWPFDocument document = new XWPFDocument();

            // membuat file
            FileOutputStream out = new FileOutputStream(new File(outDocEn));

            // membuat paragraf
            for (int i = 0; i < textFile.size(); i++) {
                XWPFParagraph paragraph = document.createParagraph();
                XWPFRun run = paragraph.createRun();
                run.setText(String.valueOf(textFile.get(i)));
            }

            document.write(out);
            out.close();

            JOptionPane.showMessageDialog(null, "Convert ke Docx Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        openFile = new javax.swing.JButton();
        convertDoc = new javax.swing.JButton();
        convertDocx = new javax.swing.JButton();
        pathFileAwal = new javax.swing.JTextField();
        pathFileAkhir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 109, 213));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 109, 213));
        jLabel1.setText("Aplikasi Converter File ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_ConverterTxtDocDocx/convert.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel5.setText("Oleh : Utrodus Said Al Baqi");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(.txt ke .doc / .docx)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(34, 109, 213));

        openFile.setBackground(new java.awt.Color(255, 255, 255));
        openFile.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        openFile.setForeground(new java.awt.Color(51, 51, 51));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_ConverterTxtDocDocx/files-and-folders.png"))); // NOI18N
        openFile.setText("Cari File .txt");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        convertDoc.setBackground(new java.awt.Color(255, 255, 255));
        convertDoc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        convertDoc.setForeground(new java.awt.Color(51, 51, 51));
        convertDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_ConverterTxtDocDocx/convert-icon.png"))); // NOI18N
        convertDoc.setText("Convert ke .doc ");
        convertDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertDocActionPerformed(evt);
            }
        });

        convertDocx.setBackground(new java.awt.Color(255, 255, 255));
        convertDocx.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        convertDocx.setForeground(new java.awt.Color(51, 51, 51));
        convertDocx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTS_ConverterTxtDocDocx/convert-icon.png"))); // NOI18N
        convertDocx.setText("Convert ke .docx");
        convertDocx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertDocxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(openFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(convertDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(convertDocx, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convertDocx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pathFileAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        pathFileAwal.setText(" Path file");
        pathFileAwal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        pathFileAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        pathFileAkhir.setText(" Path File Hasil Convert");
        pathFileAkhir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Lokasi File Sebelum diconvert :");

        jLabel4.setText("Lokasi File Setelah diconvert :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(pathFileAwal)
                    .addComponent(pathFileAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathFileAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathFileAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        File filenya;
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        int buka_dialog = chooser.showOpenDialog(ConverterApp.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            String filePath = filenya.getPath();
            String fileName = filenya.getName();
            try {
                String fileExtention = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                if (!".txt".equals(fileExtention)) {
                    JOptionPane.showMessageDialog(null, "Maaf ! Hanya dapat menerima Format File .txt");
                } else {
                    pathFileAwal.setText(filePath);

                    if (".txt".equals(fileExtention)) {
                        convertDoc.setEnabled(true);
                        convertDocx.setEnabled(true);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
//                JOptionPane.showMessageDialog(null, "Maaf ! Hanya dapat menerima Format File .txt atau .doc ");
            }

        }
    }//GEN-LAST:event_openFileActionPerformed

    private void convertDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertDocActionPerformed
        // TODO add your handling code here:
        convertToDoc(pathFileAwal.getText());
    }//GEN-LAST:event_convertDocActionPerformed

    private void convertDocxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertDocxActionPerformed
        // TODO add your handling code here:
        convertToDocx(pathFileAwal.getText());
    }//GEN-LAST:event_convertDocxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertDoc;
    private javax.swing.JButton convertDocx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton openFile;
    private javax.swing.JTextField pathFileAkhir;
    private javax.swing.JTextField pathFileAwal;
    // End of variables declaration//GEN-END:variables
}
