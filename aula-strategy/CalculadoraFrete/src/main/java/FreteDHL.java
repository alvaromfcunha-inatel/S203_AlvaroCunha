public class FreteDHL implements Fretavel {
    @Override
    public double calcularValor(Double peso) {
        if(peso < 20.00)
            return 100.00;
        else
            return 90.00;
    }
}
