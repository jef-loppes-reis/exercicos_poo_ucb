public class Animal {
    public String nome;
    public float peso;
    
    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome() {
        return this.nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public float setPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return String.format("\n\tNome: ", this.nome + "\n\tPeso: ", this.peso);
    }
}