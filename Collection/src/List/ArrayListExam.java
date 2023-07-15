package List;

import java.util.*;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        // Thêm phần tử mới
        players.add("Messi");
        players.add("Ronaldo");
        players.add("Bruno");
        players.add("Hazard");

        // Lấy phần tử dựa trên chỉ số
        String player1 = players.get(1);
        System.out.println(player1);

        // Thay đổi phần tử
        players.set(3, "Neymar");
        System.out.println(players.get(3));

        // Trả về số lượng
        System.out.println(players.size());

        // Kiểm tra phần tử có tồn tại không
        boolean checkPlayer = players.contains("Messi");
        if (checkPlayer) {
            System.out.println("Messi in list players");
        }

        // Kiểm tra danh sách có rỗng không
        boolean checkEmpty = players.isEmpty();
        if (checkEmpty) {
            System.out.println("Players is empty! ");
        } else {
            System.out.println("Payers is not empty!");
        }

        // Thêm tất cả các phần tử từ một collection khác
        ArrayList<String> newListPlayers = new ArrayList<String>();
        newListPlayers.add("Silva");
        newListPlayers.add("Shaw");
        newListPlayers.add("Bruno");
        players.addAll(newListPlayers);
        System.out.println(players);

        // Tìm chỉ số đầu tiên của phần tử khớp
        int indexFirst = players.indexOf("Bruno");
        System.out.println("Index first of Bruno is " + indexFirst);
        int indexLast = players.lastIndexOf("Bruno");
        System.out.println("Index last of Bruno is " + indexLast);

        // Trích xuất một arraylist con
        List<String> subPlayers = players.subList(0,3);
        System.out.println(subPlayers);

        // Chuyển đổi thanh mảng
        String[] subPlayersArr = subPlayers.toArray(new String[0]);
        for(String player : subPlayers) {
            System.out.print(" " + player);
        }
        System.out.println();

        // Sắp xếp cầu thủ theo tên tăng dần (A-Z)
        Collections.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(players);

    }
}
