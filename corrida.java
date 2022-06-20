public class corrida {
    public static void main(String[]args){
        carro c1 = new carro();
        c1.marca="fiat";
        c1.cor="preto";
        c1.velocidade= 60;
        c1.ano = 2015;

        carro c2 = new carro();
        c2.marca="audi";
        c2.cor="branco";
        c2.velocidade= 80;
        c2.ano = 2016;

        c1.aceleracao (30);
        System.out.println ("Carro 1 da Marca " + c1.marca + " da cor " + c1.cor + " do ano " + c1.ano + " chegou com a velocidade de: " + c1.velocidade + " km/hora" );
        c2.aceleracao (30);
        System.out.println ("Carro 2 da Marca " + c2.marca + " da cor " + c2.cor + " do ano " + c2.ano + " chegou com a velocidade de: " + c2.velocidade + " km/hora" );
}
}