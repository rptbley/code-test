public class Sinagong_2025_2_4 {
    public static void change(String[] data, String s) {
        data[0] = s;
        s = "Z";
    }

    public static void main(String[] args) {
        String data[] = { "A" };
        String s = "B";
        change(data, s);
        System.out.println(data[0] + s);
    }
}
