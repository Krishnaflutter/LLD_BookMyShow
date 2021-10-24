import java.util.Date;

public class Ticket {
    private int id;
    private static int idCounter = 0;
    private Date bookingTime;
    private Show bookedShow;
    private int numberOfSeats;
    private String owner;

    public Ticket(){
        idCounter+=1;
        this.id = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "owner='" + owner +", bookingTime=" + bookingTime +
                ", numberOfSeats=" + numberOfSeats +
                ", bookedShow=" + bookedShow + "}";
    }

}
