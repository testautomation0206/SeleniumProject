public class Car {
    public String color;     // Created an instance variable color
    Car(String c){
        color=c;
    }

    public void display() {  // Method
        System.out.println("color of the car is"+color);
    }
    public static void main(String args[]){
        Car obj=new Car("black");
        obj.display();
    }
}