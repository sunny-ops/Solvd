class SamsungPhone extends AndroidPhone {
    private boolean supportsSpen;

    public SamsungPhone(int apiLevel, boolean supportsSpen) {
        super("Samsung", apiLevel);
        this.supportsSpen = supportsSpen;
    }

    public boolean isSupportsSpen() {
        return supportsSpen;
    }

    public void setSupportsSpen(boolean supportsSpen) {
        this.supportsSpen = supportsSpen;
    }
}


