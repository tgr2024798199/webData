package dto;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：Users
 * 日期：2023/6/7 20:10
 */

public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private String userRName;
    private String userGender;
    private String userTel;
    private String userDesc;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRName() {
        return userRName;
    }

    public void setUserRName(String userRName) {
        this.userRName = userRName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
