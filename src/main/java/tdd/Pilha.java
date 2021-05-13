package tdd;

public class Pilha {

    private Object elemento;
    private int quantidade;

    public boolean estaVazia() {
        return (elemento == null); 
    }

    public Object tamanho() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        this.elemento = elemento;
        quantidade ++;
    }

    public Object topo() {
        return this.elemento;
    }
}
