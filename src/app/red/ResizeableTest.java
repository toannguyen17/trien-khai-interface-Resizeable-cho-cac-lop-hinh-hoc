package app.red;

public class ResizeableTest {
	public static void main(String[] args) {
		Resizeable resizeable = new Resizeable(){
		
			@Override
			public void resize(double percent) {
				System.out.println("Test Resizeable: " + percent);
			}
		};

		resizeable.resize(17.02);
	}
}
