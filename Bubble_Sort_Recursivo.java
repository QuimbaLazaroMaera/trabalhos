package Exercicios;

public class Bubble_Sort_Recursivo {
    private static void metodo(int [] arr,int tamanho){
        
        if(tamanho==1) 
            return;
        for(int i=0;i<tamanho-1;i++){
        if(arr[i]>arr[i+1]){
            int aux = arr[i];
            arr[i]=arr[i+1];
            arr[i+1] = aux;
        }
    }
         metodo(arr,tamanho-1);
        
    }
    
  public static void main(String[] args) {
        int [] a = {8,2,4,9,10};
        metodo(a,a.length);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }  
        
    }
}
