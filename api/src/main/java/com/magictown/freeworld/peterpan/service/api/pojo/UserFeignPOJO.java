/**
 * @create 2019-08-05 17:23
 * @desc user info
 **/
package com.magictown.freeworld.peterpan.service.api.pojo;

public class UserFeignPOJO {

    private Long id;
    private String name;

    public UserFeignPOJO() {
        super();
    }

    public UserFeignPOJO(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

