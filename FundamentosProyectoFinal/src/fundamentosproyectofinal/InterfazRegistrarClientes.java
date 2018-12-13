 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Karla
 */
public class InterfazRegistrarClientes extends javax.swing.JFrame {

     private final String [] datosDBUsuario = {
                                                "Id: ",
                                                "Apellido: ",
                                                "Nombre: ",
                                                "Segundo Nombre: ",
                                                "Telefono Primario: ",
                                                "Genero: ",
                                                "Direccion 1: ",
                                                "Direccion 2: ",
                                                "Ciudad: ",
                                                "Provincia: ",
                                                "Tipo de Telefono: ",
                                                "Correo Electronico: ",
                                                "Estado del Cliente: ",
                                                "Peliculas Rentadas: ",
                                            };
   
    Miscelaneos miscelaneos = new Miscelaneos();
    Usuario usuario;
    Pelicula pelicula;
    InteraccionConCSV interaccionCSV = new InteraccionConCSV();
    Interaccion interaccion = new Interaccion();
    
    
    
    public InterfazRegistrarClientes() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UsuarioNuevoNombreTxt = new javax.swing.JTextField();
        UsuarioNuevoSegundoNombreTxt = new javax.swing.JTextField();
        UsuarioNuevoApellidoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UsuarioNuevoGeneroCbx = new javax.swing.JComboBox<>();
        UsuarioNuevoLimpiarCasillasBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        UsuarioNuevoTelefonoTxt = new javax.swing.JTextField();
        UsuarioNuevoTipoTelefonoCbx = new javax.swing.JComboBox<>();
        UsuarioNuevoProvinciaCbx = new javax.swing.JComboBox<>();
        UsuarioNuevoCiudadTxt = new javax.swing.JTextField();
        UsuarioNuevoDireccion1Txt = new javax.swing.JTextField();
        UsuarioNuevoDireccion2Txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        UsuarioNuevoEmailTxt = new javax.swing.JTextField();
        UsuarioNuevoCorroborarDatosBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        UsuarioNuevoVolverAlMenuPrincipalBtn = new javax.swing.JButton();
        UsuarioNuevoGuardarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel3.setText("Segundo Nombre:");

        jLabel4.setText("Apellido:");

        UsuarioNuevoNombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoNombreTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Género:");

        UsuarioNuevoGeneroCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Otro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioNuevoGeneroCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(UsuarioNuevoNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(UsuarioNuevoSegundoNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(UsuarioNuevoApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {UsuarioNuevoApellidoTxt, UsuarioNuevoNombreTxt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsuarioNuevoNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(UsuarioNuevoSegundoNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(UsuarioNuevoApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioNuevoGeneroCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4});

        UsuarioNuevoLimpiarCasillasBtn.setText("Limpiar casillas");
        UsuarioNuevoLimpiarCasillasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioNuevoLimpiarCasillasBtnMouseClicked(evt);
            }
        });
        UsuarioNuevoLimpiarCasillasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoLimpiarCasillasBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel5.setText("Teléfono");

        jLabel6.setText("Tipo de teléfono:");

        jLabel8.setText("Provincia:");

        jLabel9.setText("Ciudad");

        jLabel10.setText("Dirección1:");

        jLabel11.setText("Dirección 2:");

        UsuarioNuevoTelefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoTelefonoTxtActionPerformed(evt);
            }
        });

        UsuarioNuevoTipoTelefonoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular", "Hogar", "Oficina", "Otro" }));

        UsuarioNuevoProvinciaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José", "Alajuela", "Heredia", "Cartago", "Limón", "Puntarenas", "Guanacaste" }));

        UsuarioNuevoCiudadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoCiudadTxtActionPerformed(evt);
            }
        });

        jLabel12.setText("E-mail:");

        UsuarioNuevoCorroborarDatosBtn.setText("Corroborar datos");
        UsuarioNuevoCorroborarDatosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioNuevoCorroborarDatosBtnMouseClicked(evt);
            }
        });
        UsuarioNuevoCorroborarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoCorroborarDatosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UsuarioNuevoTelefonoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UsuarioNuevoProvinciaCbx, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                                .addComponent(UsuarioNuevoDireccion1Txt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UsuarioNuevoEmailTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioNuevoCiudadTxt)
                            .addComponent(UsuarioNuevoDireccion2Txt)
                            .addComponent(UsuarioNuevoTipoTelefonoCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UsuarioNuevoCorroborarDatosBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioNuevoTelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioNuevoTipoTelefonoCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioNuevoProvinciaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioNuevoCiudadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioNuevoDireccion1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioNuevoDireccion2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioNuevoEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsuarioNuevoCorroborarDatosBtn)
                .addGap(8, 8, 8))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("USUARIO NUEVO");

        UsuarioNuevoVolverAlMenuPrincipalBtn.setText("Volver al menú principal");
        UsuarioNuevoVolverAlMenuPrincipalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioNuevoVolverAlMenuPrincipalBtnMouseClicked(evt);
            }
        });

        UsuarioNuevoGuardarBtn.setText("Guardar");
        UsuarioNuevoGuardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioNuevoGuardarBtnMouseClicked(evt);
            }
        });
        UsuarioNuevoGuardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioNuevoGuardarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(UsuarioNuevoGuardarBtn)
                                .addGap(18, 18, 18)
                                .addComponent(UsuarioNuevoLimpiarCasillasBtn)
                                .addGap(18, 18, 18)
                                .addComponent(UsuarioNuevoVolverAlMenuPrincipalBtn)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(177, 177, 177))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioNuevoLimpiarCasillasBtn)
                    .addComponent(UsuarioNuevoVolverAlMenuPrincipalBtn)
                    .addComponent(UsuarioNuevoGuardarBtn))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public String apellidoUsuarioLimpio() {

        String apellido = UsuarioNuevoApellidoTxt.getText();

        while (apellido.contains("1") || apellido.contains("2")
                || apellido.contains("3") || apellido.contains("4")
                || apellido.contains("5") || apellido.contains("6")
                || apellido.contains("7") || apellido.contains("8")
                || apellido.contains("9") || apellido.contains("0")) {
            JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
                    + "Ingréselo de nuevo.");
            UsuarioNuevoApellidoTxt.setText("");
            apellido = UsuarioNuevoApellidoTxt.getText();
        }

        String resultado = apellido.replace(',', '.');
        
        return resultado;
        
    }
    
    public String nombreUsuarioLimpio() {

        /*
            se utiliza if String contains para evitar que el bibliotecólogo ingrese un dato tipo
            string con números. Se usa así pues al ingresar un número como tal Java no va a dar una
            excepcion pues acepta el número como un string, pero esto puede más adelante causar problemas
            porque si se quiere buscar a una persona por ejemplo usando el nombre y el dato contiene un número
            que se ingresó por error, no se va a poder encontrar a esa persona.
         */
        String nombre = UsuarioNuevoNombreTxt.getText();

        while (nombre.contains("1") || nombre.contains("2")
                || nombre.contains("3") || nombre.contains("4")
                || nombre.contains("5") || nombre.contains("6")
                || nombre.contains("7") || nombre.contains("8")
                || nombre.contains("9") || nombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre no debe contener números. Ingréselo de nuevo");
            UsuarioNuevoNombreTxt.setText("");
            nombre = UsuarioNuevoNombreTxt.getText();
        }

        String resultado = nombre.replace(',', '.');
        
        return resultado;

    }
    
    public String segundoNombreUsuarioLimpio() {

        //este es un caso similar al de nombre, no se permite guardar el apellido si éste contine números
        String segundoNombre = UsuarioNuevoSegundoNombreTxt.getText();

        while (segundoNombre.contains("1") || segundoNombre.contains("2")
                || segundoNombre.contains("3") || segundoNombre.contains("4")
                || segundoNombre.contains("5") || segundoNombre.contains("6")
                || segundoNombre.contains("7") || segundoNombre.contains("8")
                || segundoNombre.contains("9") || segundoNombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. Ingréselo de nuevo");
            UsuarioNuevoSegundoNombreTxt.setText("");
            segundoNombre = UsuarioNuevoSegundoNombreTxt.getText();
        }

        String resultado = segundoNombre.replace(',', '.');
        
        return resultado;
        
    }
    
    public int telefonoLimpio() {

        // Variables
        boolean done = false;
        int telefono = 0;
        String telefonoString;

        do {
            
            telefonoString = UsuarioNuevoTelefonoTxt.getText();
            
            try {
                
                if(telefonoString.length() == 8) {
                    telefono = Integer.parseInt(telefonoString);
                    done = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar el teléfono, ocho digitos son requeridos.");
                UsuarioNuevoTelefonoTxt.setText("00000000");
                telefonoString = UsuarioNuevoTelefonoTxt.getText();
                }
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el teléfono, solo escriba números, no letras.");
            }

        } while (!done);
        
        return telefono;

    }

    public String direccion1UsuarioLimpio() {
        
        String var = UsuarioNuevoDireccion1Txt.getText();
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String direccion2UsuarioLimpio() {
        
        String var = UsuarioNuevoDireccion2Txt.getText();
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String tipoTelefonoLimpio() {

        String tipoTelefono=  UsuarioNuevoTipoTelefonoCbx.getItemAt(UsuarioNuevoTipoTelefonoCbx.getSelectedIndex());
         
        return tipoTelefono;
    }

    public char generoLimpio() {
        
        char genero= 'F';
        String generoIngresado= UsuarioNuevoGeneroCbx.getItemAt(UsuarioNuevoGeneroCbx.getSelectedIndex());
        int index= UsuarioNuevoGeneroCbx.getSelectedIndex();
        { 
        if(index==0)
            genero= 'F';
        if(index==(1))
            genero= 'M';
        
        if(index==(2))
            genero= 'O';
        }
        
       return genero;
        
    }
        
    

    public String ciudadLimpio() {
        
        String var = UsuarioNuevoCiudadTxt.getText();
        String resultado = var.replace(',', '.');
        
        return resultado;
        
    }
    
    public String provinciaLimpio() {
        
        String provincia= UsuarioNuevoProvinciaCbx.getItemAt(UsuarioNuevoProvinciaCbx.getSelectedIndex());
        
        return provincia;
        
    }

    public String correoElectronico() {
       
        boolean corregir = true;
        String correoElectronico = "";

        while (corregir) {

            correoElectronico = UsuarioNuevoEmailTxt.getText();

            if (correoElectronico.contains("@") && correoElectronico.contains(".")) {
                corregir = false;

            } else {
                JOptionPane.showMessageDialog(null, "Error: Formato de correo no valido", "Error", JOptionPane.ERROR_MESSAGE);
                UsuarioNuevoEmailTxt.setText("@.com");
                UsuarioNuevoEmailTxt.getText();
                 
            }}
                String resultado = correoElectronico.replace(',', '.');
                return resultado;
    
    }
    
    private void UsuarioNuevoLimpiarCasillasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoLimpiarCasillasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoLimpiarCasillasBtnActionPerformed

    private void UsuarioNuevoTelefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoTelefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoTelefonoTxtActionPerformed

    private void UsuarioNuevoNombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoNombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoNombreTxtActionPerformed

    private void UsuarioNuevoCiudadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoCiudadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoCiudadTxtActionPerformed

    private void UsuarioNuevoVolverAlMenuPrincipalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioNuevoVolverAlMenuPrincipalBtnMouseClicked
          // con este codigo volvemos al menu principal y cerramos la ventana actual
        InterfazMenuPrincipal menuPrincipal= new  InterfazMenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuarioNuevoVolverAlMenuPrincipalBtnMouseClicked

    private void UsuarioNuevoLimpiarCasillasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioNuevoLimpiarCasillasBtnMouseClicked
        // Al darle click a borrar se limpian los datos que se escribieron.
        
        UsuarioNuevoNombreTxt.setText("");
        UsuarioNuevoSegundoNombreTxt.setText("");
        UsuarioNuevoApellidoTxt.setText("");
        UsuarioNuevoTelefonoTxt.setText("");
        UsuarioNuevoCiudadTxt.setText("");
        UsuarioNuevoDireccion1Txt.setText("");
        UsuarioNuevoDireccion2Txt.setText("");
        UsuarioNuevoEmailTxt.setText("");
        UsuarioNuevoGeneroCbx.setSelectedIndex(0);
        UsuarioNuevoTipoTelefonoCbx.setSelectedIndex(0);
        UsuarioNuevoProvinciaCbx.setSelectedIndex(0);
    }//GEN-LAST:event_UsuarioNuevoLimpiarCasillasBtnMouseClicked

    private void UsuarioNuevoCorroborarDatosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioNuevoCorroborarDatosBtnMouseClicked
        // Esto me corrobora los datos para que estén libre de errores. 
        usuario = new Usuario(interaccionCSV.setIdNuevoUsuario(),
                                apellidoUsuarioLimpio(),
                                nombreUsuarioLimpio(),
                                segundoNombreUsuarioLimpio(),
                                telefonoLimpio(),
                                generoLimpio(),
                                direccion1UsuarioLimpio(),
                                direccion2UsuarioLimpio(),
                                ciudadLimpio(),
                                provinciaLimpio(),
                                tipoTelefonoLimpio(),
                                correoElectronico(),
                                true,
                                false);
                
    }//GEN-LAST:event_UsuarioNuevoCorroborarDatosBtnMouseClicked

    private void UsuarioNuevoGuardarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioNuevoGuardarBtnMouseClicked
        // con este botón guardo en la base de datos.
        interaccionCSV.crearUsuarioNuevo(usuario.getUsuarioNuevo());
        JOptionPane.showMessageDialog(null, "Guardado con éxito");
    }//GEN-LAST:event_UsuarioNuevoGuardarBtnMouseClicked

    private void UsuarioNuevoCorroborarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoCorroborarDatosBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoCorroborarDatosBtnActionPerformed

    private void UsuarioNuevoGuardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioNuevoGuardarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioNuevoGuardarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsuarioNuevoApellidoTxt;
    private javax.swing.JTextField UsuarioNuevoCiudadTxt;
    private javax.swing.JButton UsuarioNuevoCorroborarDatosBtn;
    private javax.swing.JTextField UsuarioNuevoDireccion1Txt;
    private javax.swing.JTextField UsuarioNuevoDireccion2Txt;
    private javax.swing.JTextField UsuarioNuevoEmailTxt;
    private javax.swing.JComboBox<String> UsuarioNuevoGeneroCbx;
    private javax.swing.JButton UsuarioNuevoGuardarBtn;
    private javax.swing.JButton UsuarioNuevoLimpiarCasillasBtn;
    private javax.swing.JTextField UsuarioNuevoNombreTxt;
    private javax.swing.JComboBox<String> UsuarioNuevoProvinciaCbx;
    private javax.swing.JTextField UsuarioNuevoSegundoNombreTxt;
    private javax.swing.JTextField UsuarioNuevoTelefonoTxt;
    private javax.swing.JComboBox<String> UsuarioNuevoTipoTelefonoCbx;
    private javax.swing.JButton UsuarioNuevoVolverAlMenuPrincipalBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
