
package ProgramaNodoPaquete;
import ProgramaNodoPaquete.Nodo;

public class ListaEnlazada {

    private Nodo primero;
    private Nodo ultimo;
    int contador = 0;
    
    
    String todoElementos = "Lista :   ";
       
    public ListaEnlazada(){
        primero = null;
        ultimo = null;
    }
    
    /*public void insertarNumero(int numero){
        Nodo nodo = new Nodo(numero);
        nodo.setSiguiente(null);
        if(primero == null & ultimo == null){
            primero = nodo;
            ultimo = nodo;
        }
        ultimo.setSiguiente(nodo);
        ultimo = ultimo.getSiguiente();  
    }*/
    
    
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
    
    public int mostrarPosicionNumero(){
   
        int numero = ultimo.getNumero();       
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
        Nodo nodo = this.primero;        
        while(nodo!=null){
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }
    
    public String mostrarTodosElementos(){  
        
        Nodo recorrer = primero;
        todoElementos = "";
        while (recorrer!=null){
            
            todoElementos +=  (" ---> [ " + String.valueOf(recorrer.numero) + " ] ");
            recorrer=recorrer.siguiente;
            
        }
        return todoElementos;
    }
    
    
 


           
}

