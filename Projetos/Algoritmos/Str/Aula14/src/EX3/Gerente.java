package EX3;

public class Gerente extends Empregado{
    private String nomeGerencia;

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
    
	public String PrintDados() {
		return "Dados do Gerente: \nNome: "+getNome()+"\nIdade: "+getIdade()+"\nMatricula: "+getMatricula()+"\nNome da gerencia: "+nomeGerencia+"\nValor do INSS: "+valorInss();
	}
}
