package groupId;

import java.util.Random;

public class User {
    String fullName = "Nikita Kruk";
    int age = 18;
    String gender = "Male";

    public User() {
    }

    public User(String fullName) {
        this.fullName = fullName;
    }

    public User(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public User(String fullName, int age, String gender) {
        this(fullName, age);
        this.gender = gender;
    }

    @Deprecated
    public String getFullName() {
        this.fullName = fullName;
        return fullName;
    }

    public int increasingAge() {
        Random random = new Random();
        this.age = age;
        int randomAge = age + random.nextInt(50);
        return randomAge;
    }

    public String user() {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        return fullName + " " + age + " " + gender;
    }


    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}


