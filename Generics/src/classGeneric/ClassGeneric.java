package classGeneric;

public class ClassGeneric {
    public static void main(String[] args) {
        Person<String, String> person1 = new Person<>("P01", "Nguyễn Ngọc Hoàng");
        String identifier = person1.getIdentifier();
        String name = person1.getInformation();
        System.out.println(identifier + " :" + name );
        Person<Integer, Integer> person2 = new Person<>(1, 20 );
        int identifier2 = person2.getIdentifier();
        int age = person2.getInformation();
        System.out.println(identifier2 + " :" + age);


    }
}
