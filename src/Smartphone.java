class Smartphone extends Phone {
    private String os;

    public Smartphone(String brand, String os) {
        super(brand);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
