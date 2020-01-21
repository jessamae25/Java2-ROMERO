import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct07
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int r,c;
		for (r=1;r<21;r++){
			terminal.setCursorPosition(1,r);
			for (c=1;c<21;c++){
				terminal.putCharacter('X');
		}
			System.out.println();
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
