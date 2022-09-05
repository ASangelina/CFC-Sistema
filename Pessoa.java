package modelo;

public class Pessoa{
    private final String cpf;
    private String nome;
    private String endereco;

    public Pessoa(String cpf, String nome,String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return cpf + ";" + nome + ";" + endereco;
    }

}