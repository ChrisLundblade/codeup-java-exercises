import java.util.Date;

public class WeatherReading {
    private double latitude;
    private double longitude;
    private Date recordedAt;//(from java.util.Date) recordedAt
    private double tempInCelsius;


    public static double kelvinToCelsius(double kelvinTemp) {   // - takes in a double and returns a double, converting temp from Kelvin to Celsius
        return (kelvinTemp-273.15);
    }
//    public instance methods:
//
//    getters and setters

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setTempInCelsius(double kelvinTemp){
        this.tempInCelsius = kelvinToCelsius(kelvinTemp);
    }

    public double getTempInCelsius(){
        return tempInCelsius;
    }

    //    for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin){
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = kelvinToCelsius(tempInKelvin);
    }

    public static void main(String[] args) {

        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());


    }
}
