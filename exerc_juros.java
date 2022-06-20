package exerc_30_05;
import java.util.Scanner;
public class exerc_juros {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double deposito, juros, resultado;
        System.out.println("Digite o valor a ser depositado: ");
        deposito = input.nextDouble();
        juros = (deposito*0.007);
        resultado = deposito + juros;
        juros = (juros*12) + deposito;
        System.out.println("Seu Rendimento em um mês é de: R$" + resultado);
        System.out.println("Seu Rendimento em um ano é de: R$" + juros);






    }

}
