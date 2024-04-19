import java.io.Console;

import Decoding.Decoder;
import Decoding.DecoderImpl;
import Encoding.Encoder;
import Encoding.EncoderImpl;

public class App {
    public static void main(String[] args) throws Exception {

        Encoder encoder = new EncoderImpl();
        Decoder decoder = new DecoderImpl();

        System.out.print("Your text to be encoded: ");
        Console console = System.console();
        String plainText = console.readLine();

        String result, decodedString;

        for (int i=0; i<10; i++) {
            result = encoder.encode(plainText);
            System.out.println("result: " + result );

            decodedString = decoder.decode(result);
            System.out.println("decodedString: " + decodedString + "\n");
        }



    }
}
