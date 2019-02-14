package ua.lviv.iot.lab_3.models;

public class Quest extends HolidayForChildren {

    private QuestLocation location;
    private QuestDifficulty difficulty;

    public Quest() {

    }

    public Quest(QuestLocation location, QuestDifficulty difficulty) {
        this.location = location;
        this.difficulty = difficulty;
    }

    public Quest(double price, double duration, int childrenNumber, int ageCategory, QuestLocation location, QuestDifficulty difficulty) {
        super(price, duration, childrenNumber, ageCategory);
        this.location = location;
        this.difficulty = difficulty;
    }

    public QuestLocation getLocation() {
        return location;
    }

    public void setLocation(QuestLocation location) {
        this.location = location;
    }

    public QuestDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(QuestDifficulty difficulty) {
        this.difficulty = difficulty;
    }
}
