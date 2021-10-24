import java.util.ArrayList;

public class Theater {
    private int id;
    private String name;
    private String location;
    private int capacity;
    private static int idCounter = 0;

    private ArrayList<Show> shows;

    public Theater(String name , String location , int capacity){
        idCounter+=1;
        this.id = idCounter;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public void updateShow(Show oldShow,Show newShow){
        int index = -1;
        for(int i=0;i<shows.size();i++){
            Show currentShow = shows.get(i);
            if(currentShow == oldShow){
                index = i;
            }
        }
        if(index != -1){
            shows.remove(index);
            shows.add(newShow);
        }
        return;
    }

    public ArrayList<Show> getShows(){
        return this.shows;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
