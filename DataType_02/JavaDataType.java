package DataType_02;

class JavaDataType{

    public static void main(String[] args) {
        
        byte byteVar = 127;
        short shortVar = 257; 
        int intVar = 1;
        long longVar = 893140l;   //represent long integer type

        float floatVar = 2.10f;
        double doubleVar = 3.5;
        
        
        char charVar = 'a';
        
        boolean booleanVar = true;

        System.out.println(byteVar);
    }

}


/*
Syntex to create variable
    dataType  variableName = value;
 
Datatypes are categories into primitive and non-primitive datatype.

There are 8 primitive datatype
* integer ---byte, short, int, long
* float --- float , double 
* character ---char 
* boolean --- boolean

Range and way to declare different data type variable
        int -> 4 bytes -- 32 bits  -- -2147483648 to 2147483647
        short -> 2 bytes -- 16 bits -- -32768 to 32767
        byte -> 1 byte -- 8 bits -- -128 to 127
        long -> 8 bytes -- 64 bits -- -9223372036854775808 to 9223372036854775807
        float -> 4 bytes -- 32 bits -- 1.4e-45 to 3.4028235e+38
        double -> 8 bytes -- 64 bits -- 4.9e-324 to 1.7976931348623157e+308
        char -> 2 bytes -- 16 bits -- 0 to 65535
        boolean ->  value is either true or false 
        
        --> ASCII - American Standard Code for Information Interchange
        --> 1 bytes contain 8 bits. so Each byte contains 8 bits. for int, 8 x 4 = 32 bits.

*/