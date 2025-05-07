/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaslingkaran;

import java.util.Scanner;

/**
 *
 * @author LEGION
 */
public class LingkaranBeraksiInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lingkaran ling = new Lingkaran();

        System.out.println("------------------------------");
        System.out.println("contoh input (misalnya : 11,87). ");
        System.out.print("Masukkan Jari-Jari Lingkaran : ");
        double r = scanner.nextDouble();

        ling.hitungLuas(r);

        scanner.close();
    }
}
