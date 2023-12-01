/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TrabalhoRenataCarros;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;

public class FormAlterar extends javax.swing.JFrame {
    
    private CadCarro cad;
    private DefaultListModel<String> modelosListModel;

    public FormAlterar(CadCarro cad) {
        initComponents();
        setLocationRelativeTo(null);
        this.cad = cad;
        this.msgEvent.setVisible(false);
        
        // Inicializa o modelo da JList
        modelosListModel = new DefaultListModel<>();
        listModelos.setModel(modelosListModel);

        // Preenche a JList com os modelos de carros cadastrados
        atualizarListaModelos();
        
        checkAlterar.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Habilita ou desabilita o botão com base no estado da JCheckBox
                btnAlterar.setEnabled(checkAlterar.isSelected());
            }
        });

        // Define o estado inicial do botão com base na JCheckBox
        btnAlterar.setEnabled(checkAlterar.isSelected());
    }


    private void atualizarListaModelos() {
        // Limpa o modelo da JList antes de adicionar novos modelos
        modelosListModel.clear();

        // Adiciona os modelos de carros cadastrados
        for (Carro carro : cad.getCarros()) {
            modelosListModel.addElement(carro.getModelo());
        }
    }
    
    private void exibirInformacoesCarro(Carro carro) {
        // Atualize a interface com as informações do carro
        // Este método deve ser adaptado conforme necessário
        txtMarca.setText(carro.getMarca());
        txtModelo.setText(carro.getModelo());
        txtAnoModelo.setText(carro.getAnoModelo());
        txtCor.setText(carro.getCor());
        txtPlaca.setText(carro.getPlaca());
        // Verifica o tipo de transmissão e seleciona o correspondente JRadioButton
    if (carro.getTpTransmissao().equalsIgnoreCase("Manual")) {
        rdoManual.setSelected(true);
        rdoAutomatico.setSelected(false);
    } else {
        rdoManual.setSelected(false);
        rdoAutomatico.setSelected(true);
    }

    // Seleciona a opção correspondente na JComboBox
    boxCombustivel.setSelectedItem(carro.getTpCombustivel());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoBtnGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listModelos = new javax.swing.JList<>();
        msgEvent = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        checkAlterar = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnoModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        rdoManual = new javax.swing.JRadioButton();
        rdoAutomatico = new javax.swing.JRadioButton();
        boxCombustivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listModelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listModelos);

        msgEvent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msgEvent.setText("#EventMsg");

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        checkAlterar.setText("Atenção! Certifique-se de revisar cuidadosamente as informações antes de confirmar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ALTERAR CADASTRO");

        jLabel2.setText("Modelos Cadastrados");

        jLabel3.setText("MARCA:");

        jLabel4.setText("MODELO:");

        jLabel5.setText("COR:");

        jLabel6.setText("ANO MODELO:");

        jLabel7.setText("PLACA:");

        jLabel8.setText("TIPO TRANSMISSAO");

        jLabel9.setText("COMBUSTIVEL");

        rdoBtnGroup.add(rdoManual);
        rdoManual.setText("MANUAL");
        rdoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoManualActionPerformed(evt);
            }
        });

        rdoBtnGroup.add(rdoAutomatico);
        rdoAutomatico.setText("AUTOMATICO");

        boxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GASOLINA", "DIESEL", "GNV", "FLEX" }));
        boxCombustivel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 579, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkAlterar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(msgEvent)
                                        .addGap(194, 194, 194)
                                        .addComponent(btnVoltar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAlterar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(rdoManual)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoAutomatico))
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                            .addComponent(txtAnoModelo)
                                            .addComponent(txtModelo)
                                            .addComponent(txtMarca)
                                            .addComponent(txtCor)))
                                    .addComponent(boxCombustivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(83, 83, 83))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoManual)
                    .addComponent(rdoAutomatico))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(checkAlterar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlterar)
                    .addComponent(msgEvent))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    cad.alterarCarro(txtModelo.getText().toUpperCase(), txtMarca.getText().toUpperCase(), txtAnoModelo.getText().toUpperCase(),
                     txtCor.getText().toUpperCase(), txtPlaca.getText().toUpperCase(),
                     rdoManual.isSelected() ? "Manual" : "Automático",
                     boxCombustivel.getSelectedItem().toString());
    this.msgEvent.setText("Cadastro Alterado Com sucesso!");
    this.msgEvent.setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void rdoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoManualActionPerformed

    private void listModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listModelosMouseClicked
        // Verifica se foi um clique duplo (BUTTON1 é o botão esquerdo do mouse)
    if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
        // Obtém o modelo selecionado na JList
        String modeloSelecionado = listModelos.getSelectedValue();

        if (modeloSelecionado != null) {
            // Utiliza o modeloSelecionado para recuperar o objeto Carro correspondente
            Carro carroSelecionado = cad.pesquisarCarro(modeloSelecionado);

            // Preenche os campos de texto com as informações do carro selecionado
            exibirInformacoesCarro(carroSelecionado);}}
    }//GEN-LAST:event_listModelosMouseClicked


    
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
            java.util.logging.Logger.getLogger(FormAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCombustivel;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listModelos;
    private javax.swing.JLabel msgEvent;
    private javax.swing.JRadioButton rdoAutomatico;
    private javax.swing.ButtonGroup rdoBtnGroup;
    private javax.swing.JRadioButton rdoManual;
    private javax.swing.JTextField txtAnoModelo;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
