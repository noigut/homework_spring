package peaksoft;

public class Horse implements Animal {
    private String breed;
    private String color;
    private int age;

    @Override
    public void animalPlus() {
        System.out.println("Чуркайт");
    }

    @Override
    public void animalMinus() {
        System.out.println("Тебет");
    }

    public Horse() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
