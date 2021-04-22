package models;

import javax.persistence.*;

@Entity

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;
    @ManyToOne
    public Employee manager;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
