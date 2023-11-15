/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

package desktop_motodeal;

/**
 *
 * @author Marcellino
 */
public class Desktop_motodeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

public class TransaksiMotor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi data motor
        String[] motorNames = {"Honda", "Yamaha", "Suzuki"};
        int[] motorPrices = {15000000, 14000000, 16000000};

        // Input data pembeli
        System.out.print("Masukkan nama pembeli: ");
        String buyerName = scanner.nextLine();

        // Pilihan motor
        System.out.println("Pilihan Motor:");
        for (int i = 0; i < motorNames.length; i++) {
            System.out.println((i + 1) + ". " + motorNames[i] + " - Harga: Rp" + motorPrices[i]);
        }

        System.out.print("Pilih motor (1-" + motorNames.length + "): ");
        int motorChoice = scanner.nextInt();

        // Validasi pilihan motor
        if (motorChoice < 1 || motorChoice > motorNames.length) {
            System.out.println("Pilihan tidak valid. Program berhenti.");
            return;
        }

        // Input jumlah unit yang dibeli
        System.out.print("Masukkan jumlah unit yang dibeli: ");
        int quantity = scanner.nextInt();

        // Hitung total harga
        int total = motorPrices[motorChoice - 1] * quantity;

        // Tampilkan struk transaksi
        System.out.println("\n==== Struk Transaksi ====");
        System.out.println("Nama Pembeli: " + buyerName);
        System.out.println("Motor yang dibeli: " + motorNames[motorChoice - 1]);
        System.out.println("Jumlah unit: " + quantity);
        System.out.println("Total Harga: Rp" + total);
        System.out.println("=========================");
    }
}
 
    }
    
}
