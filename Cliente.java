public class Cliente extends Object// e a classe mãe, pois utiliza extends e object
{ 
    public String tipo;
    public String telefone; // Telefone genérico
    Cliente ( String tp ) {
        this.tipo = tp; 
    }
    public void exibir(){    
        System.out.println(tipo); 
    }
}
