public class FreteJadLog implements Fretavel {
    @Override
    public double calcularValor(Double peso) {
        if(peso < 30.00)
            return 0.00;
        else
            return 150.00;
    }
}
