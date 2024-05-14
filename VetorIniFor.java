import javax.swing.JOptionPane;
/*
 * vetor inicializado pelo usuario em um loop for
 */
public class VetorIniFor {
    public static void main(String[] args) {
        double [] v = new double[5];

        for (int i=0; i < v.length; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Digite o valor da posição %d/%d", i + 1, v.length)));
        }
        System.out.println("Os valores digitados foram:");
        for (int i=0; i< v.length; i++){
            System.out.println(v[i]);
        }
    }
}
