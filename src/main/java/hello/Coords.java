package hello;
public class Coords {
  private final String lat;
  private final String lon;

  public Coords(String lat, String lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public String getLat() {
      return lat;
  }

  public String getLon() {
      return lon;
  }

}
