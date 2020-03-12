/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class BiodataTxt extends javax.swing.JFrame {

    /**
     * Creates new form BiodataTxt
     */
    public BiodataTxt() {
        initComponents();
        this.setTitle("Program Read & Write Biodata");
        this.setLocationRelativeTo(this);
    }

    public void ReadData(String path) {
        String fileName = path;
        BufferedImage image = null;
        String line = null;

        try {
            pathFile.setText(path);
            // membaca file
            FileReader fileReader = new FileReader(fileName);
            // membaca input file / isi file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int baris = 0;
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//                System.out.println(baris);
                switch (baris) {
                    case 0:
                        nama.setText(line);
                        break;
                    case 1:
                        Ttl.setText(line);
                    case 2:
                        alamat.setText(line);
                    case 3:
                        motto.setText(line);
                    case 4:
                        prodi.setText(line);
                    case 5:
                        fakultas.setText(line);
                    case 6:
                        universitas.setText(line);
                    case 7:
                        nim.setText(line);
                    case 8:
                        kelas.setText(line);
                    case 9:
                        email.setText(line);
                    case 10:
                        nomorwa.setText(line);
                    case 11:
                        twitter.setText(line);
                    case 12:
                        instagram.setText(line);
                    case 13:
                        facebook.setText(line);
                    case 14:
                        pathImage.setText(line);

                    default:
                        System.out.println("Proses Pengisian");
                }
                baris++;

            }
            ReadImage(pathImage.getText());
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "File Tidak Ada");
        }

    }

    public void ReadImage(String path) {

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gambar Kosong");
        }
        ImageIcon imageIcon = new ImageIcon(image);
        gambar.setIcon(imageIcon);
    }

    public void SaveDataAs(String path) {

        File file = new File(path);
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            String getNama = nama.getText() + System.getProperty("line.separator");
            String getTtl = Ttl.getText() + System.getProperty("line.separator");
            String getAlamat = alamat.getText() + System.getProperty("line.separator");
            String getMotto = motto.getText() + System.getProperty("line.separator");

            String getProdi = prodi.getText() + System.getProperty("line.separator");
            String getFakultas = fakultas.getText() + System.getProperty("line.separator");
            String getUniv = universitas.getText() + System.getProperty("line.separator");
            String getNim = nim.getText() + System.getProperty("line.separator");
            String getKelas = kelas.getText() + System.getProperty("line.separator");

            String getEmail = email.getText() + System.getProperty("line.separator");
            String getNoWa = nomorwa.getText() + System.getProperty("line.separator");
            String getTw = twitter.getText() + System.getProperty("line.separator");
            String getIg = instagram.getText() + System.getProperty("line.separator");
            String getFb = facebook.getText() + System.getProperty("line.separator");
            String getImg = pathImage.getText() + System.getProperty("line.separator");

            br.write(getNama);
            br.write(getTtl);
            br.write(getAlamat);
            br.write(getMotto);
            br.write(getProdi);
            br.write(getFakultas);
            br.write(getUniv);
            br.write(getNim);
            br.write(getKelas);
            br.write(getEmail);
            br.write(getNoWa);
            br.write(getTw);
            br.write(getIg);
            br.write(getFb);
            br.write(getImg);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void SaveData() {

        File file = new File(pathFile.getText());
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            String getNama = nama.getText() + System.getProperty("line.separator");
            String getTtl = Ttl.getText() + System.getProperty("line.separator");
            String getAlamat = alamat.getText() + System.getProperty("line.separator");
            String getMotto = motto.getText() + System.getProperty("line.separator");

            String getProdi = prodi.getText() + System.getProperty("line.separator");
            String getFakultas = fakultas.getText() + System.getProperty("line.separator");
            String getUniv = universitas.getText() + System.getProperty("line.separator");
            String getNim = nim.getText() + System.getProperty("line.separator");
            String getKelas = kelas.getText() + System.getProperty("line.separator");

            String getEmail = email.getText() + System.getProperty("line.separator");
            String getNoWa = nomorwa.getText() + System.getProperty("line.separator");
            String getTw = twitter.getText() + System.getProperty("line.separator");
            String getIg = instagram.getText() + System.getProperty("line.separator");
            String getFb = facebook.getText() + System.getProperty("line.separator");
            String getImg = pathImage.getText() + System.getProperty("line.separator");

            br.write(getNama);
            br.write(getTtl);
            br.write(getAlamat);
            br.write(getMotto);
            br.write(getProdi);
            br.write(getFakultas);
            br.write(getUniv);
            br.write(getNim);
            br.write(getKelas);
            br.write(getEmail);
            br.write(getNoWa);
            br.write(getTw);
            br.write(getIg);
            br.write(getFb);
            br.write(getImg);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Path File Tidak Boleh Kosong");
        } finally {
            try {

                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Ttl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        motto = new javax.swing.JTextArea();
        pathFile = new javax.swing.JTextField();
        cariFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nomorwa = new javax.swing.JTextField();
        twitter = new javax.swing.JTextField();
        instagram = new javax.swing.JTextField();
        facebook = new javax.swing.JTextField();
        saveAs = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prodi = new javax.swing.JTextField();
        fakultas = new javax.swing.JTextField();
        universitas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pathImage = new javax.swing.JTextField();
        panelfoto2 = new javax.swing.JPanel();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas Pokok"));

        jLabel1.setText("Nama");

        jLabel2.setText("Tempat/Tgl Lahir");

        jLabel3.setText("Alamat");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jLabel4.setText("Motto");

        motto.setColumns(20);
        motto.setRows(5);
        jScrollPane2.setViewportView(motto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Ttl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pathFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFileActionPerformed(evt);
            }
        });

        cariFile.setText("Cari File");
        cariFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariFileActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kontak"));

        jLabel5.setText("Email");

        jLabel6.setText("Nomor Wa");

        jLabel7.setText("Twitter");

        jLabel8.setText("Instagram");

        jLabel9.setText("Facebook");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instagram, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(nomorwa)
                    .addComponent(twitter)
                    .addComponent(facebook))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomorwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(instagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveAs.setBackground(new java.awt.Color(0, 102, 204));
        saveAs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        saveAs.setForeground(new java.awt.Color(255, 255, 255));
        saveAs.setText("Save As");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(51, 153, 255));
        save.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel15.setText("Path File");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pendidikan"));

        jLabel10.setText("Prodi");

        jLabel11.setText("Fakultas");

        jLabel12.setText("Universitas");

        jLabel16.setText("Nim");

        jLabel17.setText("Kelas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(universitas)
                    .addComponent(fakultas)
                    .addComponent(prodi)
                    .addComponent(nim)
                    .addComponent(kelas, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(universitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        pathImage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pathImage.setText("Path Image");

        panelfoto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelfoto2.setPreferredSize(new java.awt.Dimension(134, 178));

        javax.swing.GroupLayout panelfoto2Layout = new javax.swing.GroupLayout(panelfoto2);
        panelfoto2.setLayout(panelfoto2Layout);
        panelfoto2Layout.setHorizontalGroup(
            panelfoto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        panelfoto2Layout.setVerticalGroup(
            panelfoto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfoto2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelfoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pathImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pathImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelfoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cariFile, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveAs, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariFile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveAs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathFileActionPerformed

    private void cariFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariFileActionPerformed
        // TODO add your handling code here:
        File filenya;
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        int buka_dialog = chooser.showOpenDialog(BiodataTxt.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            String filePath = filenya.getPath();
            ReadData(filePath);

        }
    }//GEN-LAST:event_cariFileActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        int buka_dialog = chooser.showSaveDialog(BiodataTxt.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            String filename = chooser.getSelectedFile().toString();
            if (!filename.endsWith(".txt")) {
                filename += ".txt";
            }
            SaveDataAs(filename);
            gambar.setIcon(null);
            ReadImage(pathImage.getText());
        }
    }//GEN-LAST:event_saveAsActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menyimpan ?");
        if (confirm == JOptionPane.YES_OPTION && pathFile.getText() != null) {
            SaveData();
            gambar.setIcon(null);
            ReadImage(pathImage.getText());
            
        } else {
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(BiodataTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataTxt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ttl;
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton cariFile;
    private javax.swing.JTextField email;
    private javax.swing.JTextField facebook;
    private javax.swing.JTextField fakultas;
    private javax.swing.JLabel gambar;
    private javax.swing.JTextField instagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextArea motto;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField nomorwa;
    private javax.swing.JPanel panelfoto2;
    private javax.swing.JTextField pathFile;
    private javax.swing.JTextField pathImage;
    private javax.swing.JTextField prodi;
    private javax.swing.JButton save;
    private javax.swing.JButton saveAs;
    private javax.swing.JTextField twitter;
    private javax.swing.JTextField universitas;
    // End of variables declaration//GEN-END:variables
}
