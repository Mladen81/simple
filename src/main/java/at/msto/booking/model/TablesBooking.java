package at.msto.booking.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
public class TablesBooking extends Booking{


    private List<Table> tables =new ArrayList<>();
    private int numOfPersons;



    public List<Table> getTables() {
        return Collections.unmodifiableList(this.tables);
    }

    public void addTables(Table... newTables){
        this.tables.addAll(Arrays.asList(newTables));
    }

    public int getNumOfPersons() {
        return numOfPersons;
    }

    public void setNumOfPersons(int numOfPersons) {
        this.numOfPersons = numOfPersons;
    }
}
