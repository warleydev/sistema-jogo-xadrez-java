package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Digite a posição de ORIGEM: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Digite a posição de DESTINO: ");
            ChessPosition target =  UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMovie(source, target);
        }
    }
}
