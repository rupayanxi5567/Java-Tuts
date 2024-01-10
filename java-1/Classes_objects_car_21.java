/**
 * Classes_objects_car_21
 */
public class Classes_objects_car_21 {
    int wheels;
    String color;
    float max_speed;
    float current_fuel;
    int no_of_seats;

    public Classes_objects_car_21 start () {
        if (current_fuel <= 0) {
            System.out.println("Car is our of fuel, can't start!");
        } else if(current_fuel < 5) {
            System.out.println("Car started in reserve mode, please refuel");
        } else if(current_fuel > 4){
            System.out.println("Car got started....vurrrrrrrrrrrrrrrrrrrr");
        }
        return this;
    }

    public void drive_car() {
            System.out.println("Car is driving");
            current_fuel--;
            System.out.println("Fuel remaining " + current_fuel + " liters");
    }

    public void add_fuel(float current_fuel){
        this.current_fuel += current_fuel;
    }

    public float current_fuel_level() {
        return current_fuel;
    }

    public static void main(String[] args) {
        
    }

}