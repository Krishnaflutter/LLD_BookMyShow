import java.util.Date;

public class Show {
    private Date showTime;
    private int id;
    private static int idCounter = 0;
    private int seatAvailable;
    private Movie movie;
    private Theater theater;

    public Show(Date showTime,Movie movie,Theater theater){
        idCounter+=1;
        this.id = idCounter;
        this.showTime = showTime;
        this.movie = movie;
        this.theater = theater;
        this.seatAvailable = theater.getCapacity();
    }

    public synchronized Ticket bookTicket(RegisteredUser user, int seats){
        if(seatAvailable >= seats && seats >0){
            Ticket ticket = new Ticket();
            seatAvailable -= seats;
            ticket.setOwner(user.getName());
            ticket.setBookedShow(this);
            ticket.setBookingTime(new Date());
            ticket.setNumberOfSeats(seats);
            System.out.println("Successfully booked");
            user.bookingHistory.add(ticket);
            return ticket;
        }
        else{
            System.out.println("Seats not Available");
            return null;
        }
    }
    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", showTime=" + showTime +
                ", movie=" + movie.getName() +
                ", theater=" + theater.getName() +
                ", availableSeats=" + seatAvailable +
                '}';
    }

    public Date getShowTime() {
        return showTime;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }
}
