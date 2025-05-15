import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên từ 1 đến 12 tương ứng 12 tháng trong năm: ");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        scanner.close();
        switch (n){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("Tháng %d có 31 ngày.",n);
                break;
            case 4, 6, 9, 11:
                System.out.printf("Tháng %d có 30 ngày.",n);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày.",n);
                break;
            default:
                System.out.print("Tháng không hợp lệ.");
                break;
        }

    }
}
