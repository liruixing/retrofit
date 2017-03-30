package com.wlt.retrofit.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/5/13.
 */
public class MenuBean extends BaseBean {

    /**
     * id : 4028900b54a7a7de0154a7a7e0270000
     * msgTitle :
     * msgContent :
     * msgDate : 1463101677606
     * msgType : 志愿者服务
     * parent : null
     */

    private List<MenuXBean> list;

    public List<MenuXBean> getList() {
        return list;
    }

    public void setList(List<MenuXBean> list) {
        this.list = list;
    }

    public static class MenuXBean {
        private String id;
        private String msgTitle;
        private String msgContent;
        private long msgDate;
        private String msgType;
        private Object parent;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMsgTitle() {
            return msgTitle;
        }

        public void setMsgTitle(String msgTitle) {
            this.msgTitle = msgTitle;
        }

        public String getMsgContent() {
            return msgContent;
        }

        public void setMsgContent(String msgContent) {
            this.msgContent = msgContent;
        }

        public long getMsgDate() {
            return msgDate;
        }

        public void setMsgDate(long msgDate) {
            this.msgDate = msgDate;
        }

        public String getMsgType() {
            return msgType;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public Object getParent() {
            return parent;
        }

        public void setParent(Object parent) {
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "MenuXBean{" +
                    "id='" + id + '\'' +
                    ", msgTitle='" + msgTitle + '\'' +
                    ", msgContent='" + msgContent + '\'' +
                    ", msgDate=" + msgDate +
                    ", msgType='" + msgType + '\'' +
                    ", parent=" + parent +
                    '}';
        }
    }
}
