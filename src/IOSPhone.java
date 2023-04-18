class IOSPhone extends Smartphone {
    private String model;

    public IOSPhone(String brand, String model) {
        super(brand, "iOS");
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

