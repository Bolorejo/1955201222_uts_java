/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String nama_barang, bonus = "";
        double harga_barang, diskon, total_harga, total_bayar;
        int jml_barang;
        
        //Perulangan Input Barang
        for(String i="y"; i.equals("y") || i.equals("y");){
       
        System.out.println("**************  APLIKASI PEMBELIAN BARANG **************") ;
        System.out.print("Nama Barang     : ") ;
        nama_barang = scan.nextLine();
        System.out.print("Harga Barang    : ") ;
        harga_barang = scan.nextDouble();
        System.out.print("Jumlah Barang   : ") ;
        jml_barang = scan.nextInt();
        
        total_harga = harga_barang * jml_barang;
        
        if(total_harga<100000){
            diskon = 0.02 * total_harga;
            bonus  = "Pensil"; 
        }else if(total_harga>=100000 && total_harga<200000){
            diskon = 0.05 * total_harga;
            bonus  = "Buku"; 
        }else if(total_harga>=200000 && total_harga<300000){
            diskon = 0.07 * total_harga;
            bonus  = "Kaos";
        }else if(total_harga>=300000 && total_harga<400000){
            diskon = 0.1 * total_harga;
            bonus  = "Baju"; 
        }else if(total_harga>=400000 && total_harga<500000){
            diskon = 0.14 * total_harga;
            bonus  = "Tas";
        }else{
            diskon = 0.2 * total_harga;
            bonus  = "Sepatu"; 
        }
        
        total_bayar = total_harga - diskon;     
        System.out.println("\n\n******************** TOTAL BELANJA  ********************");
        System.out.println("Total Belanja : " +total_harga);
        System.out.println("Diskon (Rp)   : " +diskon);
        System.out.println("Total Bayar   : " +total_bayar);
        System.out.println("Bonus         : " +bonus);
        System.out.println("********************************************************");
        
        System.out.print("Apakah Anda ingin Input lagi? [Y/T]");
        i = scan.next();
    }  
    }
}
    
    

