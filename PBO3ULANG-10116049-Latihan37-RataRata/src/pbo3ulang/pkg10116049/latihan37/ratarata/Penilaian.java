/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan37.ratarata;

/**
 *
 * @author ibadguthwara
 */
public class Penilaian {
    private int[] nilai;


    public Penilaian(int banyakMahasiswa){
        nilai = new int[banyakMahasiswa];
    }

    public void setNilai(int index, int nilai){
        this.nilai[index] = nilai;
    }

    public void averagePenilaian(){
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +averageValue());
    }


    private double averageValue(){
        int total = 0;
        for (int i : nilai) {
            total+=i;
        }

        return total/nilai.length;
    }
    
}
