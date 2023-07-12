package om.gov.omantax.entity;

public class Department {
    private  int id;
    private String name;
    private int mangerId;
    private  int locationId;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mangerId=" + mangerId +
                ", locationId=" + locationId +
                '}';
    }

    public Department() {
    }

    public Department(int id, String name, int mangerId, int locationId) {
        this.id = id;
        this.name = name;
        this.mangerId = mangerId;
        this.locationId = locationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMangerId() {
        return mangerId;
    }

    public void setMangerId(int mangerId) {
        this.mangerId = mangerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
