public class Pessoa {
    private String nome;
    String sexo;
    int idade;

    public Pessoa(){}

    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String get_nome(){
        return this.nome;
    }
}
