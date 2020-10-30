/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program ganti kata
 */
public class PBOIF210119043Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    
    public static String inputKalimat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====\n");
        System.out.print("Masukan Kalimat : ");
        String kalimat = scanner.nextLine();
        return kalimat;
    }
    
    public static String inputKata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ganti kata : ");
        String kata = scanner.nextLine();
        return kata;
    }
    
    public static String penggantiKata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Menjadi kata : ");
        String gantiKata = scanner.nextLine();
        return gantiKata;
    }
    
    public static void hasilFormatting (String kalimat, String kata, String gantiKata) {
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat awal : " + kalimat);
        String replaceString = kalimat.replaceAll(kata, gantiKata);
        System.out.println("Kalimat baru : " + replaceString);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        hasilFormatting(inputKalimat(), inputKata(), penggantiKata());
    }
    
}
