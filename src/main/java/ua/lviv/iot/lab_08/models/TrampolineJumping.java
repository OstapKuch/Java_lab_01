package ua.lviv.iot.lab_08.models;

import javax.persistence.Entity;

@Entity
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

    public double getTrampolineSize() {
        return trampolineSize;
    }

    public void setTrampolineSize(final double trampolineSize) {
        this.trampolineSize = trampolineSize;
    }
}
