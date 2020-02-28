/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author utrodus
 */
public class ganjilGenap {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Inputkan Angka : ");

        int nilaiAngka = inputUser.nextInt();
        
        if(nilaiAngka %2 == 0){
            System.out.println("Bilangan " + nilaiAngka + " Ialah Genap");
        }else if(nilaiAngka %2 != 0){
            System.out.println("Bilangan " + nilaiAngka + " Ialah Ganjil");
        }
        
        
    }
}
