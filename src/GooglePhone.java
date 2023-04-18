class GooglePhone extends AndroidPhone {
    private boolean isPixel;

    public GooglePhone(int apiLevel, boolean isPixel) {
        super("Google", apiLevel);
        this.isPixel = isPixel;
    }

    public boolean isPixel() {
        return isPixel;
    }

    public void setPixel(boolean isPixel) {
        this.isPixel = isPixel;
    }
}
