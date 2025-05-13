/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaslingkaran;

/**
 *
 * @author LEGION
 */
public class Lingkaran {

    private final double PI = 3.141592;

    void hitungLuas(double r) {
        double luas = PI * r * r;
        System.out.println("Hasil Luas lingkaran (Pecahan) : " + luas);
        System.out.println("Hasil Luas lingkaran (bulat) : " + (int) luas);
        System.out.println("Hasil Luas lingkaran (pembulatan) : " + Math.round(luas));
    }
}
