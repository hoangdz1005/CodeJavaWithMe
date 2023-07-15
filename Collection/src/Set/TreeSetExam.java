package Set;

import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        // Tạo một đối tượng TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Thêm các phần tử vào TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(1);

        // In ra các phần tử trong TreeSet
        System.out.println("Các phần tử trong TreeSet:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        // Lấy phần tử nhỏ nhất và lớn nhất trong TreeSet
        Integer smallestElement = treeSet.first();
        Integer largestElement = treeSet.last();
        System.out.println("Phần tử nhỏ nhất: " + smallestElement);
        System.out.println("Phần tử lớn nhất: " + largestElement);

        // Lấy phần tử lớn hơn hoặc nhỏ hơn một giá trị cho trước
        Integer higherElement = treeSet.higher(3);
        Integer lowerElement = treeSet.lower(5);
        System.out.println("Phần tử lớn hơn 3: " + higherElement);
        System.out.println("Phần tử nhỏ hơn 5: " + lowerElement);
    }
    }

