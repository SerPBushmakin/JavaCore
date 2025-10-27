package examclouds.lesson9.part15.user;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password.charAt(0) + "******";
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
