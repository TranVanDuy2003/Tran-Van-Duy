import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen tu 1 den 7: ");
        int day;
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Chu nhat");
                break;
            case 2:
                System.out.println("Thu hai");
                break;
            case 3:
                System.out.println("Thu ba");
                break;
            case 4:
                System.out.println("Thu tu");
                break;
            case 5:
                System.out.println("Thu nam");
                break;
            case 6:
                System.out.println("Thu sau");
                break;
            case 7:
                System.out.println("Thu bay");
                break;
            default:
                System.out.println("So nhap vao khong hop le");
                break;
        }

    }
}