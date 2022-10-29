public class Samosval extends Car {

    protected double capacity;

    public Samosval(String color, double maxVelocity, boolean gear, double nowVelocity, double price, double capacity) {
        this.color= color;
        this.maxVelocity = maxVelocity;
        this.gear = gear;
        this.nowVelocity = nowVelocity;
        this.price = price;
        this.capacity = capacity;
    }
}

