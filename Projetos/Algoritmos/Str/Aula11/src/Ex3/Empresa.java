package Ex3;

public class Empresa {
    String Nome;
    String Endereco;
    String Cidade;
    String Estado;
    double ValorPatrimonial;
    int QuantFunci;
    
    public Empresa (String nome, String Endereco, String Cidade, String Estado, double ValorPatrimonial, int QuantFunci){
        this.Nome=nome;
        this.Endereco=Endereco;
        this.Cidade=Cidade;
        this.Estado=Estado;
        this.ValorPatrimonial=ValorPatrimonial;
        this.QuantFunci=QuantFunci;
    }
    
    void Imprime(){
        System.out.print("\n\n\nEmpresa \n"+Nome+"\nEndereço da Empresa: "+Endereco+"\nCidade: "+Cidade+"\nEstado: "+Estado+"\nValor Patrimonial da Empresa: "+ValorPatrimonial+"\nQuantidade de funcionários: "+QuantFunci);
    }
}
