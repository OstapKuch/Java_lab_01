package ua.lviv.iot.lab_08.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class HolidayForChildren {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;

    private double price;
    private double duration;
    private int childrenNumber;
    private int ageCategory;

    public HolidayForChildren() {

    }

    public HolidayForChildren(final double price, final double duration,
                              final int childrenNumber, final int ageCategory) {
        this.price = price;
        this.duration = duration;
        this.childrenNumber = childrenNumber;
        this.ageCategory = ageCategory;
    }

    public Long   getId() {
        return id;
    }

    public void setId(final Long   id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(final double duration) {
        this.duration = duration;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(final int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(final int ageCategory) {
        this.ageCategory = ageCategory;
    }
}
