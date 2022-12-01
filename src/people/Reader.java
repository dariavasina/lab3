package people;

import enums.Mood;

public class Reader extends Human{
    private Mood emotions = Mood.CALM;

    public Reader(String name) {
        super(name);
    }

    public Mood getEmotions() {
        return emotions;
    }

    public void setEmotions(Mood emotions) {
        this.emotions = emotions;
        switch (emotions) {
            case CALM -> System.out.printf("%s спокоен\n", getName());
            case AMAZED -> System.out.printf("%s изумлен\n", getName());
            case WORRIED -> System.out.printf("%s взволнован\n", getName());
            case TERRIFIED -> System.out.printf("%s испуган\n", getName());
        }
    }


}
