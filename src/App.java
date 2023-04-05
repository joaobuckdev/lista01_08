import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double salario;
        double horas;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira quanto você ganha por hora: ");
        salario = teclado.nextDouble();

        System.out.print("Insira quantas horas você trabalha por mês: ");
        horas = teclado.nextDouble();
        teclado.close();

        System.out.println(" ");
        System.out.println("O sua renda mensal é de: " + salario*horas);

    }
}
