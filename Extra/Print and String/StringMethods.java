public class StringMethods {

    /*
     * int length() String 
     * toUpperCase() 
     * String toLowerCase() 
     * String trim() 
     * String substring(int begin) 
     * String substring(int begin, int end)
     * String replace(char old , char new) 
     * boolean startsWith(String s) 
     * boolean endsWith(String s) 
     * char charAt(int index) 
     * int indexOf(String s) 
     * int lastIndexOf(String s) 
     * boolean equals(String s) 
     * boolean equalsIgnoreCase(String s) 
     * int compareTo(String s)
     * String valueOf(int i)
     * 
     */
    public static void main(String[] args) {

        String str = "Java";
        String s = "Java";
        int len = str.length();
        System.out.println("Length: " + len);

        // String objects are immutable and they can not be modified
        String lower = str.toLowerCase();// it will not change the original string obj
                                         // but create a new string into HEAP area and make
                                         // it lower case and return it
        System.out.println("Lower: " + lower);
        str = str.toLowerCase(); // now str is pointing to the newly created string
                                 // present in HEAP area.

        // proof that now str is not present in pool but in heap                         
        if(str == s){
            System.out.println(true);

        }else{
            System.out.println(false);
        }

        String s1 = "   welcome   ";
        System.out.println("Before Trim():"+s1);
        System.out.println("After Trim():"+s1.trim());// here also new String obj is
                                                     // created into the heap same as above
        String s2 ="welcome";
        System.out.println("s2.substring(3): "+s2.substring(3));// "come" : here also new String obj is created into heap
                                            // and substring from given index till end will be returned 
    
        System.out.println("s2.substring(3,6): "+s2.substring(3,6));// "com" : here also new String obj is created
                                              // created into the heap same as above and substring 
                                              //from given starting index till ending index will be
                                              // returned , Here ending index is exclusive
        
        System.out.println("s2.replace('e','k): "+s2.replace('e','k'));
        // again replace method will create a new object in heap and 
        // Replace method will  replace all 'e' char to char 'k' 
        //OUTPUT: wklcomk
    
        String s3 = "www.example.com";
        System.out.println("s3.startsWith("+"www"+"): "+s3.startsWith("www"));
       // if particular string is starts With some prefix which is given to the method
       // then it will return true otherwise false

       System.out.println("s3.endsWith("+"com"+"): "+s3.endsWith("com"));
        // if particular string is ends With some suffix which is given to the method
       // then it will return true otherwise false

       System.out.println("s3.charAt(3): "+s3.charAt(3));
        // it will return a char present at given index
       
        System.out.println("s3.indexOf("+"."+"): "+s3.indexOf("."));
       // it will return a starting index of the given string
       System.out.println("s3.indexOf("+" . , 4 "+"): "+s3.indexOf(".",4));
       // so we have two " . " char into our string and we want to get index of the
       // second one then we will pass another argument which tells java to starts
       // its searching from given index
       System.out.println("s3.indexOf("+" . "+" , s3.indexOf("+"."+")+1): "+s3.indexOf(".",s3.indexOf(".")+1));
        // nested indexOf()+1 will skip the character once

        //NOTE: if given charater is not found then it will return -1

        System.out.println("s3.lastIndexOf("+"m"+"): "+s3.lastIndexOf("m"));
        // lastIndexOf() works same as indexOf but starts scanning from last
     
        System.out.println("s3.lastIndexOf("+"m"+",13): "+s3.lastIndexOf("m",13));
        // lastIndexOf("m",13) works same as indexOf but starts scanning from last at
        // given index i.e. 13 here
           


        String s4 = "JAVA";
        String s5 = "java";
        String s6 = "python";
        String s7 = "python";

        System.out.println("s6.equals(s7): "+s6.equals(s7));// true
        System.out.println("s4.equals(s5): "+s4.equals(s5));// false
        System.out.println("s4.equalsIgnoreCase(s5): "+s4.equalsIgnoreCase(s5));// true

        
        System.out.println("s4.compareTo(s6): "+s4.compareTo(s6));
        // compareTo() can return three possible values i.e. positive, negative and zero
        // if first string i,e. s4 here , is smaller than second string i.e. s6 
        // (smaller in terms of dictionary order) than it will return negative value
        // if first string i,e. s4 here ,is greater than second string i.e. s6  
        // then it will return positive value and if both are same then it will return zero
        // Here comparision takes place character by character with ascii codes
        // so JAVA is smaller than java


        String s8 = "abc";// pool area
        String s9 = "abc";// pool area
        String s10 = new String("abc");// HEAP area

        System.out.println(s8.equals(s9));// True: equals compare only contents not 
                                          // reference , 
       
        System.out.println(s8 == s9);   // True : == compare only reference not content
                                        // here s8 and s9 both are in pool pointing to the same
                                        // String object
     
        System.out.println(s8.equals(s10));// True : == compare only content therefore
                                            // evenafter having s8 in pool and s10 in heap
                                            // they are equal 
        System.out.println(s8 == s10); // false : == compare only reference , we have s8 in pool
                                    // and s10 in heap therefore its false

        }                                                   
}
