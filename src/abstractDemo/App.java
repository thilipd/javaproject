package abstractDemo;

public class App {

    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        GraphicObject rectangle = new Rectangle();

        circle.draw();
        rectangle.resize();

        // GraphicObject x = new GraphicObject();

    }
}
