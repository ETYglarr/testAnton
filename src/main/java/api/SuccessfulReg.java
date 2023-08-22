package api;

public class SuccessfulReg {
    private final String email;
    private final String password;

    public SuccessfulReg(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }
}
