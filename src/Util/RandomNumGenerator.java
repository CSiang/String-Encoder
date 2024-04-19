package Util;

public class RandomNumGenerator {
    
    public static int generate() {
        return (int)(Math.random() * (Constant.refArray.length - 1));
    }

}
