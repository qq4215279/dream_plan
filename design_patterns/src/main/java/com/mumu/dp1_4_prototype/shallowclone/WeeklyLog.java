package com.mumu.dp1_4_prototype.shallowclone;

public class WeeklyLog implements Cloneable {
    // 为了简化设计和实现，假设一份工作周报中只有一个附件对象，实际情况中可以包含多个附件，可以通过List等集合对象来实现
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    /**
     * 使用clone()方法实现浅克隆
     * @param
     * @return com.mumu.prototype.shallowclone.WeeklyLog
     * @author liuzhen
     * @date 2021/10/19 21:58
     */
    @Override
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog)obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }

    /**
     * 浅克隆实现方式2：
     * @author liuzhen
     * @date 2021/10/20 14:11
     * @param
     * @return com.mumu.dp1_4_prototype.shallowclone.WeeklyLog
     */
    public WeeklyLog clone2() {
        WeeklyLog clone = new WeeklyLog();

        clone.attachment = this.attachment;
        clone.name = this.name;
        clone.date = this.date;
        clone.content = this.content;

        return clone;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return (this.attachment);
    }

    public String getName() {
        return (this.name);
    }

    public String getDate() {
        return (this.date);
    }

    public String getContent() {
        return (this.content);
    }
}
