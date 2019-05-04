
package ProgramaNodoPaquete;
import ProgramaNodoPaquete.Nodo;

public class ListaEnlazada {

    private Nodo primero;
    private Nodo ultimo;

    String todoElementos = "Lista :   ";
       
    // el contructor inicializa los atributos que son de tipo Nodo para recorrer la lista. 
    public ListaEnlazada(){
        primero = null;
        ultimo = null;
    }
 
    // inserta elemento en la pila, se invoca con un boton 
    public void insertarNumero(int numero){
        primero = new Nodo(numero, primero); 
        if( ultimo == null){
            ultimo = primero;
        }  
    }
       
    // extrae el último elemento ingresado en en la pila 
    public int extraerUltimoNumero(){       
        int numero = primero.getNumero();
        primero = primero.getSiguiente();
        return numero;
    }

    // muestra sin extraer el elemento en la primera posición de la pila 
    public int mostrarPrimerNumero(){       
        int numero = primero.getNumero();
        return numero;
    }
    
     // muestra sin extraer el elemento en la última posición de la pila 
    public int mostrarUltimoNumero(){        
        int numero = ultimo.getNumero();       
        return numero;
    }
    
    // muestra el número alamcenado en la posición que el usurio ingresa. 
    public int mostrarPosicionNumero(int posicion){
        int numero = 0;
        Nodo temporal = primero;       
        do {
            temporal = temporal.getSiguiente();           
            posicion--;
        }while (posicion != 0);
        numero = temporal.getNumero();
        return numero;
    }
  
    // muestra si la pila esta vacía o contiene elementos. 
    public String mostrarEstadoVacio(){
        String estado="";
        if(primero == null & ultimo == null){       //La cola esta vacía
            estado = "La cola esta vacia";  
        }
        else{                                       //La cola no esta vacía
            estado = "La cola no esta vacia";
        }
        return estado;
    }
 
    // muestra el tamaño de la pila. 
    public int mostrarTamanoActual(){ 
        int contador =0;
        Nodo nodo = this.primero;        
        while(nodo!=null){
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }
    
    // muestra todos los elementos que contiene la pila, lo hace de forma gráfica, cada nodo tiene una flecha que apunta al siguiente nodo. 
    public String mostrarTodosElementos(){         
        Nodo temporal = primero;
        todoElementos = "";
        while (temporal!=null){
            todoElementos +=  ("  [ " + String.valueOf(temporal.numero) + "  ][ -]----> ");
            temporal=temporal.siguiente;            
        }
        return todoElementos;
    }
    
    // vacía la pila. 
        public String vaciarPila(){ 
            while(primero!=null){
                primero = primero.getSiguiente();
        }        
        return "La pila esta vacia";
    } 
}

