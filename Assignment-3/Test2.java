
public class Test2 {
   
    void oneToHundred(){

        int min = 1;
        int max = 100;
      
          
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);

    }
    void hundredToOneForty(){

        int min = 100;
        int max = 140;
      
          
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);

    }
    

    public static void main( String args[] ) {
        
        Test2 t = new Test2();
        t.oneToHundred();
        t.hundredToOneForty();
      }

}
