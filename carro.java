public class carro{

//atributos
String marca;
String cor;
Integer velocidade;
Integer ano;

//metodos
void aceleracao (Integer acelerar){
    velocidade += acelerar;
}

void freio (Integer freiar){
    velocidade -= freiar;
    }
}