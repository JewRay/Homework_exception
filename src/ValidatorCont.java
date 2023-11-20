public class ValidatorCont implements Validator {
    private String login;
    private String password;
    private String confirmPassword;

    public ValidatorCont(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }



    @Override
    public void checkLogin() throws WrongLoginException {
        if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Некорректный логин");
        }
    }

    @Override
    public void checkPassword() throws WrongPasswordException {
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Некорректный пароль");
        }
    }

    @Override
    public void checkPasswordConfirm() throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}