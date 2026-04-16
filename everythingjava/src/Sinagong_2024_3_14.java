public class Sinagong_2024_3_14 {
    public static void main(String[] args) {
        B a = new D();
        D b = new D();

        System.out.println(a.getX() + a.x + b.getX() + b.x);
    }

}

class B {
    int x = 3;
    int getX() {
        return x * 2;
    }
}

class D extends B {
    int x = 7;
    int getX() {
        return x * 3;
    }
}
