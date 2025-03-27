package web.model;


public class Car {

    private String model;
    private String mileage;
    private int price;

    public Car() {
    }

    public Car(String model, String mileage, int price) {
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", color='" + mileage + '\'' +
               ", engine='" + price + '\'' +
               '}';
    }
}
