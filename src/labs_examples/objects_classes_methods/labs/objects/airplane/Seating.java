package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Seating {
    private int seatsPerRow;
    private boolean hasBusinessClass;
    private int legroom;

    public Seating(int seatsPerRow, boolean hasBusinessClass, int legroom) {
        this.seatsPerRow = seatsPerRow;
        this.hasBusinessClass = hasBusinessClass;
        this.legroom = legroom;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    public boolean isHasBusinessClass() {
        return hasBusinessClass;
    }

    public void setHasBusinessClass(boolean hasBusinessClass) {
        this.hasBusinessClass = hasBusinessClass;
    }

    public int getLegroom() {
        return legroom;
    }

    public void setLegroom(int legroom) {
        this.legroom = legroom;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "seatsPerRow=" + seatsPerRow +
                ", hasBusinessClass=" + hasBusinessClass +
                ", legroom=" + legroom +
                '}';
    }
}
