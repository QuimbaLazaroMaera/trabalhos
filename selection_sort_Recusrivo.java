package Exercicios;
public class selection_sort_Recusrivo {
    public static void metodo(int [] arr,int tamanho){
        
        if(tamanho <=1)
            return;
         metodo(arr,tamanho-1);
          metodo2(arr,tamanho-1);
    }
    
    public static void metodo2(int [] arr,int tamanho){
        if(tamanho<=0) return ;
             int i = tamanho;
            int eleito = arr[i-1];
            int menor = arr[i];
            int posicaoMenor = i;
         if(eleito<a[i] ){
            menor = arr[i-1];
            posicaoMenor = i-1;
         } 
        
           if(menor<eleito){
               arr[i-1] = menor;
               arr[posicaoMenor] = eleito;
           }
            metodo2(arr,tamanho-1);
          
    }   
    public static void main(String[] args) {
        int a[] = {9,4,6,2,5};
        
        metodo(a,a.length);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }
}
