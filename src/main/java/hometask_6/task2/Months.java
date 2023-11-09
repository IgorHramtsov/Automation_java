package hometask_6.task2;

public enum Months {

    January(31, Seasons.WINTER),
    February(28, Seasons.WINTER),
    March(31, Seasons.SPRING),
    April(30, Seasons.SPRING),
    May(31, Seasons.SPRING),
    June(30, Seasons.SUMMER),
    July(31, Seasons.SUMMER),
    August(31, Seasons.SUMMER),
    September(30, Seasons.AUTUMN),
    October(31, Seasons.AUTUMN),
    November(30, Seasons.AUTUMN),
    December(31, Seasons.WINTER);

    private final int Days;
    private final Seasons season;


    Months(int days, Seasons season) {
        Days = days;
        this.season = season;
    }

    public int getDays() {
        return Days;
    }

    public Seasons getSeason() {
        return season;
    }
}
