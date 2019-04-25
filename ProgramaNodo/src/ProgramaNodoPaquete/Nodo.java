package ProgramaNodoPaquete;


// se crea la clase con nombre Nodo. Los atributos son numero y siguiente. 

public class Nodo {
    public int numero;
    public Nodo siguiente;
        
    public Nodo(int numero){   
        this.numero = numero;
    }
    
    public Nodo(int numero, Nodo siguiente){   
        this.numero = numero;
        this.siguiente = siguiente;
    }
    
      
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
       
    /*public String toString(){
        String s = " "+numero+" ";
        return s;
    }*/
}
