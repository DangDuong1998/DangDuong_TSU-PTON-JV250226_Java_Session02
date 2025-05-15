import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên dương: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        if (n>0){
            for (int i=1; i <= n; i++){
                sum = sum +i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là: %d",n,sum);
        }
        else{
            System.out.print("Số nhập vào không hợp lệ");
        }

    }
}
