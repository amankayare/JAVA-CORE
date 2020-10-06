public class StringObject {

    public static void main(String[] args) {

        String str = "Java Program";
        System.out.println(str);
        /*
          -  Here str is a reference to a String
          -  "Java Program" is a String object and also a Literal
          - when we create a String using above method then 
            String literal get the memory in pool area and memory map will be 

                     __________________POOL AREA____________________________
            ____    |  _______________________________________________     |
          |____|  =>| |_J_|_a_|_v_|_a_|___|_P_|_r_|_o_|_g_|_r_|_a_|_m_|    |
           str      |   0   1   2   3   4   5   6   7   8   9  10  11      |
                    |______________________________________________________|          
           - str is referencing to this memory or object.
           -str is holding the literal object so it is string literal

           String class have following constructors
           1. String(char [])
           2. String(byte [])
           3. String(String)
           4. String(byte[] , starting index , count)
           5. String(char[] , starting index , count)

           NOTE: Whenever we create an string using new keyword then string will
           stored in HEAP area
         */
        char c[] = {'A', 'B', 'C' , 'D'};
        String string = new String(c);
        System.out.println("string: "+string);
        /**
         * Above code memory map
         *  ____      ________________
          |____|  => |_A_|_B_|_C_|_D_|
          string     0   1   2   3   
         * 
         */

         byte b[] = { 65 , 66 ,  67 , 68 }; // ascii values  in byte arrays
         String string2 = new String(b);
         System.out.println("string2: "+string2);
           /**
         * Above code memory map
         *  ____      ________________
          |____|  => |_A_|_B_|_C_|_D_|
          string2     0   1   2   3   
         * 
         */
        String  string3 = new String("JAVA");
        System.out.println("string3: "+string3);
        /**
         *  In above case we are using new keyword and "JAVA" string literal both
         *  so this is a special case therefore two objects will be created one in 
         * heap and one in pool. we will get a different memory map
         *  
                         _______________________  
           _____        |    ________________  |
          |____|  =>    |  |_J_|_A_|_V_|_A_|   |
          string3       |    0   1   2   3     |
         *              |______________________|
         *                       HEAP AREA
         * So along with reference variable string 3 we also 
         * have string literal which will also occupy some space 
         * so literal will occupy space in pool
         * 
         *                      LITERAL 
         *              _______________________  
                        |    ________________  |
                        |  |_J_|_A_|_V_|_A_|   |
                        |    0   1   2   3     |
         *              |______________________|
         *                       POOL

         * so for string literal in pool there is no reference
         * 
         * 
         */

         String s1 = "java";
         String s2 = "java";
         String s3 = "program";
         String s4 = new String("java");
         String s5 = "Java"; // not shown in memory map dont worry it will be there in pool

         System.out.println("s1==s2: "+ (s1==s2));// true : s1 and s2 point to the same literal
                                                  // thats why both have same reference
         System.out.println("s1==s4: "+ (s1==s4));// false : s1 present in pool and s4 present
                                                  // in heap therefore both are holding
                                                  // different references
         System.out.println("s1==s5: "+ (s1==s5)); // Case sensitive therefore false 
         
         
                                                  /**
       _____               ___________POOL AREA_____________
      |____|-----*        |  ________________              |
       s1        *=======>| |_j_|_a_|_v_|_a_|              |
      _____      *        |   0   1   2   3                |
     |____|----- *        |  ____________________________  |
       s2            *===>| |_P_|_r_|_o_|_g_|_r_|_a_|_m_|  | 
                     *    |   0   1   2   3   4   5   6    |  
     _____           *    |________________________________|_   
    |____|------------
      s3    
    
                 
            

       - so when we create string using string literal it gets memory into pool area
       
       - so when we create another string  literal so jvm first check if same literal
         is present in pool area or not if same literal is present in pool then it will
         point the reference variable to the same literal otherwise create a new literal
         into the pool area.

       - like here "java" literal is already present in pool area due to s1
        and when we create s2 with same "java" literal then no new literal 
        will be created but s2 will also pointing to same "java" literal.

       - now when we try to create s3 literal then no more "program" literal is 
         present in the pool therefore jvm will create new "program" literal in pool

          */
          byte bArry[] = {65,66,67, 68};
          String amn = new String(bArry,2,2);
          System.out.println("amn: "+amn);//CD

          byte cArry[] = {'h','e','l','l','o'};
          String hello = new String(cArry,1,2);
          System.out.println("hello: "+hello);//el



    }
}
