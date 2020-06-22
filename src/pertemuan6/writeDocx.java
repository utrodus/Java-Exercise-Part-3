/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author utrodus
 */
public class writeDocx {
    public static void main(String[] args) {
        try {
             Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
 
        String teks = "Prodi Ilmu Komputer aa" ;
        String outDocEn = "/Users/utrodus/Documents/doc/file.doc";
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(outDocEn));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);
        document.write(out);
        out.close();
        System.out.println("Generate DOC sukses");
        } catch (Exception e) {
        }
    }
}
