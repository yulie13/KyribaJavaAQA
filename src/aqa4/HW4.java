package aqa4;

public class HW4 {
    public static void main(String[] args) {

        PC pc = new PC("Intel", "2046", "Pentium", 5);

        pc.displayInfo();

        for (int i = 0; i < pc.limit; i++) {
            pc.On(0);
            pc.Off(0);
        }
    }
}
