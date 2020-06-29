package com.lib.project.profile.domain;

/**
 * jdbc连接查询测试
 * 文件通知
 */
public class Notice {

    private String name;

    private Long type;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                '}';
    }
}
