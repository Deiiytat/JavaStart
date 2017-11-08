public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 987654321;  // Input: any positive number
        int A = (n/10000)%10;
        int B = (n/1000)%10;
        int C = (n/100)%10;
        int D = (n/10)%10;
        int E = n%10;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);

    }
}
