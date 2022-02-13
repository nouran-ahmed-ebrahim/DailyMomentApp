
package user;
import TimeLine.*;

public abstract class User {
    
    private String userName ,nickName,password;
    private static int numberOfUser ;
    private final int id;
    private TimeLine userTimeLine;
    
    
    
    public User(TimeLine userTimeLine) { 
        this.userTimeLine=userTimeLine;
        User.numberOfUser++;
        id = numberOfUser;
    }

    public TimeLine getUserTimeLine() {
        return userTimeLine;
    }
    

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public static int getNumberOfUser() {
        return numberOfUser;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
    
    
    public void setUserName(String newUserName) {
        this.userName =newUserName;
    }

    public void setNickName(String newNikename) {
        this.nickName = newNikename;
    }

    public void setpassword( String newPassword) {
        this.password = newPassword;
    }
    
    public void fillUserData(String username ,String password ,String nickname )
    {
        this.userName = username;
        this.nickName = nickname;
       this.password = password;

    }
    
}

