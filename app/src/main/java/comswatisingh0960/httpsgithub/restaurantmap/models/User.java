package comswatisingh0960.httpsgithub.restaurantmap.models;

import com.orm.SugarRecord;

/**
 * Created by Swati on 11/26/2016.
 */
public class User extends SugarRecord {
    private String userName;
    private String email;
    private String password;
    private String phone;


    public User(){
        super();
    }

    public User(String userName, String email, String password, String phone) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
