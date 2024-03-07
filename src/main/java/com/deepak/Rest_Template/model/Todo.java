// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.deepak.Rest_Template.model;
import java.util.List;

public class Todo {
    private long id;
    private boolean completed;
    private String title;
    private long userId;

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public boolean getCompleted() { return completed; }
    public void setCompleted(boolean value) { this.completed = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public long getUserId() { return userId; }
    public void setUserId(long value) { this.userId = value; }
}
