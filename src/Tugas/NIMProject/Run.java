package Tugas.NIMProject;

import java.util.Scanner;
public class Run {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();

        MainNIM objectNim = new MainNIM();
        objectNim.setNim(nim);

        System.out.println("Nama Mahasiswa = "+nama);
        System.out.println("Jenjang Pendidikan = "+objectNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk = "+objectNim.getTahunMasuk());
        System.out.println("Fakultas = "+objectNim.getFakultas());
        System.out.println("Jurusan = "+objectNim.getJurusan());
        System.out.println("Jenis Kelamin = "+objectNim.getJenisKelamin());
        System.out.println("Nomor Urut = "+objectNim.getNomorUrut());


    }
}
