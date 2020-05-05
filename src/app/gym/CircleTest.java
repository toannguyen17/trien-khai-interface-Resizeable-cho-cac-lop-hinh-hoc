package app.gym;
public class CircleTest {
    public static void main(String[] args) {
        int size = 100;
        Circle[] arrCircle = new Circle[size];

        for(int i = 0; i < size; i++){
            double percent = Math.random()*100;
            Circle circle  = new Circle();
            circle.resize(percent);
            arrCircle[i] = circle;
            System.out.println(circle);
        }
    }
}
