package ua.lviv.iot.lab_3.models;

public abstract class HolidayForChildren {

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

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final double getDuration() {
        return duration;
    }

    public final void setDuration(final double duration) {
        this.duration = duration;
    }

    public final int getChildrenNumber() {
        return childrenNumber;
    }

    public final void setChildrenNumber(final int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public final int getAgeCategory() {
        return ageCategory;
    }

    public final void setAgeCategory(final int ageCategory) {
        this.ageCategory = ageCategory;
    }
}
