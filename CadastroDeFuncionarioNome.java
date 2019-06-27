package cadastro.de.funcionario.nome;
import java.util.Scanner;
public class CadastroDeFuncionarioNome {

    //Função princial do programa
    public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    Scanner sc = new java.util.Scanner(System.in);
    
    //Variaveis imprimindo na tela;
    System.out.println("Digite o primeiro nome do funcionario: ");
    String nome = sc.next();
    System.out.println("Digite o email do funcionario: ");
    String email = sc.next();
    System.out.println("Digite o segundo nome do funcionario: ");
    String nome2 = sc.next();
    System.out.println("Digite o email do funcionario: ");
    String email2 = sc.next();
    System.out.println("Digite o terceiro nome do funcionario: ");
    String nome3 = sc.next();
    System.out.println("Digite o email do funcionario: ");
    String email3 = sc.next();
    System.out.println("Digite o quarto nome do funcionario: ");
    String nome4 = sc.next();
    System.out.println("Digite o email do funcionario: ");
    String email4= sc.next();
    System.out.println("Digite o quinto nome do funcionario: ");
    String nome5 = sc.next();
    System.out.println("Digite o email do funcionario: ");
    String email5 = sc.next();
    System.out.printf("Cadastro com sucesso - parte 1");
    
    //variaveis 2
     System.out.println("\nDigite o salario do primeiro funcionario: ");
    int a = sc.nextInt();
    System.out.println("\nDigite o salario do segundo funcionario: ");
    int b = sc.nextInt();
    System.out.println("\nDigite o salario do terceiro funcionario: ");
    int c = sc.nextInt();
    System.out.println("\nDigite o salario do quarto funcionario: ");
    int d = sc.nextInt();
    System.out.println("\nDigite o salario do quinto funcionario: ");
    int e = sc.nextInt();
    
    //soma total do funcionarios
    int soma = sc.nextInt();
    
    //Media final
    soma = ( a + b + c + d + e);
    
    //Imprimindo na tela
    System.out.println("\n Soma salario de todos funcionarios é: " +(soma));

    //Fim do cadastro
    System.out.printf("\n Cadastro com sucesso");
    






    
    }
}
