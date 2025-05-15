import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên bất kỳ: ");
        Scanner scanner= new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = n.split("");
        int sum = 0;
        for(String num : arr){
            try{
                byte corNum = Byte.parseByte(num);
                sum += corNum;
            } catch (Exception e) {
                //bỏ dấu âm
            }

        }
        System.out.printf("Tổng các chữ số là: %d",sum);

    }
}
