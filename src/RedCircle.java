public class RedCircle implements Circle {
   private String color="red";

    public String getColor() {
        return color;
    }

    @Override
    public void drowCircle() {
        System.out.println("color is" +getColor());
    }

    @Override
    public String toString() {
        return "RedCircle{" +
                "color='" + color + '\'' +
                '}';
    }
}
