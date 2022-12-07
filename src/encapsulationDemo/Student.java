package encapsulationDemo;

public class Student {

    private String name;
    private int rollId;
    private int age;

    public Student(String name, int rollId, int age) {
        this.name = name;
        this.rollId = rollId;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.rollId = roll;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.rollId;
    }

    public int getAge() {
        return this.age;
    }

}
