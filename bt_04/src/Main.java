import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        byte age = 0;
        do {
            System.out.print("Nhập tuổi của bạn: ");
            String input = scanner.nextLine();
            if(input.trim().isEmpty()){
                System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
                continue;
            }
            try{
                age = Byte.parseByte(input);
                if(age < 0){
                    System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
                }
                else{
                    isValid = true;

                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
            }

        }while (!isValid);
        System.out.printf("Tuổi của bạn là %d",age);
        scanner.close();
    }
}
