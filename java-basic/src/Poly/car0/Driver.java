package Poly.car0;

public class Driver {

    private K3Car k3Car;
    private Models3Car models3Car; //추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    //추가 set 하면 추가 된다
    public void setModels3Car(Models3Car models3Car) {
        this.models3Car = models3Car;
    }

    public void driver() {
        System.out.println("자동차를 운전합니다");
        if( k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (models3Car != null) {
            models3Car.startEngine();
            models3Car.pressAccelerator();
            models3Car.offEngine();
        }
    }
}
