public class CalculadoraFrete {
    public double calcula(Fretavel frete, double peso) {
       Double valor = frete.calcularValor(peso);
       return valor;
    }
}
