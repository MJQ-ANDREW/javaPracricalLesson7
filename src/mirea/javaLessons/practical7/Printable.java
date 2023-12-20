package mirea.javaLessons.practical7;

public interface Printable {
    void print();

    static void printMagazine(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Journal) {
                printable[i].print();
            }
        }
    }

    static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                printable[i].print();
            }
        }
    }
}
