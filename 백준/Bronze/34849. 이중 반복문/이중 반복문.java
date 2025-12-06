import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>10000){
            System.out.print("Time limit exceeded");
        } else{
            System.out.print("Accepted");
        }
    }
}