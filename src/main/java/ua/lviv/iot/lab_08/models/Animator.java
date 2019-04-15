package ua.lviv.iot.lab_08.models;


import javax.persistence.Entity;

@Entity
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

    @Override
    public String toString() {
        return "Animator: " + super.toString() +
                " type=" + type +
                ", animatorsQuantity=" + animatorsQuantity;
    }

    public void setType(final AnimatorType type) {
        this.type = type;
    }

    public AnimatorType getType() {
        return type;
    }

    public int getAnimatorsQuantity() {
        return animatorsQuantity;
    }

    public void setAnimatorsQuantity(final int animatorsQuantity) {
        this.animatorsQuantity = animatorsQuantity;
    }
}
