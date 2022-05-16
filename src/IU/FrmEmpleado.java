package IU;

import BEAN.AFP;
import BEAN.Empleado;
import DAO.AFPDAO;
import DAO.EmpleadoDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class FrmEmpleado extends javax.swing.JFrame {
    DefaultTableModel dtm = null;
    EmpleadoDAO empDAO;
    AFPDAO afpDao;
    int idE;
    public FrmEmpleado() {
        initComponents();
        empDAO = new EmpleadoDAO();
        afpDao = new AFPDAO();
        
        dtm = (DefaultTableModel)this.tblEmpleado.getModel();
        llenaEmpleado(false, "");
        llenaAFP();
    }
    private void llenaAFP(){
        Vector<AFP> lista = afpDao.listaAfp(false, "");
        this.cmbAfp.addItem("");
        for(int i=0;i<lista.size();i++){
            this.cmbAfp.addItem(lista.get(i).getNombAfp());
        }
    }
    private void llenaEmpleado(boolean sw, String cad){
        Vector<Empleado> lista = empDAO.listEmp(sw, cad);
        System.out.println("Hola "+lista.size());
        for(int i=0; i<lista.size();i++){
            Vector vec = new Vector();
            vec.addElement(lista.get(i).getId_Empleado());
            vec.addElement(lista.get(i).getApellidos());
            vec.addElement(lista.get(i).getSexo());
            vec.addElement(lista.get(i).getConSeg());
            vec.addElement(lista.get(i).getNumSeg());
            vec.addElement(lista.get(i).getSecun());
            vec.addElement(lista.get(i).getTec());
            vec.addElement(lista.get(i).getUniv());
            vec.addElement(lista.get(i).getAfp());
            vec.addElement(lista.get(i).getEstado());
            dtm.addRow(vec);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        chbConSeg = new javax.swing.JCheckBox();
        txtNumSeg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        chbSecundaria = new javax.swing.JCheckBox();
        chbTecnico = new javax.swing.JCheckBox();
        chbUniversitario = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAfp = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        btnGrabar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MANTENIMIENTO EMPLEADO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 20, 250, 22);

        jPanel1.setLayout(null);

        jLabel1.setText("Busqueda");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 14);
        jPanel1.add(txtBusqueda);
        txtBusqueda.setBounds(90, 20, 350, 20);

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Empleado", "Apellidos", "Sexo", "Con Seg", "Num Seg", "Secun", "Tec", "Univ", "AFP", "Estado"
            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 440, 260);

        jTabbedPane1.addTab("Búsqueda", jPanel1);

        jPanel2.setLayout(null);

        jLabel3.setText("Id_Empleado");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 90, 14);

        txtIdEmpleado.setEditable(false);
        jPanel2.add(txtIdEmpleado);
        txtIdEmpleado.setBounds(110, 20, 110, 20);

        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 50, 60, 14);
        jPanel2.add(txtApellidos);
        txtApellidos.setBounds(110, 50, 330, 20);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));
        jPanel3.setLayout(null);

        buttonGroup1.add(rbFemenino);
        rbFemenino.setText("Femenino");
        jPanel3.add(rbFemenino);
        rbFemenino.setBounds(50, 20, 95, 23);

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");
        jPanel3.add(rbMasculino);
        rbMasculino.setBounds(200, 20, 73, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 90, 420, 60);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguro"));
        jPanel4.setLayout(null);

        chbConSeg.setText("Con seguro");
        jPanel4.add(chbConSeg);
        chbConSeg.setBounds(10, 20, 81, 23);
        jPanel4.add(txtNumSeg);
        txtNumSeg.setBounds(260, 20, 140, 20);

        jLabel5.setText("Número seguro");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(160, 20, 90, 14);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 160, 410, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTUDIOS"));
        jPanel5.setLayout(null);

        chbSecundaria.setText("Secundaria");
        jPanel5.add(chbSecundaria);
        chbSecundaria.setBounds(10, 20, 79, 23);

        chbTecnico.setText("Técnico");
        jPanel5.add(chbTecnico);
        chbTecnico.setBounds(160, 20, 81, 23);

        chbUniversitario.setText("Universitario");
        jPanel5.add(chbUniversitario);
        chbUniversitario.setBounds(290, 20, 87, 23);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(20, 230, 420, 60);

        jLabel6.setText("AFP");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 300, 35, 14);

        jLabel7.setText("Estado");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 340, 35, 14);

        jPanel2.add(cmbAfp);
        cmbAfp.setBounds(90, 300, 170, 22);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo" }));
        jPanel2.add(cmbEstado);
        cmbEstado.setBounds(90, 340, 170, 20);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar);
        btnGrabar.setBounds(60, 380, 130, 23);

        btnLimpiar.setText("Limpiar");
        jPanel2.add(btnLimpiar);
        btnLimpiar.setBounds(260, 380, 150, 23);

        jTabbedPane1.addTab("Mantenimiento", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 70, 470, 450);

        btnSalir.setText("Salir");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(343, 550, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        EmpleadoDAO empDAO = new EmpleadoDAO();
        util u = new util();
        int s;
        Empleado emp;
        emp = new Empleado();
        emp.setApellidos(this.txtApellidos.getText());
        if(this.rbFemenino.isSelected()){
            s = 0;
        }else{
            s = 1;
        }
        emp.setSexo(s);
        if(this.chbConSeg.isSelected()){
            emp.setConSeg(1);
            emp.setNumSeg(Integer.parseInt(this.txtNumSeg.getText()));
        }else{
            emp.setConSeg(0);
            emp.setNumSeg(0);
        }
        if(this.chbSecundaria.isSelected()){
            emp.setSecun(1);
        }else{
            emp.setSecun(0);
        }
        if(this.chbTecnico.isSelected()){
            emp.setTec(1);
        }else{
            emp.setTec(0);
        }
        if(this.chbUniversitario.isSelected()){
            emp.setUniv(1);
        }else{
            emp.setUniv(0);
        }
        if(!this.cmbAfp.getSelectedItem().toString().isEmpty()){
            int idafp;
            String nafp = cmbAfp.getSelectedItem().toString();
            idafp = u.idExp("AFP", "Id_Afp", "nombAfp", nafp);
            emp.setAfp(idafp);
        }
        emp.setEstado(1);
        if(this.btnGrabar.getText().equals("Grabar")){
            this.idE = u.idNext("Empleado", "Id_Empleado");
            emp.setId_Empleado(idE);
            empDAO.insUpd("insert", emp);
        }else if(this.btnGrabar.getText().equals("Actualizar")){
            empDAO.insUpd("update", emp);
        }
        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        llenaModifica();
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    public void llenaModifica(){
        int fila;
        fila = this.tblEmpleado.getSelectedRow();
        this.idE = Integer.parseInt(dtm.getValueAt(fila, 0).toString());
        this.txtIdEmpleado.setText(String.valueOf(idE));
        this.txtApellidos.setText(dtm.getValueAt(fila, 1).toString());
        if(Integer.parseInt(dtm.getValueAt(fila, 2).toString())==1){
            this.rbMasculino.setSelected(true);
        }else{
            this.rbFemenino.setSelected(true);
        }
        if(Integer.parseInt(dtm.getValueAt(fila, 3).toString())==1){
            this.chbConSeg.setSelected(true);
            this.txtNumSeg.setText(dtm.getValueAt(fila, 4).toString());
        }else{
            this.chbConSeg.setSelected(false);
            this.txtNumSeg.setText("");
        }
        if(Integer.parseInt(dtm.getValueAt(fila, 5).toString())==1){
            this.chbSecundaria.setSelected(true);
        }else{
            this.chbSecundaria.setSelected(false);
        }
        if(Integer.parseInt(dtm.getValueAt(fila, 6).toString())==1){
            this.chbTecnico.setSelected(true);
        }else{
            this.chbTecnico.setSelected(false);
        }
        if(Integer.parseInt(dtm.getValueAt(fila, 7).toString())==1){
            this.chbUniversitario.setSelected(true);
        }else{
            this.chbUniversitario.setSelected(false);
        }
        
        this.btnGrabar.setText("Actualizar");
        this.jTabbedPane1.setSelectedIndex(1);
        
        
        
        
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbConSeg;
    private javax.swing.JCheckBox chbSecundaria;
    private javax.swing.JCheckBox chbTecnico;
    private javax.swing.JCheckBox chbUniversitario;
    private javax.swing.JComboBox<String> cmbAfp;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNumSeg;
    // End of variables declaration//GEN-END:variables
}
