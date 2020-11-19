/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan52.siapakamu;

/**
 *Nama  : MIA AISYAH F
 *Kelas : PBO2
 *NIM   : 10116415
 *Deskripsi Program: program ini berisi program yang menampilkan informasi 
 *                   dosen dan mahasiswa
 */
public class PBO210116415Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10116415");
        mahasiswa.setNama("MIA AISYAH");
        mahasiswa.setUmur(23);
        mahasiswa.setKelas("PBO2");

        System.out.println("\nNIP MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}