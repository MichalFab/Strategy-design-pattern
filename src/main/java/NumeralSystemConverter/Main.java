package NumeralSystemConverter;

import NumeralSystemConverter.strategies.BinaryConverter;
import NumeralSystemConverter.strategies.HexaConverter;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context(new HexaConverter());
        System.out.println(ctx.convert(1000));
//      Result: 3e8
//      If you change HexaConverter to BinaryConverter, the result will be: 1111101000
    }
}
