package it.froststudio3e.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Role {

    private String name;
    private String description;

    /**
     * No args constructor for use in serialization
     */
    public Role() {
    }

    /**
     * @param description
     * @param name
     */
    public Role(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role withName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Role withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("description", description).toString();
    }

}