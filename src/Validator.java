public interface Validator {

    void checkLogin() throws WrongLoginException;

    void checkPassword() throws WrongPasswordException;

    void checkPasswordConfirm() throws WrongPasswordException;


}

