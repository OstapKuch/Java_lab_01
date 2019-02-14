package ua.lviv.iot.lab_3.models;

public class TrampolineJumping extends HolidayForChildren {

    private double trampolineSize;

    public TrampolineJumping(double trampolineSize) {
        this.trampolineSize = trampolineSize;
    }

    public TrampolineJumping(double price, double duration, int childrenNumber, int ageCategory, double trampolineSize) {
        super(price, duration, childrenNumber, ageCategory);
        this.trampolineSize = trampolineSize;
    }

    public double getTrampolineSize() {
        return trampolineSize;
    }

    public void setTrampolineSize(double trampolineSize) {
        this.trampolineSize = trampolineSize;
    }
}
