
package ProgramaNodoPaquete;
import ProgramaNodoPaquete.Nodo;

public class ListaEnlazada {

    private Nodo primero;
    private Nodo ultimo;

    
    String todoElementos = "Lista :   ";
       
    public ListaEnlazada(){
        primero = null;
        ultimo = null;
    }
 
    
    public void insertarNumero(int numero){
        primero = new Nodo(numero, primero); 
        if( ultimo == null){
            ultimo = primero;
        }  
    }
       
    public int extraerUltimoNumero(){       
        int numero = primero.getNumero();
        primero = primero.getSiguiente();
        return numero;
    }
    
    public int mostrarPrimerNumero(){       
        int numero = primero.getNumero();
        return numero;
    }
    
    public int mostrarUltimoNumero(){        
        int numero = ultimo.getNumero();       
        return numero;
    }
    
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
 
    public int mostrarTamanoActual(){ 
        int contador =0;
        Nodo nodo = this.primero;        
        while(nodo!=null){
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }
    
    public String mostrarTodosElementos(){  
        
        Nodo temporal = primero;
        todoElementos = "";
        while (temporal!=null){
            todoElementos +=  ("  [ " + String.valueOf(temporal.numero) + "  ][ -]----> ");
            temporal=temporal.siguiente;            
        }
        return todoElementos;
    }
    
        public String vaciarPila(){ 
            while(primero!=null){
                primero = primero.getSiguiente();
        }
          
        return "La pila esta vacia";
    }
    
    
    
}

