class FirstArea {
    int x, y;

    public FirstArea(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + y);
    }
}

class SecondArea extends FirstArea {
    int bb = 3;

    public SecondArea(int i) {
        super(i, i + 1);
    }
    public void print() {
        System.out.println(bb * bb);
    }
}

class Main {
    public static void main(String[] args) {
        FirstArea st = new SecondArea(10);
        st.print();
    }
}