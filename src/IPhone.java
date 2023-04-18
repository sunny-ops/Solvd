class IPhone extends IOSPhone {
    private boolean hasFaceID;

    public IPhone(String model, boolean hasFaceID) {
        super("Apple", model);
        this.hasFaceID = hasFaceID;
    }

    public boolean hasFaceID() {
        return hasFaceID;
    }

    public void setHasFaceID(boolean hasFaceID) {
        this.hasFaceID = hasFaceID;
    }
}

