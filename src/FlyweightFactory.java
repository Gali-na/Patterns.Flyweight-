import java.awt.*;
import java.util.HashMap;

public class FlyweightFactory {
    HashMap<String, Circle> ciecles = new HashMap<>();

    public HashMap<String, Circle> getCiecles() {
        return ciecles;
    }

    Circle getCircle(String color) {
        Circle circle = ciecles.get(color);
        Circle circle1= null;
        if (circle == null) {
            switch (color) {
                case "black":
                    circle = new BlackCircle();
                    break;
                case "yellow":
                    circle = new YellowCircle();
                    break;
                case "red":
                    circle = new RedCircle();
                    break;
            }
            ciecles.put(color,circle);
        }
        return circle;
    }
}