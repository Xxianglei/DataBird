package cn.databird.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 言溪 on 2016/10/18.
 */
@Entity
@Table(name="user",schema = "",catalog = "dataBird")
public class User {
    private String userName;
    private Date startTime;
    private Date leaveTime;
    private String address;
    @Id
    @Column(name="userName",nullable = false,length = 16)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Basic
    @Column(name = "startTime",nullable = true)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    @Basic
    @Column(name = "leaveTime",nullable = false)
    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
    @Basic
    @Column(name ="address",nullable = false,length = 20)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
