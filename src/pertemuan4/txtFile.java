/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

//import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.InputStreamReader;

/**
 *
 * @author Utrodus
 */
public class txtFile {

    public static void main(String[] args) {
        // cara ketiga dengan kata kunci new

        String fileName = "/Users/utrodus/Documents/biodata.txt";

        String line = null;
        int baris = 0;
        try {
            // membaca file
            FileReader fileReader = new FileReader(fileName);
            // membaca input file / isi file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                baris++;
            }
            

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
