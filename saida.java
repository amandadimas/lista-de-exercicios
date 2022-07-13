import javax.swing.JOptionPane;
public class saida{

    public static void main (String[] args){
        String aux= "";
        float altura= 0, peso= 0, imc=0;
        try{
            aux=JOptionPane.showInputDialog("Informe sua altura:");
            altura = Float.parseFloat(aux);

            aux=JOptionPane.showInputDialog("Informe seu peso:");
            peso = Float.parseFloat(aux);
            

            imc =peso/(altura*altura);
            if (imc<18.5) {
                JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ "e a categoria é: peso abaixo do normal");
            }
            if (imc>18.5) {
                JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ "e a categoria é: peso abaixo do normal");
            }
            if (imc >= 18.5 && imc <= 24.4) {
                JOptionPane.showMessageDialog(null, "Peso ideal.");
            }
            if (imc >= 24.5 && imc <= 29.9) {
                JOptionPane.showMessageDialog(null, "Peso Pré-obesidade.");
            }
            if (imc >= 30 && imc <= 34.9) {
                JOptionPane.showMessageDialog(null, "Obesidade classe 1.");
            }
            if (imc >= 35 && imc <= 39.9) {
                JOptionPane.showMessageDialog(null, "Obesidade severa.");
            }
            if (imc > 39.9) {
                JOptionPane.showMessageDialog(null, "Obesidade móbida.");
            }
          }  
          catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro, por favor tente novamente");
          }    
        }
    
}
