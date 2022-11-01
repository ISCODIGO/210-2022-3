package decision;

public class IFDemo {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        // probando cortocuito
        if (y > 100 || y / x > 1) {
            System.out.println("Se cumple");
        } else {
            System.out.println("No cumple");
        }

    }
}
