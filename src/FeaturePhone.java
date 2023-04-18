class FeaturePhone extends Phone {
    private boolean hasCamera;

    public FeaturePhone(String brand, boolean hasCamera) {
        super(brand);
        this.hasCamera = hasCamera;
    }

    public boolean hasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }
}


