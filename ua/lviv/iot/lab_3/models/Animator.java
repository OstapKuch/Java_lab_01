package ua.lviv.iot.lab_3.models;

public class Animator extends HolidayForChildren {

    private AnimatorType type;
    private int animatorsQuantity;


    public Animator(double price, double duration, int childrenNumber, int ageCategory, AnimatorType type, int animatorsQuantity) {
        super(price, duration, childrenNumber, ageCategory);
        this.type = type;
        this.animatorsQuantity = animatorsQuantity;
    }

    public AnimatorType getType() {
        return type;
    }

    public void setType(AnimatorType type) {
        this.type = type;
    }

    public int getAnimatorsQuantity() {
        return animatorsQuantity;
    }

    public void setAnimatorsQuantity(int animatorsQuantity) {
        this.animatorsQuantity = animatorsQuantity;
    }
}
