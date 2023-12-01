package TrabalhoRenataCarros;

public class FormMenu extends javax.swing.JFrame {
    private CadCarro cad;

    public FormMenu() {
        initComponents();
        setLocationRelativeTo(null); //centraliza o formulario na tela 
        this.cad = new CadCarro();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        mItemInserir = new javax.swing.JMenuItem();
        mItemAlterar = new javax.swing.JMenuItem();
        mItemExcluir = new javax.swing.JMenuItem();
        mPesquisar = new javax.swing.JMenu();
        mItemPesquisar = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mCadastro.setText("Cadastro");

        mItemInserir.setText("Inserir");
        mItemInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemInserirActionPerformed(evt);
            }
        });
        mCadastro.add(mItemInserir);

        mItemAlterar.setText("Alterar");
        mItemAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAlterarActionPerformed(evt);
            }
        });
        mCadastro.add(mItemAlterar);

        mItemExcluir.setText("Excluir");
        mItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemExcluirActionPerformed(evt);
            }
        });
        mCadastro.add(mItemExcluir);

        jMenuBar1.add(mCadastro);

        mPesquisar.setText("Pesquisar");

        mItemPesquisar.setText("Pesquisar Carro");
        mItemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPesquisarActionPerformed(evt);
            }
        });
        mPesquisar.add(mItemPesquisar);

        jMenuBar1.add(mPesquisar);

        mSair.setText("Sair");

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        mSair.add(mItemSair);

        jMenuBar1.add(mSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemInserirActionPerformed
        new FormCadastro(this.cad).setVisible(true);
    }//GEN-LAST:event_mItemInserirActionPerformed

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void mItemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPesquisarActionPerformed
        new FormPesquisar(this.cad).setVisible(true);
    }//GEN-LAST:event_mItemPesquisarActionPerformed

    private void mItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemExcluirActionPerformed
        new FormRemover(this.cad).setVisible(true);
    }//GEN-LAST:event_mItemExcluirActionPerformed

    private void mItemAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAlterarActionPerformed
        new FormAlterar(this.cad).setVisible(true);
    }//GEN-LAST:event_mItemAlterarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenuItem mItemAlterar;
    private javax.swing.JMenuItem mItemExcluir;
    private javax.swing.JMenuItem mItemInserir;
    private javax.swing.JMenuItem mItemPesquisar;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JMenu mPesquisar;
    private javax.swing.JMenu mSair;
    // End of variables declaration//GEN-END:variables
}
