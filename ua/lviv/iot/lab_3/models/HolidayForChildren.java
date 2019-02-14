package ua.lviv.iot.lab_3.models;

public abstract class HolidayForChildren {

    private double price;
    private double duration;
    private int childrenNumber;
    private int ageCategory;

    public HolidayForChildren() {

    }

    public HolidayForChildren(double price, double duration, int childrenNumber, int ageCategory) {
        this.price = price;
        this.duration = duration;
        this.childrenNumber = childrenNumber;
        this.ageCategory = ageCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int ageCategory) {
        this.ageCategory = ageCategory;
    }
}
