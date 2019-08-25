package com.silence.arts.leetcode;

import java.util.LinkedList;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author ziyou<br>
 * <b>Date：</b>2019-07-30 23:27<br>
 * <b>Desc：</b>无<br>
 */
public class LruCacheDemo {

    /**
     * 定义链表的大小
     */
    private int capacity;
    /**
     * 初始化链表
     */
    private LinkedList<User> cacheList = new LinkedList<>();

    public LruCacheDemo(int capacity) {
        this.capacity = capacity;
    }


    /**
     * 根据名称获取数据，如果名称相同则返回用户实体，并且将该用户移动到链表头部
     *
     * @param username 名称
     * @return 用户
     */
    public User get(String username) {
        User u = null;
        for (User user : cacheList) {
            if (user.getUsername().equals(username)) {
                cacheList.remove(user);
                cacheList.add(0, user);
                u = user;
            }
        }
        return u;
    }

    public void put(User user) {
        //判断链表长度是否达到最大
        if (cacheList.size() == capacity) {
            cacheList.remove(capacity - 1);
        }
        cacheList.add(0, user);
    }


    public static void main(String[] args) {
        LruCacheDemo cacheDemo = new LruCacheDemo(5);
        User user1 = new User("a1", 1);
        cacheDemo.put(user1);
        User user2 = new User("a2", 2);
        cacheDemo.put(user2);
        System.out.println(cacheDemo.get("a1"));
        User user3 = new User("a3", 3);
        cacheDemo.put(user3);
        User user4 = new User("a4", 4);
        cacheDemo.put(user4);
        System.out.println(cacheDemo.get("a4"));
        System.out.println(cacheDemo.get("a2"));
        User user5 = new User("a5", 5);
        cacheDemo.put(user5);
        User user6 = new User("a6", 6);
        cacheDemo.put(user6);
        System.out.println(cacheDemo.get("a1"));
    }


    static class User {
        public User(String username, int age) {
            this.username = username;
            this.age = age;
        }

        private String username;
        private int age;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
