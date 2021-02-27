import java.util.Scanner;
public class Pessoa  extends Cliente{  
public String n, rg, cpf, i, sal;
    Pessoa(String tp, String n, String i, String cpf,String rg , String sal) {
        super(tp); 
        this.n = n;
        this.rg = rg;
        this.cpf = cpf;
        this.i = i;
        this.sal = sal;
    }
@Override
public void exibir(){  
        System.out.println( "\n Nome: " + this.n);
        System.out.println( "\n RG: " + this.rg);
        System.out.println("\n CPF: " + this.cpf);
        System.out.println("\n Telefone: " + this.telefone);
        System.out.println("\n Idade: " + this.i);
        System.out.println("\n Salário: " + this.sal);
    }
    public static void main (String [] args) {
    Scanner leitor = new Scanner(System.in);
    Pessoa c1 = new Pessoa ("" , "", "", "" , "", ""); 
    int tecla =0;
    while (tecla != 3){ 
        System.out.print("\n*****MENU*****\n1 Ler\n2 Exibir\n3 Sair\n item:");
        tecla = leitor.nextInt();
        switch (tecla){
            case 1: System.out.println(" ");
                    leitor.nextLine();
                    System.out.println("\nNome:");
                    c1.n = leitor.nextLine();
                    System.out.println("\nIdade:");
                    c1.i = leitor.nextLine();     
                    System.out.println("\nTelefone:");
                    c1.telefone = leitor.nextLine();    
                    System.out.println("\nCPF:");
                    c1.cpf = leitor.nextLine();
                    System.out.println("\nRG:");
                    c1.rg = leitor.nextLine();
                    System.out.println("\nSalario:");
                    c1.sal = leitor.nextLine();             
                    break;
            case 2: c1.exibir();
                    System.out.println("");
                    break;
            case 3: System.exit(0);
                    break;
            }
        }  
    }        
}
