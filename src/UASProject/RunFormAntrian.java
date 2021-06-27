package UASProject;

import GUISorting.FormSorting;

import javax.swing.*;

public class RunFormAntrian {

    public static void main(String[] args) {

        JFrame JFrame = new JFrame("Form Antrian");
        JFrame.setContentPane(new FormAntrian().getPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,650);
        JFrame.setVisible(true);

    }

}
