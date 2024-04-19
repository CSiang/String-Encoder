package Encoding;

import Util.Constant;
import Util.RandomNumGenerator;

public class EncoderImpl implements Encoder{

    @Override
    public String encode(String plainText) {
        
        StringBuilder sb = new StringBuilder(plainText.length() + 1);
        int offset = RandomNumGenerator.generate();

        sb.append(Constant.refArray[offset]);

        char c;
        int ref; int arrLen = Constant.refArray.length;

        for (int i=0; i< plainText.length(); i++) {
            c = plainText.charAt(i);

            if (Constant.refMap.containsKey(c)) {
                ref = Constant.refMap.get(c);
                ref = (ref - offset);
                if (ref < 0) {
                    ref += arrLen;
                }
                c = Constant.refArray[ref];
            } 
            sb.append(c);
        }

        return sb.toString();
    }

    
}
