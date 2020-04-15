
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pc
 */
public class hati extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Object MessageBox;

    public hati() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hatti.png")));
        this.setLocationRelativeTo(null);

    }

    String insv;
    String outsv;
    int er = 0;

    String qwe;
    String qwe1; // работа с reclament
    String qwe2;

    String sav;

    String[] rus = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в",
        "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ё", "?", "ё", "э"};
    String[] use = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "a", "s", "d", "f", "g", "h", "j",
        "k", "l", ";", "'", "z", "x", "c", "v", "b", "n", "m", ",", ".", "`", "&", "~", "\""};
    String[] ruse = {"й?", "ц?", "у?", "к?", "е?", "н?", "г?", "ш?", "щ?", "з?", "х?", "ъ?", "ф?", "ы?", "в?", "а?", "п?",
        "р?", "о?", "л?", "д?", "ж?", "э?", "я?", "ч?", "с?", "м?", "и?", "т?", "ь?", "б?", "ю?", "ё?"};
    String[] user = {"й(,)", "ц(,)", "у(,)", "к(,)", "е(,)", "н(,)", "г(,)", "ш(,)", "щ(,)", "з(,)", "х(,)", "ъ(,)",
        "ф(,)", "ы(,)", "в(,)", "а(,)", "п(,)", "р(,)", "о(,)", "л(,)", "д(,)", "ж(,)", "э(,)", "я(,)", "ч(,)", "с(,)",
        "м(,)", "и(,)", "т(,)", "ь(,)", "б(,)", "ю(,)", "ё(,)"};
    String[] punct = {".", "?", "!", "...", ",", ";", ":", "-"};

    @SuppressWarnings({"unchecked", "deprecation"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("One Hatti");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 210));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(25, 118, 210));

        jTextArea1.setBackground(new java.awt.Color(0, 176, 255));
        jTextArea1.setColumns(30);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextArea1.setMaximumSize(new java.awt.Dimension(2147483647, 400));
        jTextArea1.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Make");

        jMenuItem4.setText("Open File");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Save File");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Quick editing");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Replacement");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Other");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Dark team");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        insv = jTextArea1.getText();
        insv = insv.toLowerCase();

        if (insv == null) {

        } else {
            for (int i = 0; i < 36; i++) {
                outsv = insv.replace(use[i], rus[i]);
                insv = outsv;
                jTextArea1.setText(outsv);
            }

            for (int e = 0; e < 33; e++) {
                outsv = insv.replace(ruse[e], user[e]);
                insv = outsv;
                outsv = insv.replace("(,)", ", ");
                jTextArea1.setText(outsv);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        parser();
        jTextArea1.setText(insv);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (er == 0) {
            jPanel1.setBackground(new Color(38, 50, 56));
            jScrollPane3.setBackground(Color.red);
            jTextArea1.setBackground(new Color(55, 71, 79));
            jTextArea1.setForeground(Color.GREEN);
            er++;
        } else {
            jPanel1.setBackground(new Color(25, 118, 210));
            jScrollPane3.setBackground(new Color(25, 118, 210));
            jTextArea1.setBackground(new Color(0, 176, 255));
            jTextArea1.setForeground(new Color(240, 240, 240));
            er--;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            txt();
        } catch (IOException ex) {

        } catch (InterruptedException ex) {
            Logger.getLogger(hati.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        txt_save();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new hati().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void txt_save() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "Text File");
        fc.setFileFilter(filter);
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ret = jTextArea1.getText();
            File fi = fc.getSelectedFile();
            try (FileWriter fw = new FileWriter(fc.getSelectedFile() + ".txt")) {
                fw.write(ret);
                fw.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void txt() throws FileNotFoundException, IOException, InterruptedException {
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "TXT", "txt");
        fileopen.setFileFilter(filter);
        int ret = fileopen.showDialog(null, "Open File");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            String wert = "";
            try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                for (String line; (line = br.readLine()) != null;) {
                    wert = wert + line + "\n";
                }
                br.close();
                jTextArea1.setText(wert);
                System.gc();
            }

        }

    }

    private void parser() {
        insv = jTextArea1.getText();
        sav = insv;
        System.gc();

        try {
            int index1 = sav.indexOf("<r@");
            int index2 = sav.indexOf("@end>");

            qwe = sav.substring(index1 + 3, index2); //замена
            qwe = qwe.replace("-", " ");
            int index3 = qwe.indexOf(" ");
            qwe1 = qwe.substring(0, index3);
            qwe2 = qwe.replace(qwe1, "");
            qwe2 = qwe2.trim();
            insv = sav.replace(qwe1, qwe2);

        } catch (Exception e) {

        }

        try {
            int ex1 = insv.indexOf("</");
            int ex2 = insv.indexOf("/>");

            qwe = insv.substring(ex1 + 2, ex2); //вырезать
            insv = insv.replace(qwe, "");

        } catch (Exception e) {
        }

        try {
            for (String punct1 : punct) {
                insv = insv.replace(punct1, punct1 + " "); //отступы
            }
            insv = insv.replace("  ", " ");
        } catch (Exception e) {
        }
        try {
            int sch = insv.indexOf("~%");
            int sch1 = insv.indexOf("%~", sch);

            qwe = insv.substring(sch + 2, sch1);
            int blockCount = insv.split(qwe).length - 1;
            JOptionPane.showMessageDialog(null, blockCount + " words / symbols in text", "Mentions", JOptionPane.DEFAULT_OPTION);
        } catch (HeadlessException e) {

        }
    }

    private void photo() {

    }
}
