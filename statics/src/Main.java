class statics {

    private int y;
    private static int x = 5;

    statics(int y) {
        this.y = y;
    }

    public void calcular() {
        int x = 1;
        for (int i = y; i > 0; i--) {
            x = x * i;
        }
        x--;
        System.out.println("y= " + y-- + " x= " + x);
    }

    public void mostra() {
        System.out.println("y= " + y-- + " x= " + x--);
    }
}

public class Main {

    public static void main(String[] args) {
        statics s = new statics(4);
        s.calcular();
        s.mostra();
        statics ss = new statics(2);
        ss.mostra();
    }
}