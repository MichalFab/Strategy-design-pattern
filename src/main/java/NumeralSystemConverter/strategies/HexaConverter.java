package NumeralSystemConverter.strategies;

import NumeralSystemConverter.ConvertingStrategy;

public class HexaConverter implements ConvertingStrategy {
    public String convert(int number) {
        return Integer.toHexString(number);
    }
}
