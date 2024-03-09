package Exercicios;
public class Selection_Sort {
    public static void metodo(int [] x){
        
         for(int i=0;i<x.length-1;i++)
        {
           int  posicaoMenor = i;
            
         for(int j=i+1;j<x.length;j++)
         {
             if(x[j]<x[posicaoMenor])
             {
                 posicaoMenor  = j;
             }
             
         }
          
          int aux =x[posicaoMenor] ;
          x[ posicaoMenor ] = x[i];
                 x[i]= aux;
           
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
