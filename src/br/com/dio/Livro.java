package br.com.dio;

public class Livro {
    private String Nome;
    private String numPaginas;


    public Livro(String nome, String numPaginas) {
        this.Nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + Nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
