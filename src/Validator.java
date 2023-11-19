public interface Validator {

    void checkLogin(String login) throws WrongLoginException;

    void checkPassword(String password) throws WrongPasswordException;

    void checkPasswordConfirm(String password, String passwordConfirm) throws WrongPasswordException;

}

