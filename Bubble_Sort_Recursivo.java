package Exercicios;

public class Bubble_Sort_Recursivo {
    private static void metodo(int [] arr,int tamanho){
        
        if(tamanho<=1) 
            return;
        metodo(arr,tamanho-1)
    }

private static void metodo2(int [] arr,int tamanho){
    if (tamanho<=0) return;
       int i = tamanho;
        if(arr[i]<arr[i-1]){
            int aux = arr[i];
            arr[i]=arr[i-1];
            arr[i-1] = aux;
        }
    
         metodo2(arr,tamanho-1);    
}
    
  public static void main(String[] args) {
        int [] a = {8,2,4,9,10};
        metodo(a,a.length);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }  
        
    }
}
