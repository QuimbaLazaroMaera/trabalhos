package Exercicios;
public class Selection_Sort {
    public static void metodo(int [] x){
        
        for(int i=0;i<x.length-1;i++){
           int  eleito = x[i];
            int menor = x[i+1];
            int posicao = i+1;
         for(int j=i+1;j<x.length;j++){
             if(x[j]<eleito){
                 menor= x[j];
                 posicao = j;
             }
             
         }
          if(menor<eleito){
                 x[i] = menor;
                 x[posicao]= eleito;
             }
           
        }
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }
        
    }
    public static void main(String [] args){
        int [] arr = {9,4,2,6,3,1};
        metodo(arr);
        
    }
}
