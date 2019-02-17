package ua.lviv.iot.lab_3.models;

public class Animator extends HolidayForChildren {

    private AnimatorType type;
    private int animatorsQuantity;

    public Animator() {

    }


    public Animator(final double price,
                    final double duration,
                    final int childrenNumber,
                    final int ageCategory,
                    final AnimatorType type,
                    final int animatorsQuantity) {
        super(price, duration, childrenNumber, ageCategory);
        this.type = type;
        this.animatorsQuantity = animatorsQuantity;
    }

    public final AnimatorType getType() {
        return type;
    }

    public final int getAnimatorsQuantity() {
        return animatorsQuantity;
    }

    public final void setAnimatorsQuantity(final int animatorsQuantity) {
        this.animatorsQuantity = animatorsQuantity;
    }
}
