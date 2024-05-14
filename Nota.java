public class Nota {
    private double valor;

    public Nota (double valor){
        if (valor >=0.0 && valor <= 10.0){
            this.valor = valor;
            
        }else {
            //valor padrao arbitrario
            this.valor = 5.0;
        }
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        if(valor >= 0.0 && valor <= 10.0){
            this.valor = valor;
        }
        
    }
}
