import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RouteCalculatorTest extends TestCase {


    List<Station> route;
    RouteCalculator routeCalculator;
    static StationIndex stationIndex = new StationIndex();
    Station station1;
    Station station2;
    Station station3;

    List<Station> connect;

    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        routeCalculator = new RouteCalculator(stationIndex);


        Line line1 = new Line(1, "Красная");
        Line line2 = new Line(2, "Синяя");
        Line line3 = new Line(3, "Зеленая");
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        line1.addStation(new Station("Алтайская", line1));
        line1.addStation(new Station("Каменская", line1));
        line1.addStation(new Station("Алтайская", line1));

        line3.addStation(new Station("Нагорная", line3));
        line3.addStation(new Station("Зимняя", line3));
        line3.addStation(new Station("Красивая", line3));


        route.add(new Station("Петровская", line1));
        route.add(new Station("Пушкинская", line1));
        route.add(new Station("Петровщина", line1));
        route.add(new Station("Грушевка", line2));

        station1 = new Station("Алтайская", line2);
        station2 = new Station("Пушкинская", line1);
        station3 = new Station("Зимняя", line3);


    }
    @Test
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 8.5;
        assertEquals(expected, actual);
    }
    @Test
    public void testShortestRoute() {
        List<Station> actual = routeCalculator.getShortestRoute(station1, station3);
        List<Station> expected = new ArrayList<Station>(Arrays.asList(station1, station2,station3));
        assertEquals(expected, actual);
    }




    /*public void testIsConnected() {
        connect = stationIndex.getConnectedStations(station1);

        boolean actual = connect.contains(station2);
        boolean expected = true;
        assertEquals(expected, actual);
    }*/


    @Override
    protected void tearDown() throws Exception {


        super.tearDown();
    }
}
