package examclouds.lesson9.part15.user;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("mylogin","mypassword");
        System.out.println("login: " + user.getLogin());
        System.out.println("password: " + user.getPassword());
    }
}
