import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> data = new LinkedHashSet<>();

        while (true) {
            System.out.print("Nhap du lieu: ");
            String input = scanner.nextLine();

            // Kiểm tra điều kiện để kết thúc vòng lặp
            if (input.equals("done")) {
                break;
            }

            // Thêm dữ liệu vào LinkedHashSet
            data.add(input);
        }

        // In ra dữ liệu đã nhập vào
        System.out.println("Dữ liệu đã nhập vào:");
        for (String item : data) {
            System.out.println(item);
        }
    }
}
