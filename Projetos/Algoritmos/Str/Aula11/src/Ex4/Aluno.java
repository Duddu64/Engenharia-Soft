package Ex4;

public class Aluno {
    int codigo;
    String nome;
    double nota1, nota2, media;
    
    public Aluno(){
    }
    public Aluno(int cd, String nome, double nota1, double nota2){
        codigo = cd;
        this.nome=nome;
        this.nota1=nota1;
        this.nota2=nota2;
    }
    void CalculaMedia(){
        media=(nota1+nota2)/2;
    }
    String Aluno_Aprov(){
        if(media>6){
            return "\n\nAprovado" +"\nCódigo do aluno: "+codigo +"\nNome: "+nome+"\nNota 1: "+nota1+"\nNota 2: "+nota2+"\nMedia: "+media;
        }else{
            return "\nReprovado";
        }
    }
}
