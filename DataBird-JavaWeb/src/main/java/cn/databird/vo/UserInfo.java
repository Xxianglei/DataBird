package cn.databird.vo;

import java.util.Date;

/**
 * Created by 言溪 on 2016/11/3.
 */
public class UserInfo {
    private String realName;
    private boolean sex;
    private String email;
    private String phoneNum;
    private String nativePlace;
    private String workPlace;
    private String workCompany;
    private String studyDir;
    private String avator;
    private String grade;
    private Date birthday;
    private String lab;

    public UserInfo() {
    }

    public UserInfo(String realName, boolean sex, String email, String phoneNum, String nativePlace, String workPlace,
                    String workCompany, String studyDir, String avator, String grade, Date birthday, String lab) {
        this.realName = realName;
        this.sex = sex;
        this.email = email;
        this.phoneNum = phoneNum;
        this.nativePlace = nativePlace;
        this.workPlace = workPlace;
        this.workCompany = workCompany;
        this.studyDir = studyDir;
        this.avator = avator;
        this.grade = grade;
        this.birthday = birthday;
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "realName='" + realName + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", workCompany='" + workCompany + '\'' +
                ", studyDir='" + studyDir + '\'' +
                ", avator='" + avator + '\'' +
                ", grade='" + grade + '\'' +
                ", birthday=" + birthday +
                ", lab='" + lab + '\'' +
                '}';
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    public String getStudyDir() {
        return studyDir;
    }

    public void setStudyDir(String studyDir) {
        this.studyDir = studyDir;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
}
