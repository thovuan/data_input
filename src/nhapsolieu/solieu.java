package nhapsolieu;

import java.util.Scanner;
public class solieu {
    private String id;
    private String loai_so_lieu;
    private long nhapsolieu;

    public solieu() {
        id = loai_so_lieu = null;
        nhapsolieu = 0;
    }

    public solieu(String id, String loai_so_lieu, long nhapsolieu) {
        this.id = id;
        this.loai_so_lieu = loai_so_lieu;
        this.nhapsolieu = nhapsolieu;
    }

    public solieu(solieu obj) {
        this.id = obj.id;
        this.loai_so_lieu = obj.loai_so_lieu;
        this.nhapsolieu = obj.nhapsolieu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoai_so_lieu() {
        return loai_so_lieu;
    }

    public void setLoai_so_lieu(String loai_so_lieu) {
        this.loai_so_lieu = loai_so_lieu;
    }

    public long getNhapsolieu() {
        return nhapsolieu;
    }

    public void setNhapsolieu(long nhapsolieu) {
        this.nhapsolieu = nhapsolieu;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so lieu: ");
        id = sc.nextLine();
        System.out.print("Nhap loai so lieu: ");
        loai_so_lieu = sc.nextLine();
        System.out.print("Nhap so lieu: ");
        nhapsolieu = sc.nextLong();
    }

    public void output() {
        System.out.printf("%-12s | %-50s | %-12d\n", id, loai_so_lieu,nhapsolieu);

    }
}
