package ua.lviv.iot.lab_3.models;

public class Quest extends HolidayForChildren {

    private QuestLocation location;
    private QuestDifficulty difficulty;

    public Quest() {

    }

    public Quest(final QuestLocation location,
                 final QuestDifficulty difficulty) {
        this.location = location;
        this.difficulty = difficulty;
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

    public final void setLocation(final QuestLocation location) {
        this.location = location;
    }

    public final QuestDifficulty getDifficulty() {
        return difficulty;
    }

    public final void setDifficulty(final QuestDifficulty difficulty) {
        this.difficulty = difficulty;
    }
}
