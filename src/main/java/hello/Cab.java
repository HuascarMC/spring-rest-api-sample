package hello;

public class Cab {

    private final long id;
    private final String state;
    private final String name;
    private final String coords;
    private final String city;

    public Greeting(long id, String state, String name, String coords, String city) {
        this.id = id;
        this.state = state;
        this.name = name;
        this.coords = coords;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getCoords() {
        return coords;
    }

    public String getCity() {
        return city;
    }
}
