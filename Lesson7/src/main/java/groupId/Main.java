package groupId;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getFullName());
        System.out.println(user.getAge());
        System.out.println(user.user());
        User user1 = new User("Nikolai", 23, "Male");
        System.out.println(user1.fullName + " " + user1.age + " " + user1.gender);
    }
}