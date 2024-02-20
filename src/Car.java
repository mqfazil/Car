public class Car {
    protected String model;
    protected int year;
    protected String color;
    Car() {
        this.model = "";
        this.year = 0;
        this.color = "";
    }
    Car(String _model, int _year, String _color) {
        this.model = _model;
        this.year = _year;
        this.color = _color;
    }
    Car(Car c){
        this.model = c.model;
        this.year = c.year;
        this.color = c.color;
    }
    public void printMe() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}