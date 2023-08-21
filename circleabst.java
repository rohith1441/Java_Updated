public class circleabst extends GraphicObject_abst{
    @Override
    void draw() {
        System.out.println("drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the circle");
    }
}
