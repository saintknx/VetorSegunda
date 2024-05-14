
import java.util.Random;

public class VetorMedia {
    public static void main(String[] args) {
        double[] v = new double [10]; 
        // inicializar o vetor com numero número aleatoria   
        Random gerador = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextDouble()*10;
        }    
        // calcular a media e soma dos elementos do vetor
        double soma = 0.0; // variavel acumuladora
        System.out.println("Os valores criados foram: ");
        for (int i = 0; i < v.length; i++){
            soma += v[i];
            System.out.print(v[i]);
        } 
        double media = soma / v.length;
        System.out.println("A média é:" + media);
        System.out.println("A soma é: "+ soma);
    }
   
}
