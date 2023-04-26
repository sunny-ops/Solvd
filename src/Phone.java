public abstract class Phone {
    private String brand;
    protected int batteryLevel;
    protected int storageLevel;
    protected boolean isSignalAvailable;
    protected boolean isCallAnswered;

    public Phone(String brand, String phoneNumber) {
        this.brand = brand;
        this.phoneNumber = phoneNumber;
        this.batteryLevel = 100;
        this.storageLevel = 100;
        this.isSignalAvailable = true;
        this.isCallAnswered = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(String phoneNumber) throws InvalidPhoneNumberException, NoSignalException, CallNotAnsweredException {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new InvalidPhoneNumberException("Invalid phone number: " + phoneNumber);
        }
        if (!isSignalAvailable) {
            throw new NoSignalException("No signal available");
        }
        System.out.println("Calling " + phoneNumber + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Call interrupted: " + e.getMessage());
        }
        if (!isCallAnswered) {
            throw new CallNotAnsweredException("Call not answered");
        }
        System.out.println("Call ended");
    }

    public void answerCall() {
        isCallAnswered = true;
        System.out.println("Call answered");
    }

    public void rechargeBattery(int amount) throws BatteryDrainException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (batteryLevel + amount > 100) {
            throw new BatteryDrainException("Battery level cannot exceed 100");
        }
        batteryLevel += amount;
        System.out.println("Battery level: " + batteryLevel);
    }

    public void useStorage(int amount) throws StorageFullException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (storageLevel - amount < 0) {
            throw new StorageFullException("Storage full: cannot store more data");
        }
        storageLevel -= amount;
        System.out.println("Storage level: " + storageLevel);
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
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

