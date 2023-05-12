package LinkedListThrowaway;

public class MainRun {

    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            Double num = ((Math.floor(Math.random() * 10)) + 1);
            int add = num.intValue();
            lista.adiciona(add);
        }

        System.out.println("Tamanho = " + lista.getTamanho() + " | " + lista);
    }

}
