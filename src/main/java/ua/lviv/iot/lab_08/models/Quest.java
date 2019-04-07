package ua.lviv.iot.lab_08.models;

public class Quest extends HolidayForChildren {

    private QuestLocation location;
    private QuestDifficulty difficulty;

    public Quest() {

    }

    public Quest(final double price,
                 final double duration,
                 final int childrenNumber,
                 final int ageCategory,
                 final QuestLocation location,
                 final QuestDifficulty difficulty) {
        super(price, duration, childrenNumber, ageCategory);
        this.location = location;
        this.difficulty = difficulty;
    }

    public final QuestLocation getLocation() {
        return location;
    }

    public final QuestDifficulty getDifficulty() {
        return difficulty;
    }

}
