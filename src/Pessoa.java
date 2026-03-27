public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentacaoDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
