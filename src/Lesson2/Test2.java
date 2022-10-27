package Lesson2;

public class Test2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] strings = new String[3];
        strings[0] = "privet";
        strings[1] = "poka";
        strings[2] = "java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for(int i = 0; i<strings.length; i++) {
            System.out.println(strings[i]);
        }

        for(String s : strings) {
            System.out.println(s);
        }

        String[] strings1 = {"hello", "poka", "java"};
    }
}
