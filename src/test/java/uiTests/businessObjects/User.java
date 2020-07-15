package uiTests.businessObjects;

public class User {
    private String userName;
    private String login;
    private String passaword;
    private String confirmationCode;

    public User(String userName, String login, String passaword, String confirmationCode) {
        this.userName = userName;
        this.login = login;
        this.passaword = passaword;
        this.confirmationCode = confirmationCode;
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }
}
