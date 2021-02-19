import java.util.Scanner;
public class Diferenca {
    
    public int n1, n2, dif;//atributo    
    
    public void lerNumero(Scanner leitor){
        System.out.println("\nDigite os valores N1 e N2:");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt(); 
    }    
    public void calcularNumero(){
        if (n1 < n2){
            dif = n2 - n1; }
        else{
            dif = n1 - n2}  
    }  
    
    public void exibirTudo(){
        System.out.println("\nValor da diferença é " + dif);
        System.out.println();
    }    
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Diferenca d1 = new Diferenca();        
        d1.lerNumero(leitor);
        d1.calcularNumero();
        d1.exibirTudo();
        System.exit(0);   
    }
}
