public class BlackCircle implements Circle {
    private String color="black";

    public String getColor() {
        return color;
    }
    @Override
    public void drowCircle() {
        System.out.println("color is" +getColor());
    }

    @Override
    public String toString() {
        return "BlackCircle{" +
                "color='" + color + '\'' +
                '}';
    }
}
