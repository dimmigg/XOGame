public class Field {
    static char[][] field = new char[3][3];

    static void init() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                field[y][x] = '.';
            }
        }
        print();
    }

    static void print() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println();
        }
    }
}
