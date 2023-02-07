@get char at index
int index = str.charAt(0);
(char)index; //>>1

@ get char (Unicode code point)
int val1 = str.codePointAt(1); //codepoint at index 1

@  get the character (Unicode code point) before the specified index within the String
str.codePointBefore(1); //codePoint b4 index 1

@ to count a number of Unicode code points in the specified text range of a String
// codepoint from index 1 to index 10
    int ctr = str.codePointCount(1, 10);

@  to compare two strings lexicographically. 
- Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. 
  int result = str1.compareTo(str2);
<0: str1 less than str2
0: equal to
>0: greater than

@  to compare two strings lexicographically, ignoring case differences
int result = str1.compareToIgnoreCase(str2);

@ to concatenate a given string to the end of another string
String str3 = str1.concat(str2);

@ to test if a given string contains the specified sequence of char values
str1.contains(str2)

@ to compare a given string to the specified character sequence
CharSequence cs = "example.com";
str1.contentEquals(cs)
  
@ to compare a given string to the specified string buffer
StringBuffer strbuf = new StringBuffer(str1);
str1.contentEquals(strbuf); >>true
str2.contentEquals(strbuf); >>false

@ check whether two String objects contain the same data
@ to create a new String object with the contents of a character array
char[] arr_num = new char[] { '1', '2', '3', '4' };
String str = String.copyValueOf(arr_num, 1, 3);

@ to check whether a given string ends with the contents of another string
str1.endsWith(end_str); >> true/false
  
@ check whether two String objects contain the same data
str1.equals(str2) >>true/false
  
@ to compare a given string to another string, ignoring case considerations
str1.equalsIgnoreCase(str2);

@ to print current date and time in the specified format
Calendar c = Calendar.getInstance();
System.out.format("%tB %te, %tY%n", c, c, c);
System.out.format("%tl:%tM %tp%n", c, c, c);

@ to get the contents of a given string as a byte array.
byte[] byte_arr = str.getBytes();       //copy String contents to byte array
String new_str = new String(byte_arr);  //create new String using contents of byte array

@  to get the contents of a given string as a character array
// Copy the contents of the String to a byte array.
        // Only copy characters 4 through 10 from str.
        // Fill the source array starting at position 2.
        char[] arr = new char[] { ' ', ' ', ' ', ' ',
                                  ' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);


  
