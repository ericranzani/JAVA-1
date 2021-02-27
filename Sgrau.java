import java.util.Scanner;
public class Sgrau {
    //atributos
    public double  x1, x2;
    public int a, b, c, d;
    public String saida, rn;
    
    public void lerValor(Scanner leitor){
        System.out.println("\nDigite o valor coeficiente principal (A):");
        a = leitor.nextInt();
        System.out.println("\nDigite o valor coeficiente principal (B):");
        b = leitor.nextInt();
        System.out.println("\nDigite o valor coeficiente principal (C):");
        c = leitor.nextInt();  }
    public void calcularValores(){
        d = b *b - 4 * a * c;
        if ( d >= 0){
            x1 = (-b - (Math.sqrt(d)) / (a * 2));
            x2 = (-b + (Math.sqrt(d)) / (a * 2));   }
        else{
           rn = ("\nRaiz não existe");     }    }
    public void exibirTudo(){
        saida = "\n O Valor de A:" + a;
        saida += "\n O Valor de B:" + b;
        saida += "\n O Valor de C:" + c;
        saida += "\n O Valor de Delta:" + d;
        System.out.println(saida);
        System.out.println();
        if ( d >= 0){
            saida = "\nRaiz x1: " + x1;
            saida += "\nRaiz x2: " + x2;
            System.out.println(saida);
            System.out.println();        }
        else{
            saida = rn;
            System.out.println(saida);
            System.out.println();        }    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Sgrau sg = new Sgrau();
           int tecla;
        System.out.println("1 Ler, Calcular e Exibir\n2 Sair\nItem");
        tecla = leitor.nextInt();
        switch(tecla){
            case 1: sg.lerValor(leitor); sg.calcularValores(); sg.exibirTudo();break;
            case 2: System.out.println("\nPrograma Finalizado!\n"); System.exit(0); break;   
        }  
    } 
}
