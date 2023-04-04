package nhapsolieu;
import java.util.ArrayList;
public class DS {
    ArrayList <solieu> list = new ArrayList<solieu>();

    public void init() {
        list.add(new solieu("A01", "Diện tích bàn", 540000));
        list.add(new solieu("A02", "Diện tích sân vườn", 1800000));
        list.add(new solieu("A03", "Diện tích đất để mở cửa hàng", 4500000));
        list.add(new solieu("A04", "Diện tích cử sổ", 35000));
        list.add(new solieu("A05", "Độ dài dòng sông", 3600000));
        list.add(new solieu("A06", "Độ iq cùa 1 thằng học IT", 3500));
        list.add(new solieu("A07", "Độ cao cùa tòa landmark 81", 8000));
        list.add(new solieu("A08", "Diện tích toàn việt nam", 475000000));
        //list.add("")
    }

    public void input(solieu obj) {
        list.add(obj);
    }

    public void output() {
        for (solieu obj: list) {
            obj.output();
        }
    }
}
