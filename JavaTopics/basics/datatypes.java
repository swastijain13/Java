package JavaTopics.basics;

public class datatypes {
    public static void main(String[] args) {
        byte byteVar = 100;           // byte range: -128 to 127
        short shortVar = 10000;       // short range: -32,768 to 32,767
        int intVar = 100000;          // int range: -2^31 to 2^31-1
        long longVar = 100000000L;    // long range: -2^63 to 2^63-1
        
        float floatVar = 5.75f;       // float (single precision)
        double doubleVar = 19.99;     // double (double precision)
        
        char charVar = 'A';           // character
        boolean booleanVar = true;    // boolean
        
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
    }
}
