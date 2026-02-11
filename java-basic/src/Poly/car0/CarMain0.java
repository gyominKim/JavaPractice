package Poly.car0;

public class CarMain0 {

    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.driver();


        //추가
        Models3Car models3Car = new Models3Car();
        driver.setK3Car(null);
        driver.setModels3Car(models3Car);
        driver.driver();
    }
}
