import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int student[] = new int[31];

        for(int i = 0; i<28; i++){
            int submit = sc.nextInt();
            student[submit] = 1;
        }
        for(int i = 1; i<=30; i++){
            if(student[i]!=1){
                System.out.println(i);
            }
        }
    }
}