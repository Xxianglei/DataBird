package cn.databird.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 言溪 on 2016/10/19.
 */
@Entity
@Table(name="user",schema = "",catalog = "databird")
public class User {
    private String userName;
    private String realName;
    private boolean sex;
    private String password;
    private String email;
    private char phoneNum;
    private String nativePlace;
    private String workPlace;
    private String workCompany;
    private String studyDir;
    private String avator;
    private String grade;
    private Date startTime;
    private Date leaveTime;
    private Date birthday;
    private Integer slead;
    private Integer star;
    private String lab;
    public String toString(){
        String s = "userName:" + userName + "\n" +
                "realName:" + realName + "\n" +
                "sex:" + sex + "\n" +
                "password:" + password + "\n" +
                "email:" + email + "\n" +
                "phoneNum:" + phoneNum + "\n" +
                "nativePlace:" + nativePlace + "\n" +
                "workPlace:" + workPlace + "\n" +
                "workCompany:" + workCompany + "\n" +
                "studyDir:" + studyDir + "\n" +
                "avator:" + avator + "\n" +
                "grade:" + grade + "\n" +
                "startTime:" + startTime + "\n" +
                "leaveTime:" + leaveTime + "\n" +
                "birthday:" + birthday + "\n" +
                "slead:" + slead + "\n" +
                "star:" + star + "\n" +
                "lab:" + lab;
        return s;
    }
    @Id
    @Column(name="userName",nullable = false,length = 16)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Basic
    @Column(name = "startTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    @Basic
    @Column(name = "leaveTime",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
    @Basic
    @Column(name="realName",nullable = false, length = 10)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    @Basic
    @Column(name ="sex",nullable = false)
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
   @Basic
   @Column(name="password",nullable = false,length = 16)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Basic
    @Column(name="email" ,length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Basic
    @Column(name="phoneNum" ,length = 11)
    public char getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(char phoneNum) {
        this.phoneNum = phoneNum;
    }
    @Basic
    @Column(name = "nativePlace" ,length = 20)
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    @Basic
    @Column(name = "workPlace" ,length = 20)
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }
    @Basic
    @Column(name = "workCompany" ,length = 20)
    public String getWorkCompnay() {
        return workCompany;
    }

    public void setWorkCompnay(String workCompnay) {
        this.workCompany = workCompnay;
    }
    @Basic
    @Column(name = "studyDir",length = 16)
    public String getStudyDir() {
        return studyDir;
    }

    public void setStudyDir(String studyDir) {
        this.studyDir = studyDir;
    }
    @Basic
    @Column(name = "avator" ,length = 30)
    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
    @Basic
    @Column(name = "grade",length = 5)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Basic
    @Column(name = "birthday",length = 10)
    @Temporal(TemporalType.DATE)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Basic
    @Column(name = "slead" ,length = 2)
    public Integer getSlead() {
        return slead;
    }

    public void setSlead(Integer slead) {
        this.slead = slead;
    }
    @Basic
    @Column(name = "star" ,length = 4)
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }
    @Basic
    @Column(name = "lab",length = 10)
    public String getLabl() {
        return lab;
    }

    public void setLabl(String labl) {
        this.lab = labl;
    }
}
