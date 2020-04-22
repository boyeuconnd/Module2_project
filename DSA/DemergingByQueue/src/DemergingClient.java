import java.util.LinkedList;
import java.util.Queue;

public class DemergingClient {
    public static void main(String[] args) {
        String[][] danhSachHS= {
                {"Đặng Tuấn Anh","nam"},
                {"Lưu Trang Anh","nu"},
                {"Trần Thị Minh Châu","nu"},
                {"Phạm Tiến Dũng","nam"},
                {"Nguyễn Thị Ngân Hà","nu"},
                {"Nguyễn Lê Hiếu","nam"},
                {"Nguyễn Mạnh Hùng","nam"},
                {"Bùi Phương Thảo","nu"},
                {"Đặng Thành Trung","nam"},
                {"Lê Khánh Vy","nu"},

        };
        Queue<String> maleList = new LinkedList<>();
        Queue<String> femaleList = new LinkedList<>();
        for(int i=0;i<danhSachHS.length;i++){
            if(danhSachHS[i][1]=="nam"){
                maleList.add(danhSachHS[i][0]);
            }else {
                femaleList.add(danhSachHS[i][0]);
            }
        }
        while (!femaleList.isEmpty()){
            System.out.println(femaleList.poll()+" nữ");
        }
        while (!maleList.isEmpty()){
            System.out.println(maleList.poll()+" nam");
        }


    }
}
