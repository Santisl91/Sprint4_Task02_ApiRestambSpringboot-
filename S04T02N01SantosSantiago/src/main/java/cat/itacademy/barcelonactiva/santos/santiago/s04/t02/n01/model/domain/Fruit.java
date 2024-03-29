package cat.itacademy.barcelonactiva.santos.santiago.s04.t02.n01.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int kgQuantity;

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

    public int getKgQuantity() {
        return kgQuantity;
    }

    public void setKgQuantity(int kgQuantity) {
        this.kgQuantity = kgQuantity;
    }

}