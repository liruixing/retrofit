package com.wlt.retrofit.bean;


/**
 * 验证码model类
 * Created by Administrator on 2016-5-11.
 */
public class Verification {

    /**
     * message : success
     * user : {"id":"4028900b54a29c1d0154a29d66d90000","name":"","nickname":"","tel":"18611891941","createTime":1463017105000}
     * message_code : 10000
     */


    /**
     * id : 4028900b54a29c1d0154a29d66d90000
     * name :
     * nickname :
     * tel : 18611891941
     * createTime : 1463017105000
     */

    private UserEntity user;

    public void setUser(UserEntity user) {
        this.user = user;
    }


    public UserEntity getUser() {
        return user;
    }


    public static class UserEntity {
        private String id;
        private String name;
        private String nickname;
        private String tel;


        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }


        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getNickname() {
            return nickname;
        }

        public String getTel() {
            return tel;
        }

        @Override
        public String toString() {
            return "UserEntity{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", tel='" + tel + '\'' +
                    '}';
        }
    }
}
