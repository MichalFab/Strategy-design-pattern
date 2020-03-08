package NumeralSystemConverter;

public class Context {
    private ConvertingStrategy strategy;

    public Context(ConvertingStrategy strategy) {
        this.strategy = strategy;
    }

    public String convert(int number) {
        return strategy.convert(number);
    }
}
