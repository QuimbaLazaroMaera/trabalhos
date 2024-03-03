package Exercicios;
public class insertion_Recursivo {
    
    public static void metodo(int [] arr,int tamanho){
       
       if(tamanho<=1) return ;
        metodo(arr,tamanho-1);
          metodo2 (arr,tamanho-1);
    }
       
      public static void metodo2(int [] arr,int tamanho){ 
        if(tamanho<=0) return;  
        
       int  ultimo = arr[tamanho];
       int j = tamanho-1;
       
        if(j>=0 && arr[j]>ultimo){
            arr[j+1] = arr[j];
            arr[j] = ultimo;
          metodo2 (arr,j);
        }
      }
   
  
    public static void main(String[] args) {
        int a [] = {7,4,2,8,9};
        metodo(a,a.length);
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" "); 
        }
        }
    }

