public class FreteSedex implements Fretavel {
    @Override
    public double calcularValor(Double peso) {
        if(peso < 10.00)
            return 50.00;
        else if(peso < 20.00)
            return 70.00;
        else
            return 90.00;
    }
}
