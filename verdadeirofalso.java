import java.util.Scanner;
public class verdadeirofalso {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int num;
            
            System.out.println ("Digite um número: ");
            num= input.nextInt();

            if (num>0)
            {
                System.out.println("Verdadeiro");
            }
            else
            {
                System.out.println("Falso");  
            }
        }
}
} 