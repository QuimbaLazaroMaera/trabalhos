package Exercicios;
public class TorreHanoi {
    public static void main(String[] args) {
        int numDiscos = 3;
        torre(numDiscos,'A','C','B');
    }
    
    public static void torre(int numDiscos,char Origem,char Destino,char auxiliar){
        if(numDiscos==1){
            System.out.println("mova o disco 1 de "+Origem+" para "+Destino);
            return;
        }
        torre(numDiscos-1,Origem,auxiliar,Destino);
        System.out.println("mova o disco "+numDiscos +" de "+Origem+" para "+Destino);
        torre(numDiscos-1,auxiliar,Destino,Origem);   
    }
}
