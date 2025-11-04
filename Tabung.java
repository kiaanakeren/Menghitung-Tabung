import java.util.*;

public class Tabung {

    // Fungsi untuk menghitung volume tabung
    static double hitungVolume(double r, double t) {
        double volume = 3.14 * r * r * t; 
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Hitung Volume Tabung ");
        System.out.print("Masukkan jari-jari (cm): ");
        double r = in.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double t = in.nextDouble();

        double hasil = hitungVolume(r, t);

        System.out.println("Volume tabung = " + hasil + " cm³");
        in.close();
    }
}
    

