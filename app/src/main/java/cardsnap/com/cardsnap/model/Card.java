package cardsnap.com.cardsnap.model;

import java.util.Date;

public class Card {
    private String fromName;
    private Date date;
    private int resourceIndentifier;



    public Card(String name,Date date, int resourceIndentifier){
        fromName = name;
        //this.date = date;
        this.resourceIndentifier = resourceIndentifier;
    }

    public String getFromName() {
        return fromName;
    }

    public Date getDate() {
        return date;
    }

    public int getResourceIndentifier() {
        return resourceIndentifier;
    }
}
