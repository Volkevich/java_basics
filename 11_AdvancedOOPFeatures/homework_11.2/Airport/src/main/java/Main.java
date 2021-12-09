import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import net.sf.saxon.trans.SymbolicName;


import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        findPlanesLeavingInTheNextTwoHours(Airport.getInstance());
        /*System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));*/



    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime twoTime = now.plusHours(2);
        LocalDateTime minusTime = now.minusHours(2);


        List<Flight> flightList = airport.getTerminals().stream().flatMap(terminal -> terminal.getFlights()
                .stream().filter(flight -> flight.getType()
                .equals(Flight.Type.DEPARTURE)))
                .filter(flight -> localDateTime((flight.getDate())).isBefore(twoTime))
                .filter(flight -> localDateTime(flight.getDate()).isAfter(minusTime))
                .collect(Collectors.toList());


        //TODO Метод должен вернуть список рейсов вылетающих в ближайшие два часа.
        return flightList;
    }

    public static LocalDateTime localDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
