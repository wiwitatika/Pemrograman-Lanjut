package JavaGUI;

import javax.swing.*;

public class RunFormIdentifikasi {

    public static void main(String[] args) {

        JFrame JFrame = new JFrame("Form Identifikasi NIM");
        JFrame.setContentPane(new FormIdentifikasiNIM().getPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,700);
        JFrame.setVisible(true);

    }

}
