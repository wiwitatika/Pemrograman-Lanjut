package JavaGUI.Sorting;

import JavaGUI.FormIdentifikasiNIM;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {

        JFrame JFrame = new JFrame("Form Sorting");
        JFrame.setContentPane(new FormSorting().getPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,700);
        JFrame.setVisible(true);

    }
}
