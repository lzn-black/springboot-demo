package com.lzn.service;

public interface UserService {
    /**
     * 新增⼀个⽤户
     *
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 根据name删除⼀个⽤户⾼
     *
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取⽤户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有⽤户
     */
    void deleteAllUsers();
}
