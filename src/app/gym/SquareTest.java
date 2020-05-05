package app.gym;
public class SquareTest {
    public static void main(String[] args) {
        int size = 100;
        Square[] arrSquare = new Square[size];

        for (int i = 0; i < size; i++) {
            double side    = (Math.random() * 40) + 10;
            double percent = Math.random() * 100;
            Square square  = new Square(side);
            square.resize(percent);
            arrSquare[i] = square;
            System.out.println(square);
        }
    }
}
