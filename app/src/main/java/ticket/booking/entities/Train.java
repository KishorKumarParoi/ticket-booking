package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;
    private String trainName;
    private String trainNo;
    private List<List<Boolean>> seats;
    private Map<String, Time> stationTimings;
    private List<String> stations;
}
