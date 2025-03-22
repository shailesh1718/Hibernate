package com.shailesh;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //if we don't use then : ERROR Unable to locate persister: com.shailesh.Student
public class Student {

    @Id //This annotation indicated below field is Primary key and is mandatory or else throws error
    private int rollNo;
    private String sName;
    private int sAge;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }


}
