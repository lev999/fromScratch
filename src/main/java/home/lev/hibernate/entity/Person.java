package home.lev.hibernate.entity;

import javax.persistence.*;

//CREATE TABLE `Person` (
//        `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//        `name` varchar(20) NOT NULL DEFAULT '',
//        `country` varchar(20) DEFAULT NULL,
//        PRIMARY KEY (`id`)
//        )

@Entity
@Table(name = "person",schema = "person")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;

    @Override
    public String toString() {
        return "id="+id+" name="+name+" country="+country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
