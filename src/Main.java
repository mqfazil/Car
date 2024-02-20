public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printMe();
        Car c2 = new Car("Honda", 2013, "Grey");
        c2.printMe();
        Car c3 = new Car("BMW", 2024, "Black");
        c3.printMe();
        Car c4 = new Car("Acura", 2012, "White");
        c4.printMe();
        Car c5 = new Car(c4);
        c5.printMe();

        Car shallowCopy = c3;
        shallowCopy.model = "BMW";
        shallowCopy.year = 2002;
        shallowCopy.color = "Red";
        shallowCopy.printMe();
    }
}