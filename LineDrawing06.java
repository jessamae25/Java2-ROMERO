import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int num;
		int length = 1;
		terminal.enterPrivateMode();
		for(int i=1;i <= 20;i=i+2){
			num=(length/2) + (length%2);
			for(int j=1;j <= length;j=j+1){
				terminal.setCursorPosition(11-j,i);
				if(11-j <= 10-length+num){
					terminal.putCharacter('X');
				}
				else{
				terminal.putCharacter('Y');
				}
			}
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(9+j,i);
				if(11-j <= 10-length+num){
					terminal.putCharacter('X');
				}
				else{
				terminal.putCharacter('Y');
				}
			}
			terminal.setCursorPosition(10-length,i+1);
			terminal.putCharacter('/');
			terminal.setCursorPosition(10+length,i+1);
			terminal.putCharacter('\\');
			terminal.setCursorPosition(10,i+1);
			terminal.putCharacter('|');
			terminal.setCursorPosition(25,11);
			terminal.putCharacter('M');
			terminal.setCursorPosition(26,11);
			terminal.putCharacter('e');
			terminal.setCursorPosition(27,11);
			terminal.putCharacter('r');
			terminal.setCursorPosition(28,11);
			terminal.putCharacter('r');
			terminal.setCursorPosition(29,11);
			terminal.putCharacter('y');
			terminal.setCursorPosition(31,12);
			terminal.putCharacter('C');
			terminal.setCursorPosition(32,12);
			terminal.putCharacter('h');
			terminal.setCursorPosition(33,12);
			terminal.putCharacter('r');
			terminal.setCursorPosition(34,12);
			terminal.putCharacter('i');
			terminal.setCursorPosition(35,12);
			terminal.putCharacter('s');
			terminal.setCursorPosition(36,12);
			terminal.putCharacter('t');
			terminal.setCursorPosition(37,12);
			terminal.putCharacter('m');	
			terminal.setCursorPosition(38,12);
			terminal.putCharacter('a');
			terminal.setCursorPosition(39,12);
			terminal.putCharacter('s');
			terminal.setCursorPosition(40,12);
			terminal.putCharacter('!');			
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();

	}
}
