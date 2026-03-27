import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Veterinario> veterinarios = new ArrayList<>();

        int escolhaUsuario;

        Veterinario veterinarioPadrao = new Veterinario("Jorge", 36, "343434", 70);

        do {

            System.out.println("---------------------------------");
            System.out.println("Cliníca Veterinária Patinhas");
            System.out.println("---------------------------------");

            System.out.println("-------------- MENU PRINCIPAL ----------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir Dados Cadastrados");
            System.out.println("3 - Atendimento");
            System.out.println("4 - Sair");
            System.out.print("Insira uma opção: ");
            escolhaUsuario = scan.nextInt();

            switch (escolhaUsuario) {
                case 1:

                    System.out.println("----------------------");
                    System.out.println("Cadastro de Usuário");
                    System.out.println("----------------------");
                    int escolhaTipoUsuario;


                    System.out.println("Qual tipo de usuário?");
                    System.out.println("1 - Cliente");
                    System.out.println("2 - Veterinário");
                    System.out.println("3 - Sair");
                    System.out.print("Insira uma opção: ");
                    escolhaTipoUsuario = scan.nextInt();

                    if (escolhaTipoUsuario == 1) {
                        String nome;
                        int idade;
                        String cpf;
                        String nomeAnimal;

                        System.out.println("------------------");
                        System.out.println("Cadastro de Cliente");
                        System.out.println("------------------");

                        System.out.print("Insira o nome do cliente: ");
                        nome = scan.next();
                        System.out.print("Insira o CPF do cliente: ");
                        cpf = scan.next();
                        System.out.print("Insira a idade do cliente: ");
                        idade = scan.nextInt();
                        System.out.print("Insira o nome do animal de estimação do cliente: ");
                        nomeAnimal = scan.next();


                        Cliente c = new Cliente(nome, idade, cpf, nomeAnimal);
                        clientes.add(c);

                    } else if (escolhaTipoUsuario == 2) {
                        String nome;
                        int idade;
                        String registroProfissional;
                        double valorConsulta;

                        System.out.println("------------------");
                        System.out.println("Cadastro de Veterinário");
                        System.out.println("------------------");

                        System.out.print("Insira o nome do Veterinário: ");
                        nome = scan.next();
                        System.out.print("Insira a idade do Veterinário: ");
                        idade = scan.nextInt();
                        System.out.print("Insira o registro profissional do Veterinário: ");
                        registroProfissional = scan.next();
                        System.out.print("Insira o valor da consulta: R$");
                        valorConsulta = scan.nextDouble();


                        Veterinario v = new Veterinario(nome, idade, registroProfissional, valorConsulta);
                        veterinarios.add(v);

                    } else if (escolhaUsuario == 3) {
                        System.out.println("Saindo...");
                        break;
                    }
                    break;

                case 2:

                    System.out.println("----------------------");
                    System.out.println("Exibição de Usuários Cadastrados");
                    System.out.println("----------------------");

                    System.out.println("Qual tipo de usuário deseja exibir?");
                    System.out.println("1 - Clientes");
                    System.out.println("2 - Veterinários");
                    System.out.println("3 - Sair");
                    System.out.print("Insira uma opção: ");
                    escolhaTipoUsuario = scan.nextInt();

                    if (escolhaTipoUsuario == 1) {

                        System.out.println("----------------------");
                        System.out.println("Clientes Cadastrados");
                        System.out.println("----------------------");

                        for (Cliente c : clientes) {
                            System.out.println("Cliente: ");
                            System.out.println("------------------------");
                            c.apresentacaoDados();

                        }
                    } else if (escolhaTipoUsuario == 2) {

                        System.out.println("----------------------");
                        System.out.println("Veterinários Cadastrados");
                        System.out.println("----------------------");

                        for (Veterinario v : veterinarios) {
                            System.out.println("Veterinário: ");
                            System.out.println("------------------------");
                            v.apresentacaoDados();

                        }

                    }
                    break;

                case 3:

                    System.out.println("----------------------");
                    System.out.println("Atendimento");
                    System.out.println("----------------------");

                    veterinarioPadrao.atendimentoVeterinario();


            } // fim switch case

        } while (escolhaUsuario != 4);


    }
}