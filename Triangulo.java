import java.util.Scanner;
public class Triangulo {
    public double a, b, c, s, ar;
    public String TIPO, saida;

    public void ler(Scanner leitor){
        System.out.println("\nDigite lado A: ");
        a = leitor.nextDouble();
        System.out.println("\nDigite lado B: ");
        b = leitor.nextDouble();
        System.out.println("\nDigite lado C: ");
        c = leitor.nextDouble(); }
 
    public void calcular(){
        s = (a + b + c) / 2;
        ar = Math.sqrt(s*(s-a)*(s-b)*(s-c)); }
    
    public void exibir(){
       if (a == b && a ==c){
           TIPO = "Equilátero"; }
       else if (a != b && a != c && b != c){
           TIPO = "Escaleno";  }
       else{
           TIPO = "Isósceles";  }
        saida = "\n O Valor do lado A:" + a;
        saida += "\n O Valor do lado B:" + b;
        saida += "\n O Valor do lado C:" + c;
        saida += "\n O Valor de Semiperímetro:" + s;
        saida += "\n O Valor da área do triângulo:" + ar;
        saida += "\n O tipo do triângulo é:" + TIPO;
        System.out.println(saida);
        System.out.println(); }

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        int tecla = 0;
        System.out.println("\nMenu\n1 Ler, Calcular e Exibir\n2 Sair\nItem:");
        tecla = leitor.nextInt();//Lê e converte para char
        switch(tecla){
            case 1: t1.ler(leitor); t1.calcular();t1.exibir(); break;
            case 2: System.out.println("\nProgr. Finalizado!\n");
            System.exit(0);
            break;   
        }  
    }  
}
