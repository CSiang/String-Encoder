package Decoding;

import Util.Constant;

public class DecoderImpl implements Decoder{

    @Override
    public String decode(String encodedText) {
        StringBuilder sb = new StringBuilder(encodedText.length() - 1);

        char decodingKey = encodedText.charAt(0);
        int offset = Constant.refMap.get(decodingKey);

        char c;
        int ref; int arrLen = Constant.refArray.length;

        for (int i=1; i< encodedText.length(); i++) {
            c = encodedText.charAt(i);

            if (Constant.refMap.containsKey(c)) {
                ref = Constant.refMap.get(c);
                ref = (ref + offset);
                if (ref > arrLen - 1) {
                    ref -= arrLen;
                }
                c = Constant.refArray[ref];
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
}
