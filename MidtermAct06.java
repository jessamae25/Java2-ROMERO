import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct06
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		terminal.setCursorPosition(1, 1); //x=1, y=1
		terminal.putCharacter('X');
		terminal.setCursorPosition(2, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(3, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(4, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(5, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(6, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(7, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(8, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(9, 1);
		terminal.putCharacter('X');
		terminal.setCursorPosition(10, 1);
		terminal.setCursorPosition(1, 2); //x=1, y=1
		terminal.putCharacter('X');
		terminal.setCursorPosition(2, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(3, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(4, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(5, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(6, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(7, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(8, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(9, 2);
		terminal.putCharacter('X');
		terminal.setCursorPosition(10, 2);
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
