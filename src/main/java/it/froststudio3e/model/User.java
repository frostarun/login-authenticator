package it.froststudio3e.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class User {

    @Id
    public ObjectId _id;
    private String username;
    private String password;
    private List<Role> role = null;

    /**
     * No args constructor for use in serialization
     */
    public User() {
    }

    /**
     * @param username
     * @param role
     * @param password
     */
    public User(String username, String password, List<Role> role) {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Role> getRoles() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public User withRole(List<Role> role) {
        this.role = role;
        return this;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("username", username).append("password", password).append("role", role).toString();
    }

}