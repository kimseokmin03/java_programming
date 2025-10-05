import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int input  = sc.nextInt();

        int num_array[] = new int[input];
        System.out.print("수를 입력하세요: ");
        for(int i =0;i<input;i++){
            int number = sc.nextInt();
            num_array[i]=number;
        }
        sc.close();
        int max=num_array[0],min=num_array[0];
        for(int i = 1;i<input;i++){
            if(max < num_array[i]){
                max=num_array[i];
            }
            if(min > num_array[i]){
                min=num_array[i];
            }
        }
        System.out.print("최대값: "+max+"\n최소값: "+min);
    }
}
