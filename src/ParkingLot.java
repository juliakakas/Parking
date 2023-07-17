import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    static List<String> autoAsStrings = FileInputHandler.getLinesOfTextFile();
    static List<Auto> parking = new ArrayList<>();

    public static void main(String[] args) {
//        Auto audi = new Auto("AAA-111",CarType.VEHICLE,CarColor.BLACK,5,10);
//        Parking.add(String.valueOf(audi));
    }

    private static void createParkingList() {
        for (String parkingLine : autoAsStrings) {
            String[] autoData = parkingLine.split(",");
            parking.add(new Auto(autoData[0],
                        CarType.valueOf(autoData[1]),
                        CarColor.valueOf(autoData[2]),
                        Integer.parseInt(autoData[3]),
                        Integer.parseInt(autoData[4])));

            

        }
    }


}