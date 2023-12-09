public class Livro {
    String titulo;
    String autor;
    int numPag;

    public Livro(){}
    public Livro(String titulo, String autor, int numPag){
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void imprimirInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de paginas: " + this.numPag);
    }
}
