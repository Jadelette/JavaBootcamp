public class Ticket {
    private final String title;
    private final int seat;

    public Ticket(String title, int seat) {
        this.title = title;
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return title.equals(ticket.title)  &&
                seat == (ticket.seat);}

    public String getTitle() {
        return title;
    }

    public int getSeat() {
        return seat;
    }
}
