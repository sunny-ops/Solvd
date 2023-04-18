class AndroidPhone extends Smartphone {
    private int apiLevel;

    public AndroidPhone(String brand, int apiLevel) {
        super(brand, "Android");
        this.apiLevel = apiLevel;
    }

    public int getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(int apiLevel) {
        this.apiLevel = apiLevel;
    }
}


