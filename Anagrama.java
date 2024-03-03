package Exercicios;


public class Anagrama {
    
    static int tamanho=0;
    static  char [] caracter = new char[50] ;
    
    public static void anagrama(String palavra){
        tamanho = palavra.length();
       
        for(int i=0;i<tamanho;i++){
            caracter[i] = palavra.charAt(i);
        }
       FazerAnagrama(tamanho);
    }
    
   public static void FazerAnagrama(int nvtamanho){ 
       if(nvtamanho==1)
           return;
           for(int j=0;j<nvtamanho;j++){
             FazerAnagrama(nvtamanho-1);
             if(nvtamanho==2)
                  mostrar();
                 rolar(nvtamanho);
                
           }
       }
public static void rolar(int nvtamanho)
{
int j;
int posicao = tamanho - nvtamanho;
char atual = caracter[posicao]; 
for(j=posicao+1; j<tamanho; j++) 
caracter[j-1] = caracter[j];
caracter[j-1] = atual; 
}

public static void mostrar()
{
  for(int j=0; j<tamanho; j++)
    
  System.out.print( caracter[j]);
    System.out.println("");
}

public static void main(String [] args){
    String a = "afcom";
    anagrama(a);
}


}