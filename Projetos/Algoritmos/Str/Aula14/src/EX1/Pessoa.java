package EX1;

public class Pessoa {
    private String Nome;
    private String endereco;
    private String telefone;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String Nome, String endereco, String telefone){
        this.Nome=Nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
