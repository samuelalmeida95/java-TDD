package tdd;

public class Pilha {

    private Object[] elementos;
    private int quantidade = 0;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return (quantidade == 0);
    }

    public Object tamanho() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        this.elementos[quantidade] = elemento;
        quantidade++;
    }

    public Object topo() {
        return this.elementos[quantidade - 1];
    }

    public Object desempilha() {
        Object topo = topo();
        quantidade--;
        return topo;
    }
}
