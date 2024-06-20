public class Fubonacci{
    public static void main(string[] args){
        int n = 10;
        int a = 0 , b = 1;
        System.out.println("Fubonacci series for first"+ n +"numbers");
        for(int i = 0; i<n; i++){
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}