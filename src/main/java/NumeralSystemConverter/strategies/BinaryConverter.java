package NumeralSystemConverter.strategies;

import NumeralSystemConverter.ConvertingStrategy;

public class BinaryConverter implements ConvertingStrategy {
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
