package JavaGUI;

import Tugas.NIMProject.MainNIM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class FormIdentifikasiNIM {
    private JPanel Panel;
    private JTextField valueNIM;
    private JTextField valueNama;
    private JButton cekButton;
    private JButton selesaiButton;
    private JTextArea valueHasil;
    private JLabel judulForm;

    public FormIdentifikasiNIM() {
        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Mengambil data dari valueNama
                String nama = valueNama.getText();

                //Mengambil data dari valueNIM
                String nim = valueNIM.getText();

                //Proses (aksi)
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                //Menampilkan output ke layar form
                valueHasil.setMargin(new Insets(20,10,10,10));
                valueHasil.setText("Nama\t\t: " +mhs.getNama() +"\n" +
                        "NIM\t\t: " +mhs.getNim() +"\n" +
                        "Jenjang Pendidikan\t: " +mhs.getJenjangPendidikan() +"\n" +
                        "Tahun Masuk\t\t: " +mhs.getTahunMasuk() +"\n" +
                        "Fakultas\t\t: " +mhs.getFakultas() +"\n" +
                        "Jurusan\t\t: " +mhs.getJurusan() +"\n" +
                        "Jenis Kelamin\t\t: " +mhs.getJenisKelamin() +"\n" +
                        "Nomor Urut\t\t: " +mhs.getNomorUrut() +"\n"
                );
            }
        });

        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }

    public JPanel getPanel() {
        return Panel;
    }
}
