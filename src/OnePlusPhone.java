class OnePlusPhone extends AndroidPhone {
    private int dashChargingSpeed;

    public OnePlusPhone(int apiLevel, int dashChargingSpeed) {
        super("OnePlus", apiLevel);
        this.dashChargingSpeed = dashChargingSpeed;
    }

    public int getDashChargingSpeed() {
        return dashChargingSpeed;
    }

    public void setDashChargingSpeed(int dashChargingSpeed) {
        this.dashChargingSpeed = dashChargingSpeed;
    }
}

