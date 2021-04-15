
public class Cinema {

    public boolean canBuyTicket(Movie movie, Customer customer) {
        if (movie.getAgeRestriction() > customer.getAge()) {
            return false;
        } else {
            return true;
        }
    }

    public Ticket orderTicket(Movie movie, Customer customer, int seat) throws Exception {
        if (this.canBuyTicket(movie, customer)) {
            return new Ticket("Frozen 2", 42);
        } else {
            throw new Exception("Customer does not meet age restriction");
        }
    }
}