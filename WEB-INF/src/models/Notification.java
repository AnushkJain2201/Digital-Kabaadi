package models;

import java.sql.Timestamp;

public class Notification {
    private Integer notificationId;
    private User user;
    private String message;
    private Timestamp sentAt;
    
    public Integer getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Timestamp getSentAt() {
        return sentAt;
    }
    public void setSentAt(Timestamp sentAt) {
        this.sentAt = sentAt;
    }

    
}
