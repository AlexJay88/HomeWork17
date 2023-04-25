import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "login123";
        String password = "password_0";
        String confirmPassword = "password_0";

        try {
            Validator.validate(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        }finally {
            System.out.println("finally блок");
        }

    }}


