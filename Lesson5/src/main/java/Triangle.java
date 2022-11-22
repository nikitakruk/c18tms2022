import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        char[][] drawingBoard = new char[4][4];
        for (int i = 0; i < drawingBoard.length; i++) {
            Arrays.fill(drawingBoard[i], '*');
            System.out.println(Arrays.toString(drawingBoard[i]));
        }

        triangle(drawingBoard, 'a');
        triangle(drawingBoard, 'b');
        triangle(drawingBoard, 'k');
        triangle(drawingBoard, 'd');
        triangle(drawingBoard, 'c');


    }

    private static void triangle(char[][] board, char type) {
        switch (type) {
            case 'a':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'd':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Что-то не так.");
        }
        System.out.println();
    }


}
