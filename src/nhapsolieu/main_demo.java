package nhapsolieu;
import java.util.Scanner;
public class main_demo {
    static void menu() {
        System.out.println("1. Input so lieu information");
        System.out.println("2. Output list of so lieu");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        DS ds = new DS();
        Scanner sc = new Scanner (System.in);
        byte choose;
        ds.init();
        do {
            menu();
            System.out.print("You choose: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1: {
                    solieu sl = new solieu();
                    sl.input();
                    ds.input(sl);
                    break;
                }
                case 2: {
                    System.out.printf("%-12s | %-50s | %-12s\n", "Mã số liệu", "Loại/ Tên số liệu", "Số liệu");
                    ds.output();
                    break;
                }
                default: break;
            }
        } while(choose!=0);

    }
}
