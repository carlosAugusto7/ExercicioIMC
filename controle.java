package controle;
import dominio.*;
import java.util.Scanner;

public class ControlaPessoa {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Digite a ID: ");
       int id = scanner.nextInt();
       scanner.nextLine();  // Limpar o buffer do teclado após o nextInt()
       
       System.out.print("Digite o nome: ");
       String nome = scanner.nextLine();
       
       System.out.print("Digite a idade: ");
       int idade = scanner.nextInt();
       
       System.out.print("Digite o peso: ");
       double peso = scanner.nextDouble();
       
       System.out.print("Digite a altura: ");
       double altura = scanner.nextDouble();
       
       // Cria o objeto pessoa com os dados fornecidos
       Pessoa pessoa = new Pessoa(id, nome, idade, peso, altura);
       
       // Exibe os dados e o IMC da pessoa
       pessoa.listarPessoa();
   }
}
