import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int answer = 0;

        for(int i = 0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            answer += a*b;
        }
        if(answer == X){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}