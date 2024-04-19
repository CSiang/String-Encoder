import Encoding.Encoder;
import Encoding.EncoderImpl;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Create the Reference table in hashmap
        // 2. Create encoder logic
        // 3. Create decoder logic

        Encoder encoder = new EncoderImpl();

        String plainText = "HELLO WORLD";

        String result = encoder.encode(plainText);

        System.out.println("result: " + result + "\n");


    }
}
