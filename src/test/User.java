package test;

import com.google.appengine.api.datastore.Key;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private User id;

    @Persistent
    private String name;

    @Persistent
    private int stu_num;
    
    @Persistent
    private String pw;
    
    @Persistent
    private int phNum;
    
    @Persistent
    private String phid;
    
    @Persistent
    private int carNum;

    @Persistent
    private String carType;

    @Persistent
    private Date date;

    public User(User id, String name, int stu_num, String pw, int phNum, String phid, int carNum, String carType, Date date) {
        this.id = id;
        this.name = name;
        this.stu_num = stu_num;
        this.pw = pw;
        this.phNum = phNum;
        this.phid = phid;
        this.carNum = carNum;
        this.carType = carType;
        this.date = date;
    }

    public Key getKey() {
        return key;
    }

    public User getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }
    
    public int getPhNum() {
        return phNum;
    }
    
    public String getPhid() {
        return phid;
    }
    
    public int getCarNum() {
        return carNum;
    }
    
    public String getCarType() {
        return carType;
    }

    public Date getDate() {
        return date;
    }

    public void setId(User id) {
        this.id = id;
    }
    
    public void setName(String name) {
       	this.name = name;
    }

    public void setPw(String pw) {
       	this.pw = pw;
    }
    
    public void setPhNum(int phNum) {
        this.phNum = phNum;
    }
    
    public void setPhid(String phid) {
    	this.phid = phid;
    }
    
    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
    
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}