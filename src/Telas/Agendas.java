package Telas;


import com.github.lgooddatepicker.components.DatePickerSettings;
import static java.awt.Color.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author blz
 */
public class Agendas extends javax.swing.JFrame {

    /**
     * Creates new form Agendar
     */
    public Agendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePickerSettings1 = new com.github.lgooddatepicker.components.DatePickerSettings();
        datePickerSettings2 = new com.github.lgooddatepicker.components.DatePickerSettings();
        jPanel1 = new javax.swing.JPanel();
        Apresentacao = new RoundedPanel(10, white);
        jLabel1 = new javax.swing.JLabel();
        lblEspecialidade = new javax.swing.JLabel();
        cbEspecialidade = new javax.swing.JComboBox<>();
        lblUnidade = new javax.swing.JLabel();
        cbUnidade = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        dataAgendamento = new com.github.lgooddatepicker.components.DatePicker();
        lblHorarios = new javax.swing.JLabel();
        horaAgendamento = new com.github.lgooddatepicker.components.TimePicker();
        lblPaciente = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        checkBoxTermos = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        lblTermos = new javax.swing.JLabel();

        datePickerSettings1.setVisiblePreviousMonthButton(false);
        datePickerSettings1.setVisiblePreviousYearButton(false);

        datePickerSettings2.setVisiblePreviousMonthButton(false);
        datePickerSettings2.setVisiblePreviousYearButton(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(1900, 23));

        jPanel1.setBackground(new java.awt.Color(0, 194, 203));

        Apresentacao.setPreferredSize(new java.awt.Dimension(245, 215));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel1.setText("<html><p style=\"text-align:center\">O agendamento de consultas é bem simples, você só precisa escolher a especialidade e verificar as datas disponíveis. Você pode escolher entre dois tipos de agendamento, por data mais próxima ou por clínica/posto de saúde mais próximo.</p></html>");

        javax.swing.GroupLayout ApresentacaoLayout = new javax.swing.GroupLayout(Apresentacao);
        Apresentacao.setLayout(ApresentacaoLayout);
        ApresentacaoLayout.setHorizontalGroup(
            ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        ApresentacaoLayout.setVerticalGroup(
            ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApresentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblEspecialidade.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        lblEspecialidade.setText("Especialidade *");

        cbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma especialidade", "Pediatria", "Otorrinolaringologia", "Psiquiatria", "Cardiologia" }));

        lblUnidade.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        lblUnidade.setText("Unidade de Saúde *");

        cbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma UBS", "UBS Aclimação", "UBS Grevíleas", "UBS Morangueira", "UBS Tuiuti" }));

        lblDate.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        lblDate.setText("Data *");

        DatePickerSettings settings = new DatePickerSettings();
        settings.setAllowEmptyDates(false);
        settings.setAllowKeyboardEditing(false);
        settings.setVisiblePreviousMonthButton(false);
        settings.setVisiblePreviousYearButton(false);
        dataAgendamento.setSettings(null);

        lblHorarios.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        lblHorarios.setText("Horário *");

        lblPaciente.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        lblPaciente.setText("Paciente");

        cbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um paciente", "Gabriel de Souza Carlesso", "Terry A. Davis", "Bruno Aiub" }));

        checkBoxTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTermosActionPerformed(evt);
            }
        });

        jButton1.setText("Realizar agendamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTermos.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        lblTermos.setText("<html><p>Estou ciente de que ao agendar uma consulta eu me comprometo a comparecer a ela na data escolhida e que o reagendamento ou cancelamento deve ser realizado até 48h antes da data da consulta.</p></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbEspecialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Apresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(cbUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horaAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPaciente)
                    .addComponent(lblHorarios)
                    .addComponent(lblDate)
                    .addComponent(lblUnidade)
                    .addComponent(lblEspecialidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkBoxTermos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTermos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Apresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUnidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHorarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(checkBoxTermos)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTermos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTermosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxTermosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean erro = false;
        String retorno = "";
        if(cbPaciente.getSelectedIndex() == 0){
            retorno += "\nSelecione um paciente!";
            erro = true;
        }
        if(cbEspecialidade.getSelectedIndex() == 0){
            retorno += "\nSelecione uma especialidade!";
            erro = true;
        }
        if(cbUnidade.getSelectedIndex() == 0){
            retorno += "\nSelecione uma unidade de saúde!";
            erro = true;
        }
        try{
            if(!(dataAgendamento.getDate().isAfter(java.time.LocalDate.now()) ||
                dataAgendamento.getDate().equals(java.time.LocalDate.now()))){
                    throw new Exception("Data invalida");
            }
        } catch (Exception e){
            erro = true;
            retorno += "\nSelecione uma data válida!";
        }
        try{
            if(dataAgendamento.getDate().equals(java.time.LocalDate.now()) && 
                    horaAgendamento.getTime().isBefore(java.time.LocalTime.now())){
                        throw new Exception("Horário inválido!");
            }
        } catch (Exception e){
            erro = true;
            retorno += "\nSelecione um horário válido!";
        }
        if(!checkBoxTermos.isSelected()){
            erro = true;
            retorno += "\nOs termos do agendamento devem ser aceitos para que o agendamento seja realizado.";
        }
        if(retorno.equals("")){
            retorno = "Agendamento realizado com sucesso!";
        }
        
        if(erro){
            JOptionPane.showMessageDialog(null, retorno, "Erro ao agendar", 0);
        }else{
            JOptionPane.showMessageDialog(null, retorno, "Agendamento realizado", 1);
            
            Consultas agendaVolta = new Consultas();
            this.dispose();
            agendaVolta.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Agendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Agendas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Apresentacao;
    private javax.swing.JComboBox<String> cbEspecialidade;
    private javax.swing.JComboBox<String> cbPaciente;
    private javax.swing.JComboBox<String> cbUnidade;
    private javax.swing.JCheckBox checkBoxTermos;
    private com.github.lgooddatepicker.components.DatePicker dataAgendamento;
    private com.github.lgooddatepicker.components.DatePickerSettings datePickerSettings1;
    private com.github.lgooddatepicker.components.DatePickerSettings datePickerSettings2;
    private com.github.lgooddatepicker.components.TimePicker horaAgendamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblHorarios;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblTermos;
    private javax.swing.JLabel lblUnidade;
    // End of variables declaration//GEN-END:variables
}