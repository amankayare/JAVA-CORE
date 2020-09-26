import java.util.Scanner;
public class Test {
    public static int isPrime(int num){


        int temp = num;
        int flag = 0;
        while (num != 0) {
            if (temp % num == 0) {
                flag++;
            }
            num--;
        }

        if (flag == 2){
            return 1;

        }
        else{
            return 0;
        }

    
        
    }
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("a+b="+a+b);
        
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(Test.isPrime(num) == 1 ){
            System.out.println("PRIME NO");

            for(int i = num-1; i > 0; i--){
                if(isPrime(i) == 1){
                    System.out.println(i);
                    break;
                }
            }
            for(int i = num+1; ; i++){
                if(isPrime(i) == 1){
                    System.out.println(i);
                    break;
                }
            }
        }
        if(isPrime(num) == 0){
            System.out.println("NOT PRIME");
            for(int i = num-1; i > 0; i--){
                if(isPrime(i) == 1){
                    System.out.println(i);
                    break;
                }
            }
            for(int i = num+1; ; i++){
                if(isPrime(i) == 1){
                    System.out.println(i);
                    break;
                }
            }
        }


        sc.close();
        

    }
}
