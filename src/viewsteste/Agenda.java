/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsteste;

/**
 *
 * @author vini
 */
public class Agenda extends javax.swing.JPanel {

    /**
     * Creates new form agenda
     */
    public Agenda() {
        initComponents();
        jpAgenda.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tConsultaAgenda1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tConsultaAgenda = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton24 = new javax.swing.JButton();
        jpAgenda = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setLayout(null);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Consulta", "Exame", "Cirúrgia" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox4);
        jComboBox4.setBounds(140, 30, 100, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Tipo");
        jLabel27.setMaximumSize(new java.awt.Dimension(34, 15));
        jLabel27.setMinimumSize(new java.awt.Dimension(34, 15));
        jLabel27.setName(""); // NOI18N
        jPanel7.add(jLabel27);
        jLabel27.setBounds(140, 10, 26, 15);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        jButton13.setText("Consultar");
        jButton13.setToolTipText("");
        jButton13.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13);
        jButton13.setBounds(130, 450, 120, 35);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        jButton17.setText("Excluir");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton17);
        jButton17.setBounds(260, 450, 110, 35);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton18.setText("Agendar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton18);
        jButton18.setBounds(10, 450, 110, 35);

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Mostrar Tudo");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox2);
        jCheckBox2.setBounds(260, 30, 90, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Data");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(10, 10, 40, 20);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton19.setText("Imprimir");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton19);
        jButton19.setBounds(500, 450, 120, 35);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Dr. Rafael", "Dr. Vinícius", "Dr.Isaque", "Dra.Fernanda" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox9);
        jComboBox9.setBounds(370, 30, 110, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Clinico Veterinário");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(370, 10, 110, 15);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        jButton23.setText("Historico");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton23);
        jButton23.setBounds(380, 450, 110, 35);
        jPanel7.add(jDateChooser4);
        jDateChooser4.setBounds(10, 30, 110, 20);

        tConsultaAgenda1.setBorder(new javax.swing.border.MatteBorder(null));
        tConsultaAgenda1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tConsultaAgenda1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10:00", "Dr. Edvaldo", "Joel Santana", "Afrix", "Consulta", "Cancelado"},
                {"13:30", "Dr. Rafael", "Adalberto Batista", "Rex", "Exame", "Realizado"},
                {"14:00", "Dra. Fernanda", "Juca Teles", "Bila", "Cirurgia", "Agendado"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HORA", "VETERINARIO", "PROPRIETÁRIO", "CLIENTE", "TIPO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tConsultaAgenda1);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(10, 60, 610, 380);

        jTabbedPane2.addTab("Agenda", jPanel7);

        setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Consulta", "Exame", "Cirúrgia" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1);
        jComboBox1.setBounds(140, 30, 100, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tipo");
        jLabel4.setMaximumSize(new java.awt.Dimension(34, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(34, 15));
        jLabel4.setName(""); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(140, 10, 26, 15);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        jButton10.setText("Consultar");
        jButton10.setToolTipText("");
        jButton10.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(130, 460, 120, 35);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        jButton11.setText("Excluir");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);
        jButton11.setBounds(260, 460, 110, 35);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton12.setText("Agendar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);
        jButton12.setBounds(10, 460, 110, 35);

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Mostrar Tudo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1);
        jCheckBox1.setBounds(260, 30, 90, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Data");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(10, 10, 40, 20);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton14.setText("Imprimir");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14);
        jButton14.setBounds(500, 460, 120, 35);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Dr. Rafael", "Dr. Vinícius", "Dr.Isaque", "Dra.Fernanda" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox2);
        jComboBox2.setBounds(370, 30, 110, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Clinico Veterinário");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(370, 10, 110, 15);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        jButton22.setText("Historico");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton22);
        jButton22.setBounds(380, 460, 110, 35);
        jPanel6.add(jDateChooser2);
        jDateChooser2.setBounds(10, 30, 110, 28);

        tConsultaAgenda.setBorder(new javax.swing.border.MatteBorder(null));
        tConsultaAgenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tConsultaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10:00", "Dr. Edvaldo", "Joel Santana", "Afrix", "Consulta", "Cancelado"},
                {"13:30", "Dr. Rafael", "Adalberto Batista", "Rex", "Exame", "Realizado"},
                {"14:00", "Dra. Fernanda", "Juca Teles", "Bila", "Cirurgia", "Agendado"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HORA", "VETERINARIO", "PROPRIETÁRIO", "CLIENTE", "TIPO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tConsultaAgenda);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 70, 610, 380);

        jTabbedPane1.addTab("Agenda Principal", jPanel6);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Agenda");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(277, 1, 47, 15);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        jButton20.setText("Histórico");
        jPanel1.add(jButton20);
        jButton20.setBounds(157, 450, 105, 35);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        jButton15.setText("Salvar");
        jPanel1.add(jButton15);
        jButton15.setBounds(280, 450, 105, 35);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png"))); // NOI18N
        jButton16.setText("Cancelar");
        jPanel1.add(jButton16);
        jButton16.setBounds(526, 450, 105, 35);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        jButton21.setText("Consultar");
        jPanel1.add(jButton21);
        jButton21.setBounds(520, 50, 109, 35);

        jTextField8.setText("Adalberto Batista");
        jPanel1.add(jTextField8);
        jTextField8.setBounds(30, 50, 189, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Proprietário");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 20, 73, 15);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Agenda"));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(16, 27, 29, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Hora");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(168, 27, 29, 15);

        jTextField3.setText("10:00");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(168, 47, 98, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Proprietário");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(16, 68, 73, 15);

        jTextField4.setText("Adalberto Batista");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(16, 89, 134, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cliente");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(170, 70, 42, 15);

        jTextField5.setText("Rex");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(168, 89, 154, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Telefone");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(340, 70, 52, 15);

        jTextField6.setText("(11)1111-1111");
        jPanel2.add(jTextField6);
        jTextField6.setBounds(340, 89, 117, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consulta", "Exame", "Cirúrgia" }));
        jPanel2.add(jComboBox5);
        jComboBox5.setBounds(16, 154, 109, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Tipo");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(16, 127, 26, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Clinico Veterinario");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(143, 127, 110, 15);

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Rafael", "Dr. Vinícius", "Dr.Isaque", "Dra.Fernanda" }));
        jPanel2.add(jComboBox7);
        jComboBox7.setBounds(143, 153, 168, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Status:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(16, 194, 45, 15);

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Agendado");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(67, 191, 75, 23);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Atendido");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(160, 191, 69, 23);

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Cancelado");
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(247, 191, 75, 23);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Observação");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(16, 221, 70, 15);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(16, 242, 539, 77);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(16, 47, 107, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 107, 0, 0);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        jButton24.setText("Excluir");
        jPanel1.add(jButton24);
        jButton24.setBounds(403, 450, 105, 35);

        jpAgenda.setBackground(new java.awt.Color(204, 204, 204));
        jpAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Agenda"));
        jpAgenda.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Data");
        jpAgenda.add(jLabel18);
        jLabel18.setBounds(220, 20, 29, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Hora");
        jpAgenda.add(jLabel19);
        jLabel19.setBounds(370, 20, 29, 15);
        jpAgenda.add(jTextField9);
        jTextField9.setBounds(370, 40, 98, 28);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Proprietário");
        jpAgenda.add(jLabel20);
        jLabel20.setBounds(16, 79, 73, 15);
        jpAgenda.add(jTextField10);
        jTextField10.setBounds(16, 100, 134, 28);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Cliente");
        jpAgenda.add(jLabel21);
        jLabel21.setBounds(168, 79, 42, 15);
        jpAgenda.add(jTextField11);
        jTextField11.setBounds(168, 100, 154, 28);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Telefone");
        jpAgenda.add(jLabel22);
        jLabel22.setBounds(340, 79, 52, 15);
        jpAgenda.add(jTextField12);
        jTextField12.setBounds(340, 100, 117, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consulta", "Exame", "Cirúrgia" }));
        jpAgenda.add(jComboBox6);
        jComboBox6.setBounds(16, 165, 109, 28);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Tipo");
        jpAgenda.add(jLabel23);
        jLabel23.setBounds(16, 138, 26, 15);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Clinico Veterinario");
        jpAgenda.add(jLabel24);
        jLabel24.setBounds(143, 138, 110, 15);

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Rafael", "Dr. Vinícius", "Dr.Isaque", "Dra.Fernanda" }));
        jpAgenda.add(jComboBox8);
        jComboBox8.setBounds(143, 164, 168, 28);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Status:");
        jpAgenda.add(jLabel25);
        jLabel25.setBounds(16, 205, 45, 15);

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Agendado");
        jpAgenda.add(jRadioButton4);
        jRadioButton4.setBounds(67, 202, 75, 23);

        jRadioButton5.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setText("Atendido");
        jpAgenda.add(jRadioButton5);
        jRadioButton5.setBounds(160, 202, 69, 23);

        jRadioButton6.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton6.setText("Cancelado");
        jpAgenda.add(jRadioButton6);
        jRadioButton6.setBounds(247, 202, 75, 23);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Observação");
        jpAgenda.add(jLabel26);
        jLabel26.setBounds(16, 232, 70, 15);
        jpAgenda.add(jTextField13);
        jTextField13.setBounds(16, 253, 539, 66);
        jpAgenda.add(jDateChooser3);
        jDateChooser3.setBounds(220, 40, 130, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cliente");
        jpAgenda.add(jLabel7);
        jLabel7.setBounds(20, 20, 42, 15);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abronzio" }));
        jpAgenda.add(jComboBox3);
        jComboBox3.setBounds(20, 40, 170, 28);

        jPanel1.add(jpAgenda);
        jpAgenda.setBounds(10, 97, 620, 340);

        jTabbedPane1.addTab("Agenda", jPanel1);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 660, 530);
        jTabbedPane1.getAccessibleContext().setAccessibleName("HistoricoAgenda");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jpAgenda;
    private javax.swing.JTable tConsultaAgenda;
    private javax.swing.JTable tConsultaAgenda1;
    // End of variables declaration//GEN-END:variables
}
