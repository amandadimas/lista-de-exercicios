

import java.util.Scanner;
public class exerc7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Double  salario;
            Double horas;

            System.out.print("Digite quantas horas foram trabalhadas: ");    
            horas = input.nextDouble();

            salario = (horas * 10.25);
        

       
        System.out.println("O valor do salário será de: R$"+ salario);
        }
    }
}
