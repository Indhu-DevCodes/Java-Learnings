package Strings;

public class StringsPrettyPrinting {

    public static void main(String[] args) {

        float a = 3.123112f;
        System.out.printf("Formatted number %.2f",a);    // print till 2 decimal value
        System.out.println();

        System.out.printf("Pie value: %.3f%%",Math.PI);
        System.out.println();

        System.out.printf("Hello %s I am your friend %s", "indu", "Cool");
        System.out.println();

        System.out.printf("%s gap filler %d %f", "Astring", 10, 12.3);
        System.out.println();

//        System.out.printf("%t", new Date());    // it will throw 'UnknownFormatConversionException'

        //%n and %% format specifiers escape sequences. The %n inserts a newline. The %% inserts a percent sign.
        System.out.printf("line%nline %d%% complete", 88);

    }
}

       /**
     * Specifier List
     * The following table shows the format specifiers:
     * Format Specifier	        Conversion Applied
     *      %a %A	        Floating-point hexadecimal
     *      %b %B	        Boolean
     *        %c	        Character
     *        %d	        Decimal integer (base 10)
     *      %h %H	        Hash code of the argument
     *      %e %E	        Scientific notation / exponential floating point number
     *        %f	        Decimal floating-point
     *        %i            Integer (base 10)
     *      %g %G	        Uses %e or %f, whichever is shorter
     *        %o	        Octal integer
     *        %n	        Inserts a newline character
     *      %s %S	        String
     *      %t %T	        Time and date
     *      %u              unsigned decimal (integer) number
     *      %x %X	        Integer hexadecimal (base 16)
     *        %%	        Inserts a % sign
     *
     * If the argument doesn't match the type-checks, an IllegalFormatException is thrown.
     */