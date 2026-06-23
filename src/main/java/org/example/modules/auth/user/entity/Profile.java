package org.example.modules.auth.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String workAt;

    private  String university;

    private  Double salary;

    public  Profile(){}

    public Profile(String workAt, String university,Double salary){
        this.workAt = workAt;
        this.university  = university;
        this.salary = salary;
    }

    public String getWorkAt() {
        return workAt;
    }

    public void setWorkAt(String workAt) {
        this.workAt = workAt;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        university = university;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        salary = salary;
    }


}
