package creational_design_patterns.prototype_dp;

public class Book {
    private int id;
    private String title;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + this.getId() +
                ", title='" + this.getTitle() + '\'' +
                '}';
    }
}
