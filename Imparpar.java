public class Imparpar{
public static void main(String[] args) {
  
  int soma=0;
  long multi=1;
  
    for (int i=1;i<30;i++){
        if ((i%2)==1){
        soma +=i;
       } else {
         multi *=i;
              }
  }
  System.out.print("O valor da soma sequencial é de: " + soma +"\n");
  System.out.print("O valor da multiplicação é de: " + multi +"\n");
  }
  }
  
  

