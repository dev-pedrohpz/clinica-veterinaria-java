import java.util.Scanner;

public class Veterinario extends Pessoa{

    private String registroProfissional;
    private double valorConsulta;
    private double valorUrgencia;

    Scanner scan = new Scanner(System.in);

    public Veterinario(String nome, int idade, String registroProfissional, double valorConsulta) {
        super(nome, idade);
        this.registroProfissional = registroProfissional;
        this.valorConsulta = valorConsulta;
    }

    @Override
    public void apresentacaoDados() {
        super.apresentacaoDados();
        System.out.println("Registro Profissional: " + this.registroProfissional);
        System.out.println("Valor consulta: R$" + this.valorConsulta);
    }

    public void atendimentoVeterinario(){

        System.out.println("O valor da consulta é: R$" + this.valorConsulta);
        double totalConsulta;
        int respostaUsusario;

        do {

            System.out.println("A consulta é de emergência?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.println("3 - Sair");
            System.out.print("Insira: ");
            respostaUsusario = scan.nextInt();

            if(respostaUsusario == 1){

                double valorConsultaEmergencia;
                System.out.print("Informe o valor estipulado para a consulta de emergência: ");
                valorConsultaEmergencia = scan.nextDouble();
                this.valorUrgencia = valorConsultaEmergencia;

                System.out.println("O acréscimo é de: R$" + this.valorUrgencia);
                totalConsulta = this.valorConsulta + valorConsultaEmergencia;
                System.out.println("O valor total da consulta é de: R$" + totalConsulta);
                break;

            } else if (respostaUsusario == 2) {
                System.out.println("O valor da consulta permanece o mesmo.");
                System.out.print("Valor: R$");
                System.out.println(this.valorConsulta);
                break;
            }

        }while (respostaUsusario != 3);


    }

    public double getValorUrgencia() {
        return valorUrgencia + this.valorConsulta;
    }

    public void setValorUrgencia(double valorUrgencia) {
        this.valorUrgencia = valorUrgencia;
    }

}
