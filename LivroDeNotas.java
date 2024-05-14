
import java.util.Arrays;

public class LivroDeNotas	{
    private String	nomeDisciplina;
    private double notas1 [];
    private double notas2 [] = {2, 13, 7.5, 1, 9};
    private double medias [];
    private int qtdeAlunos;

    public LivroDeNotas	(String	nomeDisciplina,	int qtdeAlunos)	{
        this.nomeDisciplina =	nomeDisciplina;
        this.notas1 =	new double [qtdeAlunos];
        // this.notas2 =	new double [qtdeAlunos];
        this.medias =	new double [qtdeAlunos];
        this.qtdeAlunos =	qtdeAlunos;
    }

    public String	getNomeDisciplina()	{
        return nomeDisciplina;
    }

    public double maiorNota1(){
        double maior = 0;
        for (int i = 0; i < qtdeAlunos; i++ ){
            if (notas1[i] > maior) {
                maior = notas1[i];
            }
        }
        return maior;
    }

    public double maiorNota2(){
        return Arrays.stream(notas2).max().orElse(0);

    }

    public double segundaMaiorNota1(){
        double maior = maiorNota1();
        double segundaMaior = 0;
        for(double nota : notas1){
            if (nota < maior && nota > segundaMaior) {
                segundaMaior = nota;
            }
        }
        return segundaMaior;
    }
    public double segundaMaiorNota2(){
        double maior = 0;
        double segundaMaior = 0;
        for (double nota : notas2){
            if (nota > maior){
                segundaMaior = maior; 
                maior = nota;         
            } else if (nota > segundaMaior){
                segundaMaior = nota;
            }
        }
        return segundaMaior;
    }

    public void estatisticas(){
        double media = Arrays.stream(medias).average().orElse(0);
        double variancia = Arrays.stream(medias).map(v -> Math.pow(v - media, 2)).average().orElse(0);
    }

    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas("TESTE", 5);
        System.out.println(livroDeNotas.segundaMaiorNota2());
    }
}
