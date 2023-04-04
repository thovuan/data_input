package nhapsolieu;

public class demo {
    public static void main(String[] args) {
        solieu sl = new solieu();
        System.out.println("Contructor chuẩn: ");
        sl.output();
        System.out.println("Contructor có tham số: ");
        solieu sl1 = new solieu("A01", "Tham chiếu diện tích đất", 11500000);
        sl1.output();
        System.out.println("Contructor copy: ");
        solieu sl2 = new solieu(sl1);
        sl2.output();
        System.out.println("tự nhập: ");
        solieu sl3 = new solieu();

        sl3.input();
        sl3.output();

    }
}
