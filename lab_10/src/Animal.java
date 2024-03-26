abstract class Animal {
    int age;
    String gender;

    Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    abstract boolean isMammal();

    abstract void mate();

    abstract void voice();

    final void sleep() {
        System.out.println("Hayvan uyuyor.");
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] " + isMammal();
    }
}