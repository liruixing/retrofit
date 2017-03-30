package com.wlt.retrofit.bean;


/**
 * Created by Administrator on 2016-5-12.
 */
public class BaseBean {

    /**
     * message : success
     * message_code : 10000
     */


    /*
    *
    * 10000	请求成功
    *10001	用户未登录
    *10004	用户名不存在
    *10006	缺少参数
    *error_code 20000 数据库连接失败
    *
    */

    public String message;
    public String message_code;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage_code(String message_code) {
        this.message_code = message_code;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage_code() {
        return message_code;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "message='" + message + '\'' +
                ", message_code='" + message_code + '\'' +
                '}';
    }
}
