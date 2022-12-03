public class DivByZeroExeption extends Exception{
    private float denominator;
    public float getDenominator() {
        return denominator;
    }

    public DivByZeroExeption(String message, float denominator) {
        super(message);
        this.denominator = denominator;
    }

}
