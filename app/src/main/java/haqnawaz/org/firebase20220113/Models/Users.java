package haqnawaz.org.firebase20220113.Models;

public class Users {

    String profilePicture, userName, email, passWord, lastMessage;

    public Users(){}

    public Users(String profilePicture, String userName, String email, String passWord, String lastMessage) {
        this.profilePicture = profilePicture;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.lastMessage = lastMessage;
    }

    public Users(String userName, String email, String passWord) {
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
