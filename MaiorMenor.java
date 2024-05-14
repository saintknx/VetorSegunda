import java.util.Random;
import javax.swing.JOptionPane;

public class MaiorMenor {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tamanho do vetor?"));
        if (tamanho < 1) {
            tamanho = 10;
        System.err.println("Usando tamanho padrão");
            
        }
        int [] v = new int[tamanho];
        Random gerador = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(1000);
        }
        // fazer uma busca sequencial para encontrar o maior e menor numero
        int maior = v[0];
        int menor = v[0];
        System.out.println("Os numeros gerados foram: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
                
            }
        }
        System.err.println("O maior é " + maior);
        System.err.println("O menor é "+ menor);
    }
}
