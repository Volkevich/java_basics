import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RouteCalculatorTest extends TestCase {


    List<Station> forTransferRoute;
    List<Station> TransferRoute;


    RouteCalculator routeCalculator;
    StationIndex stationIndex;

    Station altaiskay;
    Station pushkinskaya;
    Station zimnya;
    Station summer;

    List<Station> connect;

    @Override
    protected void setUp() throws Exception {
        forTransferRoute = new ArrayList<>();


        stationIndex = new StationIndex();

        Line redLine = new Line(1, "Красная");
        Line blueLine = new Line(2, "Синяя");
        Line greenLine = new Line(3, "Зеленая");


        forTransferRoute.add(new Station("Петровская", redLine));
        forTransferRoute.add(new Station("Пушкинская", redLine));
        forTransferRoute.add(new Station("Молодежная", redLine));
        forTransferRoute.add(new Station("Грушевка", blueLine));


        //TODO:Станции
        altaiskay = new Station("Алтайская", blueLine);
        pushkinskaya = new Station("Пушкинская", redLine);
        zimnya = new Station("Зимняя", blueLine);
        summer = new Station("Летняя", greenLine);
        Station sun = new Station("Солнечная", redLine);
        Station redgor = new Station("Красногорская", redLine);
        Station blueEye = new Station("Синевокая", redLine);
        Station pear = new Station("Грушевка", blueLine);
        Station youth = new Station("Молодежная", redLine);





        Stream.of(redLine, blueLine, greenLine).forEach(stationIndex::addLine);
        Stream.of(altaiskay, pushkinskaya, zimnya, summer,sun,redgor,blueEye,pear,youth).
                peek(station -> station.getLine().addStation(station)).
                forEach(stationIndex::addStation);
        stationIndex.addConnection(Stream.of(altaiskay,pushkinskaya).collect(Collectors.toList()));
        stationIndex.addConnection(Stream.of(zimnya,summer).collect(Collectors.toList()));
        stationIndex.getConnectedStations(altaiskay);
        stationIndex.getConnectedStations(zimnya);

        routeCalculator = new RouteCalculator(stationIndex);

        TransferRoute = Stream.of(altaiskay,zimnya).collect(Collectors.toList());

    }

    @Test
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(forTransferRoute);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    @Test
    public void testShortestRoute() {
    List<Station> actualNotransfer = routeCalculator.getShortestRoute(altaiskay,zimnya);
    List<Station> expectedNoTransfer = TransferRoute;
        assertEquals(expectedNoTransfer, actualNotransfer);
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
