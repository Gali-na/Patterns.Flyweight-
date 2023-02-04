public class YellowCircle implements Circle{

    private String color="yellow";

    public String getColor() {
        return color;
    }
    @Override
    public void drowCircle() {
        System.out.println("color is" +getColor());
    }

    @Override
    public String toString() {
        return "YellowCircle{" +
                "color='" + color + '\'' +
                '}';
    }
}
