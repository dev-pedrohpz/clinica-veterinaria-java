public class Cliente extends Pessoa{

    private String cpf;
    private String nomeAnimal;

    public Cliente(String nome, int idade, String cpf, String nomeAnimal) {
        super(nome, idade);
        this.cpf = cpf;
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public void apresentacaoDados() {
        super.apresentacaoDados();
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome do animal de estimação: " + this.nomeAnimal);
    }
}
