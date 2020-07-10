package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
    private String roomId;
    private String roomName;
    private String roomType;
    private String status;
    private String createDate;
    private String createUser;
    private String updateDate;
    private String updateUser;
    private String deleteDate;
    private String deleteUser;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser;
    }

    public Room(String roomId) {
        this.roomId = roomId;
        this.roomName = roomId;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        this.createDate = formatter.format(date);
        this.createUser = "default constructor";
    }

    public Room(String roomId, String roomName, String roomType, String status, String createDate, String createUser) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomType = roomType;
        this.status = status;
        this.createDate = createDate;
        this.createUser = createUser;
    }
}
