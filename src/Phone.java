public abstract class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

class Main {
    public static void main(String[] args) {
        IPhone iPhone12 = new IPhone("iPhone 12", true);
        System.out.println("Brand: " + iPhone12.getBrand());
        System.out.println("Model: " + iPhone12.getModel());
        System.out.println("OS: " + iPhone12.getOs());
        System.out.println("Has Face ID: " + iPhone12.hasFaceID());

        OnePlusPhone onePlus9 = new OnePlusPhone(30, 65);
        System.out.println("Brand: " + onePlus9.getBrand());
        System.out.println("OS: " + onePlus9.getOs());
        System.out.println("API Level: " + onePlus9.getApiLevel());
        System.out.println("Dash Charging Speed: " + onePlus9.getDashChargingSpeed() + "W");
    }
}

