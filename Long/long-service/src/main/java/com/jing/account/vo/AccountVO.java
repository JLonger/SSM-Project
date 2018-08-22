package com.jing.account.vo;

/**
 * @author codegen 2018-08-21 15:46:26
 */
public class AccountVO {

    /**  **/
    private String id;

    /**
     * 性别
     **/
    private String sex;

    /**
     * 昵称
     **/
    private String nickName;

    /**
     * 密码
     **/
    private String password;

    /**
     * 头像url
     **/
    private String headImg;

    /**
     * 经验值，默认为0
     **/
    private long experienceValue;


    /**
     * 构造
     */
    public AccountVO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public long getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(long experienceValue) {
        this.experienceValue = experienceValue;
    }

}