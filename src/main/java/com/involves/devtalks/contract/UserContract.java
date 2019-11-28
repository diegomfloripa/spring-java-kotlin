package com.involves.devtalks.contract;


import com.involves.devtalks.domain.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class UserContract {
    private String id;

    @NotEmpty
    private String name;

    @Min(18)
    private Integer age;

    public UserContract() {
    }

    public UserContract(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.age = user.getAge();
    }

    public User toDomain() {
        return new User(id, name, age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
