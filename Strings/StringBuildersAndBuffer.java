package Strings;

public class StringBuildersAndBuffer {
    public static void main(String[] args) {
        String series = "";

        //        for (int i = 0; i < 26; i++) {
        //        }
        
                //here series obj is created every time during looping in string pool (in heap memory)
                //when first obj 'a' second obj 'ab', third obj 'abc'.....so on.. final obj 'abcdefghijklmnopqrstuvwxyz'
        
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a'+i);
                    // System.out.println(ch);     // creating new objects everytime
                    series = series + ch;  // series += ch
                }
                System.out.println("series :" + series);
        
        
                //String Builder

                StringBuilder stringBuilder = new StringBuilder();
                //instead of creating new objects again and again, It is changing only the original obj which is created here.
                // this is not immutable it is mutable just like arrays
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a'+i);
                    // System.out.println(ch);      // appending the values everytime in the same obj
                    stringBuilder.append(ch);
                }
                System.out.println(stringBuilder);
        
                // String Buffer

                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a'+i);
                    // System.out.println(ch);      // appending the values everytime in the same obj
                    stringBuffer.append(ch);
                }
                System.out.println(stringBuffer);
        
                stringBuilder.reverse();
                System.out.println(stringBuilder);
        
                stringBuilder.deleteCharAt(0);
                System.out.println(stringBuilder);
        
    }
}


/*
 * Differents between stringBuilder and StringBuffer
 StringBuilder is thread safe,  whereas stringBuffer is a thread safe
 StringBuffer is slower than StringBuilder. Because thread safty functionality of StringBuffer
    NOTE : Performance
    String < String Buffer < String Builder
 */