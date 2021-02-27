public class Veiculo extends Object { 
    public String marca;
    public String modelo;
    public String ano;
    Veiculo (){ 
    }
    public String Cadastrar (String marca, String modelo, String ano){
        this.marca = marca; 
        this.modelo = modelo;
        this.ano = ano;
        return(marca);
    }
    public void exibir(){
        System.out.println( " Marca: " + marca); //herança
        System.out.println( " Modelo: " + modelo);//herança
        System.out.println(" Ano: " + ano);//herança
    }
}
