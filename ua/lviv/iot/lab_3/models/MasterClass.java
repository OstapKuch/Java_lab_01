package ua.lviv.iot.lab_3.models;

public class MasterClass extends HolidayForChildren {

    private MasterClassType type;

    public MasterClass(final MasterClassType type) {
        this.type = type;
    }

    public MasterClass(final double price,
                       final double duration,
                       final int childrenNumber,
                       final int ageCategory,
                       final MasterClassType type) {
        super(price, duration, childrenNumber, ageCategory);
        this.type = type;
    }

    public final MasterClassType getType() {
        return type;
    }

    public final void setType(final MasterClassType type) {
        this.type = type;
    }
}
