package GUISorting;

import JavaGUI.FormIdentifikasiNIM;

import javax.swing.*;

public class RunSorting {

    public static void main(String[] args) {

        JFrame JFrame = new JFrame("Form Pengurutan Angka");
        JFrame.setContentPane(new FormSorting().getRootPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(450,600);
        JFrame.setVisible(true);

    }

}
