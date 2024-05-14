
import java.util.Random;
import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas?"));
        if (qtd <1) {
            qtd = 10; //valor default arbitrario
        }
        Nota[] notas = new Nota[qtd];
        // gerar as notas aleatoriamente
        Random gerador = new Random();
        System.out.println("Notas geradas: ");
        for (int i = 0; i < notas.length; i++) {
            notas [i] = new Nota(gerador.nextDouble()*10);
            System.out.println(notas[i].getValor());
        }
        //calcular a média
        double soma = 0.0;
        for (int i=0; i < notas.length; i++) {
            soma += notas [i].getValor();
        }
        double media = soma/notas.length;
        double variancia = 0.0;
        for (int i = 0; i < notas.length; i++) {
            double x = notas [i].getValor() - media;
            variancia +=  Math.pow(x, 2);           
        }
        variancia /= notas.length;
        double desvio = Math.sqrt(variancia);
        System.out.println("A media das notas é: " + media);
        System.out.println("O desvio pádrao das notas é: " + desvio); 
    }   
}
