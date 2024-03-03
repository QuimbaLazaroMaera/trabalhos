package Exercicios;
public class selection_sort_Recusrivo {
    public static void metodo(int [] arr,int tamanho){
        
        if(tamanho ==1)
            return;
        for(int i=0;i<arr.length-1;i++){
            int eleito = arr[i];
            int menor = arr[i+1];
            int posicaoMenor = i+1;
         if(arr[i+1]<eleito){
            menor = arr[i+1];
            posicaoMenor = i+1;
         } 
        
           if(menor<eleito){
               arr[i] = menor;
               arr[posicaoMenor] = eleito;
           }
        }
         metodo(arr,tamanho-1);
    }
    
    public static void main(String[] args) {
        int a[] = {9,4,6,2,5};
        
        metodo(a,a.length);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }
}
