package abstractDemo;

public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {

        System.out.println("move x to: " + x + " move y to: " + y);

    }

    abstract void draw();

    abstract void resize();
}
