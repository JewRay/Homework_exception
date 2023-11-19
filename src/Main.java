import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите логин (логин должен быть не длиннее 20 символов, может содержать: латинские буквы, цифры, знак подчёркивания): ");
        String login = in.nextLine();
        System.out.print("Введите пароль (пароль должен быть не длиннее 20 символов, может содержать: латинские буквы, цифры, знак подчёркивания): ");
        String password = in.nextLine();
        System.out.print("Введите подтверждение пароля: ");
        String confirmPassword = in.nextLine();

        ValidatorCont validator = new ValidatorCont(login, password, confirmPassword);
        try {
            validator.checkLogin(login);
            validator.checkPassword(password);
            validator.checkPasswordConfirm(password, confirmPassword);
            System.out.println("Пользователь прошел валидацию");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
