package Exercicios;
public class exercicio_array {
    public static void metodo(int[] x, int valor, int posicao) {
        if (posicao < 0 || posicao >= x.length) {
            return;
        }
       
    System.out.println(x[posicao] + " ");
        if (x[posicao] > valor) {
            metodo(x, valor, posicao + 1);
        
        } else {
            metodo(x, valor, posicao - 1);
            
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1, 4, 7,5,9};
        int num = 8;
        int posicaoInicial = a.length / 2;
        metodo(a, num, posicaoInicial);
    }
}
