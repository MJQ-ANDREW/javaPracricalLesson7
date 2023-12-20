package mirea.javaLessons.practical7;

public class Journal implements Printable {
    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    public String test() { return null; }

}
