import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        list.add("None");
        boolean isExit = false;
        while (!isExit) {
            String s = sc.nextLine();
            if (s.equals("exit")) {
                isExit = true;
            } else if (isValue(s).equals("print")) {
                int num = isIndex(s);
                System.out.println(list.get(num));

            } else {
                createArrays(list, s);
            }
        }
    }

    public static String isValue(String s){
        String[] temp = s.split("~");
        return temp[0];
    }

    public static Integer isIndex(String s){
        String[] temp = s.split("~");
        int num = Integer.parseInt(temp[1]);
        return num;
    }

    public static void createArrays (LinkedList<Object> list, String s){
        int num = isIndex(s);
        String string = isValue(s);
        for (int i = 0; i != num ; i++) {
            if (list.size() - 1 < num){
                list.add("None");
            }
        }
        list.set(num, string);
    }
}