package it.froststudio3e.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserDto {

    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Role> role = null;

    /**
     * No args constructor for use in serialization
     */
    public UserDto() {
    }

    /**
     * @param username
     * @param role
     * @param password
     */
    public UserDto(String username, String password, List<Role> role) {
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

    public UserDto withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto withPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public UserDto withRole(List<Role> role) {
        this.role = role;
        return this;
    }
}
