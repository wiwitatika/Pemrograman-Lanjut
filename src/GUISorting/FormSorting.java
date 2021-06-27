package GUISorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSorting {

    private JPanel rootPanel;
    private JTextField valueArray;
    private JButton ascButton;
    private JTable outputTable;
    private JButton descButton;
    private JLabel judulUrutan;
    private JButton selesaiButton;
    private DefaultTableModel tableModel;
    private boolean add = false;


    public JPanel getRootPanel() {

        return rootPanel;
    }

    private void initComponents() {
        Object[] tableColumn = {
                "Urutan Angka"
        };
        Object[][] initData = {
        };
        //set table model
        tableModel = new DefaultTableModel(initData, tableColumn);
        outputTable.setModel(tableModel);
        //menampilkan sorting di setiap colom
        outputTable.setAutoCreateRowSorter(false);
        // enable single selection
        outputTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public FormSorting() {

        this.initComponents();
        ascButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                judulUrutan.setText("Data Diurutkan Secara Ascending");
                DefaultTableModel tableModel = (DefaultTableModel) outputTable.getModel();
                String[] deretAngka = valueArray.getText().split( ", *" );
                int[] banyakElement = new int[deretAngka.length];
                if(valueArray.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum diisi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }

                if (!add) {
                    for (int i = 0; i < deretAngka.length; i++) {
                        tableModel.addRow(new Object[]{});
                    }
                    add = true;
                }
                int asc = 0;
                for (int i : Sorting.getAsc(deretAngka, deretAngka.length)){
                    tableModel.setValueAt(i, asc, 0);
                    asc++;
                }
            }
        });

        descButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                judulUrutan.setText("Data Diurutkan Secara Descending");
                DefaultTableModel tableModel = (DefaultTableModel) outputTable.getModel();
                String[] deretAngka = valueArray.getText().split( ", *" );
                int[] banyakElement = new int[deretAngka.length];

                if(valueArray.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum diisi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }

                if (!add) {
                    for (int i = 0; i < deretAngka.length; i++) {
                        tableModel.addRow(new Object[]{});
                    }
                    add = true;
                }
                int desc = 0;
                for (int i : Sorting.getDesc(deretAngka, deretAngka.length)) {
                    tableModel.setValueAt(i, desc, 0);
                    desc++;
                }
            }
        });

        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);


            }
        });
    }
}
