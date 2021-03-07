public class NameEncoderDecoder {
    public String encode(String name){
        String codeName = name.replace("a", "5")
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU"+codeName+"YESNOTFORYOU";
    }
    public String decode(String name){
        String decodeName = name.replace("5", "a")
                .replace("NOTFORYOU", "")
                .replace("YESNOTFORYOU", "")
                .replace("YES", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
        return decodeName;
    }
    public static void main (String [] args){
        NameEncoderDecoder decoder = new NameEncoderDecoder();
        NameEncoderDecoder encoder = new NameEncoderDecoder();
        System.out.println("encode(\"Crab\") = " +encoder);
        System.out.println("decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + decoder);
        System.out.println("decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + decoder);
    }
}
