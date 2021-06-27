package JavaGUI.Sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSorting {
    private JTextField element;
    private JButton generateButton;
    private JTable output;
    private JButton sortingButton;
    private JTable outputSorting;
    private JPanel Panel;
    private JLabel outputRandom;
    private JTextArea textArea;
    private DefaultTableModel tableModel;
    private boolean added = false;


    public FormSorting() {
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Mengambil data element
                int banyakElement = Integer.parseInt(element.getText());


                //Proses (aksi)
                FormSorting elm = new FormSorting();
                elm.setElement(banyakElement);

                int[] deretArray = new int[banyakElement];

                for (int i = 0; i < banyakElement; i++) {
                    deretArray[i] = (int) (Math.random() * 100);
                    //outputRandom.setText(deretArray);

                    String gabung = "";
                    for (int j = 0; j < deretArray.length; j++) {
                        gabung += deretArray[i];
                        System.out.println(gabung);
                        //outputRandom.setText(deretArray);
                    }
                }


                //Menampilkan output ke layar form
                //outputRandom.setText(String.valueOf(deretArray));
                //System.out.println(deretArray[i]);

            }
        });
    }

    private void setElement(int banyakElement) {
    }

    public JPanel getPanel() {

        return Panel;
    }

}
