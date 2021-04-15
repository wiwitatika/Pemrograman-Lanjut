package Tugas.NIMProject;

public class MainNIM {

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan(){
        char KodeJP = nim.charAt(0);

        if(KodeJP == '1'){
            return "S1 (Sarjana)";
        }else if(KodeJP == '2'){
            return "S2 (Magister)";
        }else if(KodeJP == '3'){
            return "S3 (Doktor)";
        }
        return "Tidak diketahui";
    }

    public String getTahunMasuk(){
        char Kode1 = nim.charAt(1);
        char Kode2 = nim.charAt(2);

        return "20" + Kode1 + Kode2;
    }

    public String getFakultas(){
        char KodeF = nim.charAt(3);

        if(KodeF == '1'){
            return "Tarbiyah dan Keguruan";
        }else if(KodeF == '2'){
            return "Syari'ah dan Hukum";
        }else if(KodeF == '3'){
            return "Ushuluddin";
        }else if(KodeF == '4'){
            return "Dakwah dan Komunikasi";
        }else if(KodeF == '5'){
            return "Sains dan Teknologi";
        }else if(KodeF == '6'){
            return "Psikologi";
        }else if(KodeF == '7'){
            return "Ekonomi dan Ilmu Sosial";
        }else if(KodeF == '8'){
            return "Pertanian dan Peternakan";
        }
        return "Tidak diketahui";
    }

    public String getJurusan(){
        char KodeJ1 = nim.charAt(4);
        char KodeJ2 = nim.charAt(5);


        if(KodeJ1 == '0' && KodeJ2 == '1'){
            return "Teknik Informatika";
        }else if(KodeJ1 == '0' && KodeJ2 == '2'){
            return "Teknik Industri";
        }else if(KodeJ1 == '0' && KodeJ2 == '3'){
            return "Sistem Informasi";
        }else if(KodeJ1 == '0' && KodeJ2 == '4'){
            return "Matematika";
        }else if(KodeJ1 == '0' && KodeJ2 == '5'){
            return "Teknik Elektro";
        }
        return "Tidak diketahui";
    }

    public String getJenisKelamin(){
        char KodeJK = nim.charAt(6);

        if(KodeJK == '1'){
            return "Laki-laki";
        }else if(KodeJK == '2'){
            return "Perempuan";
        }
        return "Tidak diketahui";
    }

    public String getNomorUrut(){
        char No1 = nim.charAt(7);
        char No2 = nim.charAt(8);
        char No3 = nim.charAt(9);
        char No4 = nim.charAt(10);

        return "" + No1 + No2 + No3 + No4;
    }

}
