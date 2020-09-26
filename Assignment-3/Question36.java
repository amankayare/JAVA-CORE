/**
 * 36. Create a class MathOperation containing overloaded methods ‘multiply’ to
 * calculate multiplication of following arguments. a. two integers b. three
 * floats c. all elements of array d. one double and one integer
 * 
 */
class MathOperation {

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int arr[]) {
        int result = 1;
        for (int i : arr) {
            result *= i;
        }
        return result;
    }

    public int multiply(int a, double b) {

        return  (int)(a * b);
    }
}

public class Question36 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.multiply(2.0f, 2.0f, 2.0f));
        System.out.println(m.multiply(2, 2));
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(m.multiply(arr));
        System.out.println(m.multiply(2,4d));


    }
}
