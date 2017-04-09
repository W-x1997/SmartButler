package com.wx.smartbutler.entity;

/**
 *  项目名：  SmartButler
 *  创建者:   wx
 *  创建时间:  3/19
 *  描述：    用户属性
 *        继承Bmob提供的BmobUser
 */

import cn.bmob.v3.BmobUser;

public class MyUser extends BmobUser{

    private int age;
    private boolean sex;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
