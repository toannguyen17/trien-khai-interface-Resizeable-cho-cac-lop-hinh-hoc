package app.gym;
public class RectangleTest {
    public static void main(String[] args) {
        int size = 100;
        Rectangle[] arrRectangle = new Rectangle[size];

        for (int i = 0; i < size; i++) {
            double width   = (Math.random() * 40) + 10;
            double length  = (Math.random() * 40) + 10;
            double percent = Math.random() * 100;
            Rectangle rectangle = new Rectangle(width, length);
            rectangle.resize(percent);
            arrRectangle[i] = rectangle;
            System.out.println(rectangle);
        }
    }
}
