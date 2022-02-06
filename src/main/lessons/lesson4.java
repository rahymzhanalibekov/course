import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        //проверка первой диагонали матрицы
        int k = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i == j) && (map[i][j] == symb)) k++;
                else k = 0;
                if (k == DOTS_TO_WIN) return true;
            }
        }

        //проверка второй диагонали матрицы
        k = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i][map.length - 1 - i] == symb) k++;
            else k = 0;
            if (k == DOTS_TO_WIN) return true;
        }

        //проверка строк и столбцов матрицы
        k = 0;
        for (int i = 0; i < map.length; i++) {
            k = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == symb) k++;
                else k = 0;
                if (k == DOTS_TO_WIN) return true;
            }

            k = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[j][i] == symb) k++;
                else k = 0;
                if (k == DOTS_TO_WIN) return true;
            }


        }
        return false;
    }

    public static int[] getNextStep(char symb) {
        int[] xy = {0, 0, 0};
        boolean find_step = false;
        //проверка первой диагонали матрицы
        int k = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i == j) && (map[i][j] == symb)) k++;
                else if ((i == j) && (map[i][j] != symb)) k = 0;
                if (k == DOTS_TO_WIN - 1) {
                    //проверка пусто ли след. ячейка
                    if (isCellValid(i + 1, j + 1)) {
                        xy[0] = i + 1;
                        xy[1] = j + 1;
                        xy[2] = 1;
                        find_step = true;
                    } else if (isCellValid(i - k, j - k)) {
                        xy[0] = i - k;
                        xy[1] = j - k;
                        xy[2] = 1;
                        find_step = true;
                    }


                }
            }
        }

        if (!find_step) {
            //проверка второй диагонали матрицы
            k = 0;
            for (int i = 0; i < map.length; i++) {
                if (map[i][map.length - 1 - i] == symb) k++;
                else k = 0;

                if (k == DOTS_TO_WIN - 1) {
                    //проверка пусто ли след. ячейка
                    if (isCellValid(i + 1, map.length - 2 - i)) {
                        xy[0] = i + 1;
                        xy[1] = map.length - 2 - i;
                        xy[2] = 1;
                        find_step = true;
                    } else if (isCellValid(i - k, map.length - 1 - i - k)) {
                        xy[0] = i - k;
                        xy[1] = map.length - 1 - i - k;
                        xy[2] = 1;
                        find_step = true;
                    }

                }
            }
        }

        if (!find_step) {
            //проверка строк матрицы
            k = 0;
            for (int i = 0; i < map.length; i++) {
                k = 0;
                if (find_step) break;
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] == symb) k++;
                    else k = 0;
                    if (k == DOTS_TO_WIN - 1) {
                        //проверка пусто ли след. ячейка
                        if (isCellValid(j + 1,i )) {
                            xy[0] = j + 1;
                            xy[1] = i;
                            xy[2] = 1;
                            find_step = true;
                        } else if (isCellValid(j - k,i)) {
                            xy[0] = j - k;
                            xy[1] = i;
                            xy[2] = 1;
                            find_step = true;
                        }

                    }
                    if (find_step) break;
                }

            }
        }

        if (!find_step) {
            //проверка столбцов матрицы
            for (int i = 0; i < map.length; i++) {
                k = 0;
                if (find_step) break;
                for (int j = 0; j < map.length; j++) {
                    if (map[j][i] == symb) k++;
                    else k = 0;
                    if (k == DOTS_TO_WIN - 1) {
                        //проверка пусто ли след. ячейка
                        if (isCellValid( i,j+1)) {
                            xy[0] = i;
                            xy[1] = j + 1;
                            xy[2] = 1;
                            find_step = true;
                        } else if (isCellValid( j,i - k)) {
                            xy[0] = j;
                            xy[1] = i - k;
                            xy[2] = 1;
                            find_step = true;
                        }
                    }
                    if (find_step) break;
                }
            }

        }
        return xy;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        int[] xy = {0, 0, 0};
        do {
            xy = getNextStep(DOT_X);
            if (xy[2] > 0) {
                x = xy[0];
                y = xy[1];
            } else {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            }

        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isSizeValid(int x) {
        return x > 0;
    }

    public static boolean isDotsToWinValid(int x) {
        return x <= SIZE;
    }

    public static void initMap() {
        do {
            System.out.print("Введите размер матрицы:");
            SIZE = sc.nextInt();
        } while (!isSizeValid(SIZE));

        do {
            System.out.print("Введите количество фишек для победы:");
            DOTS_TO_WIN = sc.nextInt();
        } while (!isDotsToWinValid(DOTS_TO_WIN));


        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

