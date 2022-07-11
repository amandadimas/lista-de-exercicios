
import java.util.Scanner;

public class exerc8{

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Double salario, horastrab;
               System.out.println("Informe as horas trabalhadas:");
                
                horastrab = input.nextDouble();
                
                salario = (horastrab * 10.25);
   
             //Atividade 7
             if(salario < 50){
                System.out.println("Atenção, dirija-se à direção do Hotel!");
            }else{
                System.out.print("O valor do salário será de: R$"+salario);
            }
        }    
    }
        }

