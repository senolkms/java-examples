class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    @Override
    boolean isMammal() {
        return false;
    }

    @Override
    void mate() {
        System.out.println("Balıklar yumurta bırakarak çiftleşir.");
    }

    @Override
    void voice() {
        System.out.println("Balık sesi: Blub blub!");
    }

    void swim() {
        System.out.println("Balık yüzüyor.");
    }

    public int getSizeInFt() {
        return sizeInFt;
    }

    public boolean canEat() {
        return canEat;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] "+"Memeli mi: " + isMammal() + " Size: " + sizeInFt + " feet Can Eat: " + canEat;
    }
}