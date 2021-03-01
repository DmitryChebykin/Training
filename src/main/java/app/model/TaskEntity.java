package app.model;

public class TaskEntity {

    private String description;

    public TaskEntity(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Задача{" +
                "пояснение='" + description + '\'' +
                '}';
    }
}
