
public class CarParts {
    
    public static class Wheel {
        public Wheel() {
            System.out.println("Wheel created!");
        }
    }

    public CarParts() {
        System.out.println("Car Parts object created!");
    }
    
    public static void main(String[] args) {
        CarParts carParts = new CarParts();
    }

}