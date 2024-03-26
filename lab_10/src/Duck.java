class Duck extends Animal {
    private String beakColor;

    Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    @Override
    boolean isMammal() {
        return false;
    }

    @Override
    void mate() {
        System.out.println("Ördekler su üzerinde çiftleşir.");
    }

    @Override
    void voice() {
        System.out.println("Ördek sesi: Quack quack!");
    }

    void swim() {
        System.out.println("Ördek yüzüyor.");
    }

    void quack() {
        System.out.println("Ördek quack sesi çıkarıyor.");
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] "+"Memeli mi: " + isMammal() + " Beak Color: " + beakColor;
    }
}