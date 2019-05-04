package ProgramaNodoPaquete;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProgramaNodo extends javax.swing.JFrame {

    public ProgramaNodo() {
        iniComponentes();
    }
                        
    private void iniComponentes() {

        numeroInsertarButton = new javax.swing.JButton();
        numeroInsertarTextField = new javax.swing.JTextField(10);
        numeroInsertarLabel = new javax.swing.JLabel();
        extraerUltimoButton = new javax.swing.JButton();
        obtenerPrimerButton = new javax.swing.JButton();
        obtenerUltimoButton = new javax.swing.JButton();
        posicionObtenerLabel = new javax.swing.JLabel();
        posicionObtenerTextField = new javax.swing.JTextField(10);
        posicionObtenerButton = new javax.swing.JButton();
        vacioEstadoButton = new javax.swing.JButton();
        mostrarTamanoButton = new javax.swing.JButton();
        mostrarElementoButton = new javax.swing.JButton();
        vaciarColaButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();
        tituloLabel = new javax.swing.JLabel();
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        
        numeroInsertarLabel.setText("Valor a insertar:");
        numeroInsertarTextField.setText("");
        numeroInsertarButton.setText("Insertar");
        numeroInsertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try { 
                        listaEnlazada.insertarNumero(Integer.parseInt(numeroInsertarTextField.getText()));
                        //resultadoTextArea.setText("El numero ha sido ingresado correctamente");
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2); 
            }            
        });
        
        extraerUltimoButton.setText("Extraer ultimo valor");
        extraerUltimoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {                       
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.extraerUltimoNumero()));                        
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    
                    
                    
                    x=2;
                }while(x!=2);   
            }
        });
       
        obtenerPrimerButton.setText("Obtener primer valor");
        obtenerPrimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {  
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.mostrarPrimerNumero()));  
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);     
            }
        });
         
        obtenerUltimoButton.setText("Obtener ultimo valor");
        obtenerUltimoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                do{
                    try {  
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.mostrarUltimoNumero()));  
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);     
            }
        });
        
        posicionObtenerLabel.setText("Ingrese posicion:");
        posicionObtenerTextField.setText("");
        posicionObtenerButton.setText("Obtener");                                                       // ??????pendiente???????
        posicionObtenerButton.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {  
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.mostrarPosicionNumero(Integer.parseInt(posicionObtenerTextField.getText()))));   

                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);    
            }
        });
        
        vacioEstadoButton.setText("Estado de la pila");
        vacioEstadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                    try {  
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.mostrarEstadoVacio()));   
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);  
            }
        });
        
        mostrarTamanoButton.setText("Tamaño de la pila");
        mostrarTamanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {  
                        resultadoTextArea.setText(String.valueOf(listaEnlazada.mostrarTamanoActual()));   
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);
               
                
                
            }
        });
 
        mostrarElementoButton.setText("Mostrar todos los elementos");
        mostrarElementoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                do{
                    try {                       
                        resultadoTextArea.setText(listaEnlazada.mostrarTodosElementos());                        
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2);   
            }
        });

        vaciarColaButton.setText("Vaciar pila");
        vaciarColaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {                       
                        resultadoTextArea.setText(listaEnlazada.vaciarPila());                        
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");                 
                    }
                    x=2;
                }while(x!=2); 
     
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 System.exit(0);
            }
        });

        
        resultadoTextArea.setColumns(20);
        resultadoTextArea.setRows(5);
        jScrollPane1.setViewportView(resultadoTextArea);

        tituloLabel.setText("Funcionamiento de la pila");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGap(346, 346, 346))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroInsertarLabel)
                            .addComponent(posicionObtenerLabel))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obtenerPrimerButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(posicionObtenerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(posicionObtenerButton))
                            .addComponent(obtenerUltimoButton)
                            .addComponent(salirButton)
                            .addComponent(vaciarColaButton)
                            .addComponent(mostrarElementoButton)
                            .addComponent(mostrarTamanoButton)
                            .addComponent(vacioEstadoButton)
                            .addComponent(extraerUltimoButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroInsertarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroInsertarButton)))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(tituloLabel)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(tituloLabel)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroInsertarButton)
                            .addComponent(numeroInsertarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroInsertarLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extraerUltimoButton)
                        .addGap(13, 13, 13)
                        .addComponent(obtenerPrimerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(obtenerUltimoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(posicionObtenerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicionObtenerLabel)
                            .addComponent(posicionObtenerButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vacioEstadoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarTamanoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarElementoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vaciarColaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salirButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                /////
                .addContainerGap(80, Short.MAX_VALUE))
        );

      
    }                   

    public static void main(String args[]) {
        ProgramaNodo inter = new ProgramaNodo();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setSize(1000, 800);
        inter.setVisible(true);  
 
    }

    private javax.swing.JButton extraerUltimoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JButton mostrarElementoButton;
    private javax.swing.JButton mostrarTamanoButton;
    private javax.swing.JButton numeroInsertarButton;
    private javax.swing.JLabel numeroInsertarLabel;
    private javax.swing.JTextField numeroInsertarTextField;
    private javax.swing.JButton obtenerPrimerButton;
    private javax.swing.JButton obtenerUltimoButton;
    private javax.swing.JButton posicionObtenerButton;
    private javax.swing.JLabel posicionObtenerLabel;
    private javax.swing.JTextField posicionObtenerTextField;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton vaciarColaButton;
    private javax.swing.JButton vacioEstadoButton;
    private int x; // variable utilizada para el do/while del manejo de excepciones
                     
}





