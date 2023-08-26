public class Car1 {
    String color;
    float weight;


    void ptintColorAndWeight() {
        System.out.println(color + " " + weight);
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.color = "black";
        car1.weight = 1200.5f;

        car1.ptintColorAndWeight();

    }
}

