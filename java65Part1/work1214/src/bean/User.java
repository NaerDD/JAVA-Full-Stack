package bean;

import java.util.Objects;

public class User {
    private String userAccount;
    private String userName;
    private String userPassword;
    private String userGender;
    private int userAge;
    private int userLevel;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userAccount, user.userAccount);
    }


    @Override
    public String toString() {
        return "User{" +
                "userAccount='" + userAccount + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userLevel=" + userLevel +
                '}';
    }

    public User(String userAccount, String userName, String userPassword, String userGender, int userAge, int userLevel) {
        this.userAccount = userAccount;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userLevel = userLevel;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
}
