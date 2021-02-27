import java.util.Scanner;

public class Carro extends Veiculo {
    public String renavam, cor, placa;
    
    Carro(){
        
    }    
    
    public static void main (String [] args) {
    
    Scanner leitor = new Scanner(System.in);
    Carro c1 = new Carro ();   

    int tecla =0;
    while (tecla != 3){
      
        System.out.print("\n*****MENU*****\n1 Cadastrar\n2 Exibir\n3 Sair\n item:");
        tecla = leitor.nextInt();
      
        switch (tecla){
            
            case 1: System.out.println(" ");
                    leitor.nextLine();
                  
                    System.out.println("\nMarca:");
                    c1.marca = leitor.nextLine(); //herança
              
                    System.out.println("\nModelo:");
                    c1.modelo = leitor.nextLine();     //herança
                  
                    System.out.println("\nAno:");
                    c1.ano = leitor.nextLine();    //herança
              
                    System.out.println("\nRenavam:");
                    c1.renavam = leitor.nextLine();
                  
                    System.out.println("\nCor:");
                    c1.cor = leitor.nextLine();
                  
                    System.out.println("\nPlaca:");
                    c1.placa = leitor.nextLine();
                                  
                    break;
                  
            case 2: c1.exibir();
                    System.out.println(" Renavam: " + c1.renavam);
                    System.out.println(" Cor: " + c1.cor);
                    System.out.println(" Placa: " + c1.placa); 
                    System.out.println("");
                    break;
              
            case 3: System.exit(0);
                    break;
            }
        }  
    }        
}
