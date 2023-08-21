public class abstmain {
    public static void main(String[] args) {
        GraphicObject_abst circle = new circleabst();
        GraphicObject_abst rectangle =  new Reactangleabst();
        circle.draw();
        circle.resize();
        rectangle.resize();
        rectangle.draw();
    }
}
