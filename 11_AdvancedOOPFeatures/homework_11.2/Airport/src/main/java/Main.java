import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        findPlanesLeavingInTheNextTwoHours(Airport.getInstance());
        System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));
        
        

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        LocalDateTime now = LocalDateTime.now();

        List<Flight> flightList = airport.getTerminals().stream().flatMap(terminal -> terminal.getFlights()
                .stream().filter(flight -> flight.getType()
                .equals(Flight.Type.DEPARTURE)))
                .filter(flight -> localDateTime(flight.getDate()).getHour() <= (now.plusHours(2).getHour()))
                .filter(flight -> localDateTime(flight.getDate()).getHour()  >= (now.minusHours(2).getHour()))
                .collect(Collectors.toList());


        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return flightList;
    }

    public static LocalDateTime localDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
