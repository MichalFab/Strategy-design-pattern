package NumeralSystemConverter.strategies;

import NumeralSystemConverter.ConvertingStrategy;

public class OctaConverter implements ConvertingStrategy {
    public String convert(int number) {
        return Integer.toOctalString(number);
    }
}
