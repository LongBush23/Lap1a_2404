import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu lua chon cac cong viec");
            System.out.println("=================================");
            System.out.println("1. Nhap thong tin cac loai xe ");
            System.out.println("2. Xuat bang ke khai tien thue ");
            System.out.println("3. Thoat");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin xe:");
                    Vehicle vehicle = new Vehicle("", "", 0, 0, 0);
                    vehicle.nhap();
                    vehicleList.add(vehicle);
                    break;
                case 2:
            	    System.out.println("--------------------------------------------------------------------");
            	    System.out.printf("%-25s %-20s %-15s %-15s %-15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
                    for (Vehicle v : vehicleList) {
                        v.thuePhaiDong();
                        v.xuat();
                    }
                    break;
                case 3:
                    System.out.println("Cam on ban da su dung chuong trinh!!");
                    break;
                default:
                    System.out.println("Ban da chon sai chuc nang. Moi chon lai.");
            }
        } while (choice != 3);
    }
}
