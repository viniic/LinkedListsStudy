package LinkedListThrowaway;

public class LinkedList<T> {
    private Node<T> inicio;
    private int tamanho;
    private Node<T> end;
    private Node<T> current;

    public void adiciona(T elemento) {
        Node<T> celula = new Node<T>(elemento);
        if (inicio == null) {
            this.inicio = celula;
            current = inicio;
        } else {
            end.setNext(celula);
            celula.setPrev(end);
        }
        this.end = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Node<T> getEnd() {
        return end;
    }

    @Override
    public String toString() {
        // [1,2,3,4,5]
        if (this.tamanho == 0) {
            return "[]";
        }
        String out = "[";
        for (int i = 0; i<this.tamanho-1;i++){
            out += current.getElemento() + ",";
            current = current.getNext();
        }
        return out + current.getElemento()+ "]";
    }

}