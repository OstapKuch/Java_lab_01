package ua.lviv.iot.lab_3.models;

public class MasterClass extends HolidayForChildren {

    private MasterClassType type;

    public MasterClass(MasterClassType type) {
        this.type = type;
    }

    public MasterClass(double price, double duration, int childrenNumber, int ageCategory, MasterClassType type) {
        super(price, duration, childrenNumber, ageCategory);
        this.type = type;
    }

    public MasterClassType getType() {
        return type;
    }

    public void setType(MasterClassType type) {
        this.type = type;
    }
}
