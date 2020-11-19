package data;

public class account {
    private String id;
    private String email;
    private String username;
    private String password;
    private String avatar;
    private String Address;
    private String permission;

    public account() {
    }

    public account(String id, String email, String username, String password, String avatar, String address, String permission) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        Address = address;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
