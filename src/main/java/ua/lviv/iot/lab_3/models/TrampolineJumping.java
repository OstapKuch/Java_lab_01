package ua.lviv.iot.lab_3.models;

public class TrampolineJumping extends HolidayForChildren {

    private double trampolineSize;

    public TrampolineJumping() {

    }

    public TrampolineJumping(final double price,
                             final double duration,
                             final int childrenNumber,
                             final int ageCategory,
                             final double trampolineSize) {
        super(price, duration, childrenNumber, ageCategory);
        this.trampolineSize = trampolineSize;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", trampolineSize";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + getTrampolineSize();
    }

    public final double getTrampolineSize() {
        return trampolineSize;
    }

    public final void setTrampolineSize(final double trampolineSize) {
        this.trampolineSize = trampolineSize;
    }
}
