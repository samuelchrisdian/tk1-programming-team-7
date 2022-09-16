import java.text.DecimalFormat;
import java.util.Scanner;

public class Restoran {

    public static void main(String[] args) {
        String nama;
        int jumlah, pesan1, pesan2, pesan3, pesan4, pesan5;
        double h1, h2, h3, h4, h5, total, diskon, bayar, perorang;
        h1 = 9999.99;
        h2 = 12345.67;
        h3 = 21108.40;
        h4 = 13579.13;
        h5 = 98765.43;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat koma = new DecimalFormat("#.##");
        
        System.out.println("Selamat siang...");
        System.out.print("Pesan untuk berapa orang: ");
        jumlah = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Pesan atas nama: ");
        nama = keyboard.nextLine();

        System.out.println("\nMenu spesial hari ini");
        System.out.println("=====================================");
        System.out.println("1. Nasi Goreng Spesial      @ Rp. 9999.99");
        System.out.println("2. Ayam Bakar Spesial       @ Rp. 12345.67");
        System.out.println("3. Steak Sirloin Spesial    @ Rp. 21108.40");
        System.out.println("4. Kwetiaw Siram Spesial    @ Rp. 13579.13");
        System.out.println("5. Kambing Guling Spesial   @ Rp. 98765.43");
        
        System.out.println("\nPesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("1. Nasi Goreng Spesial    = ");
        pesan1 = keyboard.nextInt();
        System.out.print("2. Ayam Bakar Spesial     = ");
        pesan2 = keyboard.nextInt();
        System.out.print("3. Steak Sirloin Spesial  = ");
        pesan3 = keyboard.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial  = ");
        pesan4 = keyboard.nextInt();
        System.out.print("5. Kambing Guling Spesial = ");
        pesan5 = keyboard.nextInt();
        
        System.out.println("\nSelamat menikmati makanan anda...");
        System.out.println("\nPembelian:");
        System.out.println("1. Nasi Goreng Spesial      " + pesan1 + " porsi * Rp. 9999.99   = Rp. " + koma.format(pesan1*h1));
        System.out.println("2. Ayam Bakar Spesial       " + pesan2 + " porsi * Rp. 12345.67  = Rp. " + koma.format(pesan2*h2));
        System.out.println("3. Steak Sirloin Spesial    " + pesan3 + " porsi * Rp. 21108.40  = Rp. " + koma.format(pesan3*h3));
        System.out.println("4. Kwetiaw Siram Spesial    " + pesan4 + " porsi * Rp. 13579.13  = Rp. " + koma.format(pesan4*h4));
        System.out.println("5. Kambing Guling Spesial   " + pesan5 + " porsi * Rp. 98765,43  = Rp. " + koma.format(pesan5*h5));
        System.out.println("================================================================== +");
        
        total = pesan1*h1 + pesan2*h2 + pesan3*h3 + pesan4*h4 + pesan5*h5;
        System.out.println("Total pembelian                                     = Rp. " + total);
        
        diskon = total*10/100;
        System.out.println("Disc. 10% < Masa Promosi >                          = Rp. " + koma.format(diskon));
        System.out.println("================================================================== -");
        
        bayar = total-diskon;
        System.out.println("Total pembelian setelah diskon 10%                  = Rp. " + koma.format(bayar));
        
        perorang = bayar/jumlah;
        System.out.println("Pembelian per orang <untuk " + jumlah + " orang>                  Rp. " + koma.format(perorang));
        
        System.out.println("\nTerima kasih atas kunjungan Anda...");
        System.out.println("...tekan ENTER untuk keluar...");
        
    }
}
