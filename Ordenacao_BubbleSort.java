package Exercicios;

public class Ordenacao_BubbleSort {
    public static void metodo(int [] arr){
        int aux =0;
        for(int j=1;j<arr.length;j++){
                for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[j]){
                aux =arr[i];
                arr[i]=arr[j];
                arr[j]=aux;
            }  
          }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] a = {9,3,7,5,4,2};
        metodo(a);
    }
}
