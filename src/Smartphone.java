class Smartphone extends Phone {
    private String os;

    public Smartphone(String brand, String os, String phoneNumber) {
        super(brand, phoneNumber);
        this.os = os;
    }

    public void installApp(String appName) throws StorageFullException {
        useStorage(10); // each app takes up 10 storage units
        System.out.println("Installed " + appName);
    }

    public void installApp(String appName) throws BatteryDrainException, StorageFullException {
        rechargeBattery(5); // installing an app drains 5 battery units
        useStorage(10); // each app takes up 10 storage units
        System.out.println("Installed " + appName);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
