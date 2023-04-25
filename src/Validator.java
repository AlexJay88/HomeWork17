import java.util.regex.Pattern;

public class Validator {
    public static void validate(
            String login,
            String password,
            String confirmPassword
    ){

        if(!Pattern.matches("^[A-Za-z0-9_]{1,20}$",login)){
            throw new WrongLoginException("Неправильный логин");
        }
        if(!Pattern.matches("^[A-Za-z0-9_]{1,19}$",password)){
            throw new WrongPasswordException("Неправильный пароль");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("ошибка-неверный пароль");
        }
    }}





