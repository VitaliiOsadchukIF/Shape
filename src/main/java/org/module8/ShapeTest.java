package org.module8;

import static org.module8.ShapeName.shapeName;

public class ShapeTest {
    public static void main(String[] args) {

        shapeName(new Circle());
        shapeName(new Square());
        shapeName(new Rectangle());
        shapeName(new Oval());
        shapeName(new Triangle());

    }
}
