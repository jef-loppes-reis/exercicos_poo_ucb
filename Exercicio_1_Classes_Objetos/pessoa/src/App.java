public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Lopes", "Masculino", 29);
        System.out.println("Nome: " + pessoa.get_nome());
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.println("Idade: " + pessoa.idade);
    }
}
