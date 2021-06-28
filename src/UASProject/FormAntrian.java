package UASProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class FormAntrian {

    public JPanel getPanel;
    private JButton tambahAntrianButton;
    private JTextArea daftarAntrian;
    private JButton prosesButton;
    private JLabel banyakAntrian;
    private JLabel totalAntrian;
    private JTextArea daftarRiwayat;
    private JLabel panggilAntrian;
    private JButton selesaiButton;


    Queue<Object> antrian = new LinkedList<>(); //membuat objek antrian dengan linkedlist
    int nomor = 0; //inisialisasi nilai awal variabel nomor = 0

    private void tambahAntrian(){

        if (antrian.size() <= 4) {

            nomor++; //increment variabel nomor
            String antr = "Antrian " + nomor; //membuat variabel antr untuk menampung nama antrian
            antrian.add(antr); //menambahkan antrian dari variabel antr
            daftarAntrian.append(antr + "\n"); //rangkai variabel antr dengan enter
            daftarRiwayat.append(antr + " masuk antrian\n"); //rangkai variabel antr dengan " masuk antrian"

        }else if (antrian.size() > 4) {

            JOptionPane.showMessageDialog(getPanel,
                    "Antrian Penuh",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        }
        banyakAntrian.setText(String.valueOf(antrian.size())); //menampilkan banyak antrian pada daftar
        panggilAntrian.setText("" + antrian.peek()); //panggil antrian
        totalAntrian.setText("" + nomor); //menampilkan total antrian yang terjadi

    }

    private void prosesAntrian(){

        if(antrian.isEmpty()){
            JOptionPane.showMessageDialog(getPanel,
                    "Ambil nomor antrian terlebih dahulu!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }

        daftarAntrian.setText(""); // mengosongkan textarea list antrian
        daftarRiwayat.append((antrian.remove()) + " keluar antrian\n"); //remove antrian teratas dan menampilkan riwayat
        antrian.forEach((Object element) -> { //menggunakan perulangan untuk menampilkan daftar sisa antrian
            daftarAntrian.append("" + element + "\n"); // print semua antrian ke textarea list
            banyakAntrian.setText(String.valueOf(antrian.size())); //print banyak antrian setelah diproses
        });

        if(antrian.size() == 0) {
            banyakAntrian.setText("0");
        }

        if(antrian.isEmpty()){
            panggilAntrian.setText("-----");
        }else{
            panggilAntrian.setText(""+antrian.peek());
        }

    }

    public FormAntrian() {

        banyakAntrian.setText("0");
        totalAntrian.setText("0");
        panggilAntrian.setText("-----");

        tambahAntrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahAntrian();
            }
        });

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesAntrian();
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
        return getPanel;
    }

}
