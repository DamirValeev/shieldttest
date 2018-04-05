package sqlLiteWork;

public class departments {
    private int id;
    private String name;

    public departments(int id, String name) {
        this.id = id;
        this.name = name;
    }

    departments(){}

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

    @Override
    public String toString() {
        return "departments{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
