public class VetorDeInts {
    public static void main(String[] args) {
        int [] v = new int[5];
        
        v[0] = 6;
        v[1] = 8;
        v[2] = -4;
        v[3] = 20;
        v[4] = 9;
        System.out.println("O tamanho de v é: " +v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("\nO valor da posição %d é %d", i, v[i]);
        }
    }
}