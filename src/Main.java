import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getCircle("black");
        flyweightFactory.getCircle("black");
        flyweightFactory.getCircle("yellow");
        flyweightFactory.getCircle("yellow");
        HashMap<String, Circle> circls = flyweightFactory.ciecles;
        Set<String> setKey = circls.keySet();
        for (String str : setKey) {
            System.out.println(circls.get(str));
        }


        System.out.println("Hello world!");
    }
}