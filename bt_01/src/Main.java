import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a % 2 == 0 && a != 0){
            System.out.printf("Số %d là số chẵn",a);
        }
        else if(a % 2 != 0 ){
            System.out.printf("Số %d là số lẻ",a);
        }
        else{
            System.out.print("Số không phải chẵn cũng không phải lẻ");
        }

    }
}