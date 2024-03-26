class Zebra extends Animal {
    private boolean isWild;
    Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    @Override
    boolean isMammal() {
        return true;
    }

    @Override
    void mate() {
        System.out.println("Zebralar karada çiftleşir.");
    }

    @Override
    void voice() {
        System.out.println("Zebra sesi: Iyyh ıyyh!");
    }

    void run() {
        System.out.println("Zebra koşuyor.");
    }

    public boolean isWild() {
        return isWild;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] "+"Memeli mi: " + isMammal() + " Is Wild: " + isWild;
    }
}