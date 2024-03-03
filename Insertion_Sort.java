package Exercicios;
public class Insertion_Sort {
    public static void metodo(int [] arr){
        for(int i=1;i<arr.length-1;i++){
            int eleito = arr[i];
            int posicaoDoAnterior = i-1;
        for(int j=i-1;j>=0;j--){
           if(arr[j]>eleito){
               arr[j+1] = arr[j];
               posicaoDoAnterior = posicaoDoAnterior-1;
           } 
        }
             arr[posicaoDoAnterior+1] = eleito;
             
      }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        } 
    }
    
    
    public static void main(String[] args) {
        int [] a = {10,8,4,9,17};
        metodo (a);
    }
}
