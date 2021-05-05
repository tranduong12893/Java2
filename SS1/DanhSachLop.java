package Java2.SS1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachLop {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tuan");
        names.add("Thanh");
        names.add("Quang");
        names.add("Tien");
        names.add("Loc");
        names.add("Ha");
        names.add("Mao");
        names.add("Hoi");
        names.add("Trinh");
        names.add("Dat");
        System.out.println("Danh sach lop: " + names);

        names.remove(3);
        System.out.println("sau khi xoa name(3): "+ names);

        names.set(0,"Duong");
        System.out.println("Danh sach lop sau khi sua: "+ names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        names.sort((name1,name2) -> name1.compareTo(name2));
        names.sort(Comparator.naturalOrder());
        System.out.println("Danh sach lop theo Ab: "+ names);
    }

}
