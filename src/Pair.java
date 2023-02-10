public class Pair {
    private final String NAME;
    private final String AUTHOR;

    public Pair(String NAME, String AUTHOR) {
        this.NAME = NAME;
        this.AUTHOR = AUTHOR;
    }

    public String getNAME() {
        return NAME;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    @Override
    public String toString() {
        return "<<" + NAME + ">>" + " "
                + AUTHOR;
    }
}
