import java.util.Scanner;
public class Figura {
    public int a, b, c;
    public String tipo;

    public void ler(Scanner leitor){
        System.out.println("\nDigite lado A: ");
        a = leitor.nextInt();
        System.out.println("\nDigite lado B: ");
        b = leitor.nextInt();
        System.out.println("\nDigite lado C: ");
        c = leitor.nextInt();  }
    
    public void exibir(){
        if (a < b + c && b <a + c && c < a + b){
            System.out.println("Trata-se de um Triângulo");
            System.out.println();  }
        else{
            System.out.println("Uma figura qualquer de três lados");
            System.out.println();   }  }
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Figura f1 = new Figura();
        int tecla = 0;
        System.out.println("\nMenu\n1 Ler e Exibir\n2 Sair\nItem:");
        tecla = leitor.nextInt();
        switch(tecla){
            case 1: f1.ler(leitor);f1.exibir(); break;
            case 2: System.out.println("\nProgr. Finalizado!\n");
            System.exit(0);
            break;    
        }  
    }  
}
