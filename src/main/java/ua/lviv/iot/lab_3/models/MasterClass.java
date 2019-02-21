package ua.lviv.iot.lab_3.models;

public class MasterClass extends HolidayForChildren {

    private MasterClassType type;

    MasterClass() {

    }

    public MasterClass(final double price,
                       final double duration,
                       final int childrenNumber,
                       final int ageCategory,
                       final MasterClassType type) {
        super(price, duration, childrenNumber, ageCategory);
        this.type = type;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", MasterClassType";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + getType();
    }

    public final MasterClassType getType() {
        return type;
    }

}
