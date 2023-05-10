import java.util.Scanner;

public class CalculoAguaFuncionario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o nome do funcionário: ");
    String nome = sc.nextLine();

    System.out.print("Insira o peso atual do funcionário em kg: ");
    double peso = sc.nextDouble();

    System.out.print("Insira a quantidade de água já ingerida no dia em litros: ");
    double qtdAguaIngerida = sc.nextDouble();

    sc.close();

    // Calculo da quantidade ideal de água, neste caso, usei o Math.ceil para arrendodamento do valor
    double qtdAguaNecessaria = Math.ceil ((peso * 35 / 1000));

    // Calculo da quantidade de água a ser ingerida ainda no dia
    double qtdAguaFalta = qtdAguaNecessaria - qtdAguaIngerida;

    //Saida do calculo para o usuário

    System.out.println("Nome do funcionário: " + nome);
    System.out.println("Peso do funcionário: " + peso + " kg");
    System.out.println("Quantidade de água ingerida: " + qtdAguaIngerida + " litros");
    System.out.println("Quantidade ideal de água a ingerir: " + qtdAguaNecessaria + " litros");
    
    if (qtdAguaFalta <= 0) {
      System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
    } else {
      System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + qtdAguaFalta + " litros! Você consegue!");
    }
  }
}
