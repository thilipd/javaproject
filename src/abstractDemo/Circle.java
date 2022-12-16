package abstractDemo;

public class Circle extends GraphicObject {

    void draw() {
        System.out.println("draw circle");
        System.out.println(GraphicObject.z);

    }

    void resize() {
        System.out.println("resize circle");
    }

}
