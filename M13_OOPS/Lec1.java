package M13_OOPS;

public class Lec1 {
    public static void main(String[] args) {
        Pen pen = new Pen("Blue", 5);

        System.out.println(pen.getColor());
        pen.setColor("Red");
        System.out.println(pen.getColor());
    }
}

class Pen {
    private String color;
    int tip;

    public Pen(String color, int tip) {
        this.color = color;
        this.tip = tip;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
