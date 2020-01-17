import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct07
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int j,m;
		for(j=1;j<21;j++){
			terminal.setCursorPosition(j,1);
			terminal.putCharacter('X');
		}for (m=1;m<21;m++){
			terminal.setCursorPosition(m,1);
			terminal.putCharacter('X');
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
