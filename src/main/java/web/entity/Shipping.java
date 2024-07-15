package web.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String method;
    private Integer daysToShip;

    //getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getDaysToShip() {
        return daysToShip;
    }

    public void setDaysToShip(Integer daysToShip) {
        this.daysToShip = daysToShip;
    }
}
