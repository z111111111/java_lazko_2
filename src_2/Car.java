public class Car {
    protected String color;
    protected double maxVelocity;
    protected boolean gear;
    protected double nowVelocity;
    protected double price;

    public void start(int velo) {
        if(velo>maxVelocity || velo<0 || nowVelocity > 0){
            System.out.println("Невозможно");
        }
        else{
            nowVelocity = velo;
            System.out.println("Скорость равна " + nowVelocity);
        }

    }

    public void stop() {
        nowVelocity = 0;
    }

    public void accelerate(int diff) {
        if(diff+nowVelocity>maxVelocity || nowVelocity<=0 || diff+nowVelocity < 0){
            System.out.println("Невозможно");
        }
        else{
            nowVelocity += diff;
            System.out.println("Скорость равна " + nowVelocity);
        }
    }
}

