/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaslingakaraninput;

import java.util.Scanner;
import luaslingkaran.Lingkaran;

/**
 *
 * @author LEGION
 */
public class LingkaranBeraksiInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lingkaraninput ling = new Lingkaraninput();

        System.out.println("------------------------------");
        System.out.println("contoh input (misalnya : 11,87). ");
        System.out.print("Masukkan Jari-Jari Lingkaran : ");
        double r = scanner.nextDouble();

        double luas = ling.hitungLuas(r);
        System.out.printf("Hasil Luas lingkaran (Pecahan) : %.2f\n", luas);
        System.out.println("Hasil Luas lingkaran (bulan) : " + (int) luas);
        System.out.println("Hasil Luas lingkaran (pembulatan) : " + Math.round(luas));
        scanner.close();
    }
}
