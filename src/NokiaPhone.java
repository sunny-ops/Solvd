class NokiaPhone extends FeaturePhone {
    private String model;

    public NokiaPhone(String model, boolean hasCamera) {
        super("Nokia", hasCamera);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

