/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author aluno
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btDadosMenu = new javax.swing.JButton();
        btVeiculoMenu = new javax.swing.JButton();
        btVeiculoMenu1 = new javax.swing.JButton();
        btVeiculoMenu2 = new javax.swing.JButton();
        btVeiculoMenu3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btDadosMenu.setText("Menu Dados Cliente");
        btDadosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDadosMenuActionPerformed(evt);
            }
        });

        btVeiculoMenu.setText("Menu Registro Serviço");
        btVeiculoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculoMenuActionPerformed(evt);
            }
        });

        btVeiculoMenu1.setText("Menu Registro Veiculo");
        btVeiculoMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculoMenu1ActionPerformed(evt);
            }
        });

        btVeiculoMenu2.setText("Menu Registro Peças");
        btVeiculoMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculoMenu2ActionPerformed(evt);
            }
        });

        btVeiculoMenu3.setText("Relatorio");
        btVeiculoMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculoMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btVeiculoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVeiculoMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btVeiculoMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDadosMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVeiculoMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btDadosMenu)
                .addGap(18, 18, 18)
                .addComponent(btVeiculoMenu1)
                .addGap(16, 16, 16)
                .addComponent(btVeiculoMenu)
                .addGap(18, 18, 18)
                .addComponent(btVeiculoMenu2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVeiculoMenu3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDadosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadosMenuActionPerformed
        dispose();
        FrameDados fd = new FrameDados();
        fd.setVisible(true);
    }//GEN-LAST:event_btDadosMenuActionPerformed

    private void btVeiculoMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculoMenu1ActionPerformed
        dispose();
        FrameRegistroVeiculo frv = new FrameRegistroVeiculo();
        frv.setVisible(true);
    }//GEN-LAST:event_btVeiculoMenu1ActionPerformed

    private void btVeiculoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculoMenuActionPerformed
        dispose();
        FrameRegistroServico frs = new FrameRegistroServico();
        frs.setVisible(true);
    }//GEN-LAST:event_btVeiculoMenuActionPerformed

    private void btVeiculoMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculoMenu2ActionPerformed
        dispose();
        FrameRegistroPecas frp = new FrameRegistroPecas();
        frp.setVisible(true);
    }//GEN-LAST:event_btVeiculoMenu2ActionPerformed

    private void btVeiculoMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculoMenu3ActionPerformed
        dispose();
        FrameRelatorio fr = new FrameRelatorio();
        fr.setVisible(true);
    }//GEN-LAST:event_btVeiculoMenu3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDadosMenu;
    private javax.swing.JButton btVeiculoMenu;
    private javax.swing.JButton btVeiculoMenu1;
    private javax.swing.JButton btVeiculoMenu2;
    private javax.swing.JButton btVeiculoMenu3;
    // End of variables declaration//GEN-END:variables
}
