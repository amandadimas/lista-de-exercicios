public class testdrive {
    public static void main(String[]args){
        carro c1 = new carro();
        c1.marca="fiat";
        c1.cor="preto";
        c1.velocidade= 60;
        c1.ano = 2015;


        c1.aceleracao (30);
        System.out.println ("Velocidade inicial do carro1 é: " +c1.velocidade + " km/hora" );
        c1.freio (10);
        System.out.println ("Velocidade atual é de: " +c1.velocidade+ " km/hora");
      
    }   
}
