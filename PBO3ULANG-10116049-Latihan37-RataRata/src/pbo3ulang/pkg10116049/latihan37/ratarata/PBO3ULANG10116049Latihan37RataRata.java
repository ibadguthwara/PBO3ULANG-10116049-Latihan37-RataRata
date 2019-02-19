/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan37.ratarata;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi untuk menampilkan Rata-Rata nilai
 */
public class PBO3ULANG10116049Latihan37RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyak mahasiswa : ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        penilaian.averagePenilaian();

    }
    
}
