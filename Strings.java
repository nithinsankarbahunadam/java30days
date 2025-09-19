public class Strings {
    public static void main(String[] args) {
        // In java Strings can be created in two ways
        // 1. By using string literals
        String str1 = "Hello, World!";
        // 2. By using the new keyword
        String str2 = new String("Hello, Java!");

        // Print the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String methods
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 7 of str1: " + str1.charAt(7));
        System.out.println("Substring of str1 from index 7 to 12: " + str1.substring(7, 12));
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
        System.out.println("Replace 'World' with 'Java' in str1: " + str1.replace("World", "Java"));
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Does str2 end with 'Java!'? " + str2.endsWith("Java!"));
        System.out.println("Trimmed str2: '" + str2.trim() + "'");
        System.out.println("Is str1 equal to str2? " + str1.equals(str2));
        System.out.println("Is str1 equal to str2 (ignore case)? " + str1.equalsIgnoreCase(str2));
        System.out.println("Split str1 by comma: " + java.util.Arrays.toString(str1.split(",")));
        System.out.println("String representation of str1: " + str1.toString());
        System.out.println("Hash code of str1: " + str1.hashCode());
        System.out.println("Compare str1 and str2: " + str1.compareTo(str2));
        System.out.println("Is str1 empty? " + str1.isEmpty());
        System.out.println("Convert str1 to char array: " + java.util.Arrays.toString(str1.toCharArray()));
        System.out.println("Join str1 and str2 with a space: " + String.join(" ", str1, str2));
        System.out.println("Formatted string: " + String.format("This is a formatted string: %s and %s", str1, str2));
        System.out.println("Value of integer 100 as string: " + String.valueOf(100));
        System.out.println("Value of double 99.99 as string: " + String.valueOf(99.99));
        System.out.println("Value of boolean true as string: " + String.valueOf(true));
        System.out.println("Value of char 'A' as string: " + String.valueOf('A'));
        System.out.println("Value of char array {'H', 'e', 'l', 'l', 'o'} as string: " + String.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}));
        System.out.println("Value of object str1 as string: " + String.valueOf(str1));
        System.out.println("Value of null as string: " + String.valueOf((Object) null));
        System.out.println("String representation of str1 using toString(): " + str1.toString());
        System.out.println("String representation of str2 using toString(): " + str2.toString());
        System.out.println("String representation of null using String.valueOf(): " + String.valueOf((Object) null));
        System.out.println("String representation of null using toString(): " + String.valueOf((Object) null));
        System.out.println("String representation of str1 using String.valueOf(): " + String.valueOf(str1));
        System.out.println("String representation of str2 using String.valueOf(): " + String.valueOf(str2));
        System.out.println("String representation of integer 100 using String.valueOf(): " + String.valueOf(100));
        System.out.println("String representation of double 99.99 using String.valueOf(): " + String.valueOf(99.99));
        System.out.println("String representation of boolean true using String.valueOf(): " + String.valueOf(true));
        System.out.println("String representation of char 'A' using String.valueOf(): " + String.valueOf('A'));
        System.out.println("String representation of char array {'H', 'e', 'l', 'l', 'o'} using String.valueOf(): " + String.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'}));
        System.out.println("String representation of null using String.valueOf(): " + String.valueOf((Object) null));  
        System.out.println("String representation of null using toString(): " + String.valueOf((Object) null));
        System.out.println("String representation of str1 using toString(): " + str1.toString());
        System.out.println("String representation of str2 using toString(): " + str2.toString());
        System.out.println("String representation of null using String.valueOf(): " + String.valueOf((Object) null));
        System.out.println("String representation of null using toString(): " + String.valueOf((Object) null));
        System.out.println("String representation of str1 using String.valueOf(): " + String.valueOf(str1));
        System.out.println("String representation of str2 using String.valueOf(): " + String.valueOf(str2));
    }
}
